package Final;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class Final {
    // Question 1
    public boolean isValid(String s) {
        //TODO: Write your code here
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char last = stack.pop();

                if ((last == '(' && curr != ')') ||
                    (last == '{' && curr != '}') ||
                    (last == '[' && curr != ']'))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    // Question 2
    public String compressString(String str){
        //TODO: Write your code here

        int length = str.length();

        if (length > 2) {
            String compressedText = "";
            char temp = str.charAt(0);
            int count = 1;

            for (int i = 1; i < length; i++) {
                if (str.charAt(i) == temp){
                    count++;
                }else {
                    compressedText += Character.toString(temp) + Integer.toString(count);
                    temp = str.charAt(i);
                    count = 1;
                }
            }
            compressedText += Character.toString(temp) + Integer.toString(count);

            if(compressedText.length() < length)
                return compressedText;
        }
        return str;
    }

    // Question 3
        public int lengthOfLongestSubstring(String s){
            //TODO: Write your code here
            if (s.length() == 0) {
                return 0;
            }

            Map<Character, Integer> lastseenMap = new HashMap<>();
            int[] longest = {0, 1};

            int start = 0;
            int end = 0;

            char ch = 0;
            while (end < s.length()) {
                ch = s.charAt(end);
                if (lastseenMap.containsKey(ch)) {
                    start = Math.max(start, lastseenMap.get((ch) + 1));
                }
                if (end + 1 - start > longest[1] - longest[0]) {
                    longest = new int[]{start, end + 1};
                }

                lastseenMap.put(ch, end);
                end++;
            }

            return longest[1] + longest[0];
        }

        // Question 4
        public int[] sumZero(int n) {
            //TODO: Write your code here
            int [] result = new int[n];
            int count = 0;
            int index = 0;
            if (n % 2 != 0){
                result[0] = 0;
                index++;
            }

            for (int i = 1; i < n / 2; i++){
                result[index++] = i;
                result[index++] = -i;
            }
            return result;
        }

        // Question 5
        public int findKthLargest(int[] nums, int k) {
            //TODO: Write your code here
            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((nums1,nums2) -> nums2-nums1);

            for (int i = 0; i < nums.length; i++){
                maxHeap.offer(nums[i]);
            }

            int result = -1;
            while (k-- > 0){
                result = maxHeap.poll();
            }
            
            return result;

        }
}
