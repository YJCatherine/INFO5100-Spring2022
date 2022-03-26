package Midterm;

import java.util.HashSet;
import java.util.Set;

public class Question6 {
    //Question6:
    public int longestSubstring(String s){
        if(s == null || s.isEmpty()){
            return 0;
        }

        if(s.trim().isEmpty() || s.length() == 1){
            return 1;
        }

        Set<Character> chars = new HashSet<>();
        int start = 0;
        int end = 0;
        int cur = 0;
        int max = 0;

        while(end < s.length()){
            char c = s.charAt(end);
            if(!chars.contains(c)){
                chars.add(c);
                end++;
                cur++;
            }else{
                if (cur > max){
                    max = cur;
                }
                chars.remove(s.charAt(start));
                cur = chars.size();
                start++;
            }
        }

        if(cur > max){
            max = cur;
        }
        return max;
    }
}
