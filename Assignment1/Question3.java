// Question 3. Write a program to check if string contains duplicates

import java.util.Scanner;

public class Question3 {
    public static boolean judgeDuplicate(String str) {
        if (str == null){
            return true;
        }

        int[] flag=new int[128];
        for (int i = 0; i < str.length(); i++)
        {
            int c=(int)(str.charAt(i));
            if (flag[c]>0) {
                return false;
            }
            else {
                flag[c]++;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print("Please input a string:");
        Scanner input = new Scanner(System.in);
        String tmp = input.nextLine();
        input.close();
        if (judgeDuplicate(tmp)){
            System.out.println(tmp+" does not contain duplicates.");
        }else {
            System.out.println(tmp+" contains duplicates.");
        }

    }
}
