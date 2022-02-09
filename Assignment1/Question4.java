// Question 4: Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
import java.util.Arrays;

public class Question4 {
    static boolean judgeAnagram(String word1, String word2)
    {
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        int l1 = str1.length;
        int l2 = str2.length;

        if (l1 != l2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < l1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;


    }

    public static void main (String[] args) {
        String word1 = "jjddhsna";
        String word2 = "ksjebbbs";
        if (judgeAnagram(word1, word2)){
            System.out.println(word1+" and "+word2 +" are Anagrams.");
        }else {
            System.out.println(word1+" and "+word2 +" are not Anagrams.");
        }
    }

}
