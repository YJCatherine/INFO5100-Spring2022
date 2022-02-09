// Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

public class Question7 {
    public static boolean canConstruct(String ran, String mag) {
        for(int i=0;i<ran.length();i++) {
            char ch = ran.charAt(i);
            String str = "" + ch;
            if(mag.contains(str)) {
                mag = mag.replaceFirst(str, "");
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        String ransomNote = "aac";
        String magazine = "acdfc";
        if (canConstruct(ransomNote, magazine)){
            System.out.println(ransomNote+" can be constructed from "+magazine);
        }else {
            System.out.println(ransomNote+" can not be constructed from "+magazine);
        }
    }

}
