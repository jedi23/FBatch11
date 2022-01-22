package SwitchStatement;

import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {
        /*
        get a number between 1 to 4 from user
        and print out name of a season as:
        1. --> Winter
        2. --> Spring
        3. --> Summer
        4. --> Fall
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 4: 1 for Winter, 2 for Spring, " +
                "3 for Summer or 4 for Fall");
        int season = scanner.nextInt();
        switch (season) {
            case 1:                           // entering a letter will break the code, gives an error
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Fall");
                break;
            default:
                System.out.println("You have entered and invalid number, please enter 1 - 4");
        }
    }
}
