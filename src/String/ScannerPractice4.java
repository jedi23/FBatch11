package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice4
{
    public static void main(String[] args) {

        // Ask user to enter an integer number   (Real Notes)
        // We will find out if this is an even number or not (Real Notes)
        // if input is 7 (Real Notes)
        // Output look 7 is even number false (Real Notes)
        // input is 8 (Real Notes)
        // Output is 8 is even number true   (Real Notes)

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer number");
//        int num = scanner.nextInt();
//        // if this remainder with 2 gives 0 this number is even (Real Notes)
//        // otherwise it's an odd number  (Real Notes)
//        boolean isEven = num%2 == 0;
//        System.out.println(num+" is even number "+isEven);

        // Ask user to enter two integer number (Real Notes)
        // First integer you provide should be bigger than 2nd number (Real Notes)
        // If 1st is bigger than 2nd one we will print out : true (Real Notes)
        // If 2nd num bigger than 1st num we will print out false (Real Notes)

//        System.out.println("Please enter your first integer number");
//        System.out.println("Please enter an integer but smaller than 1st one");
//
//        int firstNum = scanner.nextInt();
//        int secondNum= scanner.nextInt();
//
//        boolean isFirstBigger = firstNum>secondNum;
//        System.out.println(isFirstBigger);

        // To be able to graduate from school (Real Notes)
        // student needs  (Real Notes)
        // 85 % attendance (Real Notes)
        // 70% of homework (Real Notes)
        // create a program for teacher  (Real Notes)
        // teacher will enter all these variables and (Real Notes)
        // if student passes you will print true for teacher (Real Notes)
        // if student fails you will print false for teacher (Real Notes)

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter attendance %");
        int att = scanner.nextInt();

        System.out.println("enter grade %");
        int grade = scanner.nextInt();

        System.out.println("enter homework %");
        int homework = scanner.nextInt();

        // How can I print for all of them, assign boolean variables to all of them

        boolean isPass = att >= 85 && grade>= 80 && homework>= 70;
        System.out.println(isPass);






    }

}
