package ifStatement;

import java.util.Scanner;

public class ifPractice2 {
    public static void main(String[] args) {
        // assume that user is using military style time 1- 24
        // print out good morning or good afternoon
        // for the hours of morning or afternoon
        // ask user to enter only hour for the time
        // if the hour is < 12 print good morning
        // if the hour is > 12 < 18 print good afternoon
        // if the hour is > 18 print good evening
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  hour as 1 - 24");
        int hour = scanner.nextInt();
        if (hour < 12 && hour >= 0) {
            System.out.println("Good Morning :)");
        }
        if (hour >= 12 && hour < 18) {
            System.out.println("Good Afternoon :)");
        }
        if (hour >= 18 && hour <= 24) {
            System.out.println("Good Evening :)");
        }
        if(hour < 0 || hour >23){
            System.out.println("check your time");
        }
    }
}
