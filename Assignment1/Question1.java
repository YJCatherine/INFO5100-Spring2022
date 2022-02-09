// Question 1: Write a program find if String is Palindrome?
import java.util.Scanner;

public class Question1 {

    public static boolean judgePalindrome(String text) {
        if (text == null) {
            return false;
        }

        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }

        }
        return true;
    }

    public static void main (String[] args) {
        System.out.print("Please input a string:");
        Scanner input = new Scanner(System.in);
        String tmp = input.nextLine();
        input.close();
        if (judgePalindrome(tmp)) {
            System.out.println(tmp + " is Palindrome.");
        } else {
            System.out.println(tmp + " is not Palindrome.");
        }
    }
}
