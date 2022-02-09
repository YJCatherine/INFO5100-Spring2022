//Question 6:Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
//Plus $ 0.60 per call for next 50 calls.
//Plus $ 0.50 per call for next 50 calls.
//Plus $ 0.40 per call for any call beyond 200 calls.
import java.util.Scanner;

public class Question6 {
    public static double telephoneBills(int calls) {
        int n;
        if (calls > 0 && calls <= 100) {
            n = 1;
        } else if (calls > 100 && calls <= 150) {
            n = 2;
        } else if (calls > 150 && calls <= 200) {
            n = 3;
        } else {
            n = 4;
        }

        double bills = 0;
        switch (n) {
            case 1:
                bills = 200;
                break;
            case 2:
                bills = 200 + (calls - 100) * 0.6;
                break;
            case 3:
                bills = 200 + 50 * 0.6 + (calls - 150) * 0.5;
                break;
            case 4:
                bills = 200 + 50 * 0.6 + 50 * 0.5 + (calls - 200) * 0.4;
                break;
        }
        return bills;
    }

    public static void main (String[] args){
        System.out.print("Please input the telephone call times:");
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        input.close();
        System.out.println(telephoneBills(times));
        }

}
