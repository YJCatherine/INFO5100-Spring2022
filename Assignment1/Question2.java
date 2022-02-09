// Question2: Write a program to check if a string has all unique characters.
import java.util.Scanner;

public class Question2 {
    public static boolean judgeUnique(String text) {
        char[] chars = text.toCharArray();
        if (chars == null) {
            return false;
        }

        for(int i = 0; i < chars.length; i++){
            for (int j = i+1; j < chars.length; j++){
                if (chars[i] == chars[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main (String[] args){
        System.out.print("Please input a string:");
        Scanner input = new Scanner(System.in);
        String tmp = input.nextLine();
        input.close();
        if (judgeUnique(tmp)){
            System.out.println(tmp+" is unique.");
        }else {
            System.out.println(tmp+" is not unique.");
        }
    }

}
