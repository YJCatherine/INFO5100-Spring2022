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
        public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while (j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0) + 1);
            
            if (map.size() == j - i + 1){
                max= Math.max(max, j - i + 1);
                j++;
            }else if (map.size() < j - i + 1){
                
                while (map.size() < j - i + 1){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    
                    if (map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }

    // Question 4
    public int[] sumZero(int n) {
        //TODO: Write your code here
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            result[i] = 2 + i;
            sum = sum + result[i];
        }
        result[n-1] = -sum;
            
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
