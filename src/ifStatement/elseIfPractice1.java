package ifStatement;

import java.util.Scanner;

public class elseIfPractice1 {
    public static void main(String[] args) {
        /*
        get three test results from user and calculate the average of those 3 tests
        test scores should be in range of 0 to 100
        based on the average score:
        print out letter grade for this student
        average is between--> 100-90 --> your letter grade is A
        average is between--> 89-80 --> your letter grade is B
        average is between--> 79-60 --> your letter grade is C
        average is --> less than 60 --> you need to take the test again
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st score");
        int score1 = sc.nextInt();
        System.out.println("Enter 2nd score");
        int score2 = sc.nextInt();
        System.out.println("Enter 3rd score");
        int score3 = sc.nextInt();
        int average = (score1+score2+score3)/3;

        if(average<=100 && average >= 90){
            System.out.println("Your letter grade is A");
        }else if(average<=89 && average >=80) {
            System.out.println("Your letter grade is B");
        }   else if(average<=79 && average >=60){
                System.out.println("Your letter grade is C");
        }   else if(average<60){
            System.out.println("You need to take the test again");
        }
    }
}
