// Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
//A-Excellent
//B-Good
//C-Average
//D-Deficient
//F-Failing
import java.util.Scanner;

public class Questin8 {

    public static String gradeMeaning(Character grade) {
        int k;
        if (grade.equals('A')) {
            k = 1;
        } else if (grade.equals('B')) {
            k = 2;
        } else if (grade.equals('C')) {
            k = 3;
        } else if (grade.equals('D')) {
            k = 4;
        } else if (grade.equals('F')) {
            k = 5;
        } else {
            k = 6;
        }

        String meaning = "";
        switch (k) {
            case 1:
                meaning = "Excellent";
                break;
            case 2:
                meaning = "Good";
                break;
            case 3:
                meaning = "Average";
                break;
            case 4:
                meaning = "Deficient";
                break;
            case 5:
                meaning = "Failing";
                break;
            case 6:
                meaning = "Wrong Input";
                break;
        }
        return meaning;
    }

    public static void main(String[] args){
        System.out.print("Please input a mark:");
        Scanner input = new Scanner(System.in);
        char mark = input.next().charAt(0);
        input.close();
        System.out.println(gradeMeaning(mark));
    }
}
