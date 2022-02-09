// Question 5:  Write a program to determine whether the year is a leap year or not.
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Plese input the year:");
        int year=scan.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.print(year+" is the leap year!");
        }else if(year%400==0){
            System.out.print(year+" is the leap year!");
        }else {
            System.out.print(year+" is not the leap year.");
        }
        scan.close();
    }
}
