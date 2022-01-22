package SwitchStatement;

import java.util.Scanner;

public class SwitchPractice3 {
    public static void main(String[] args) {
      /*
      ==Task:==
      Ask user for his/her favorite fruit
      -you have: mango, banana, kiwi, orange, apple, grape
      if you have user's favorite fruit, --> We have your favorite fruit in our store
      -otherwise: Sorry, we don't have your favorite fruit :( :
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite fruit? Please enter the name.");
        String fruit = scanner.nextLine().toLowerCase();  // must include .toLowerCase() in order to match case value
        switch(fruit) {
            case "mango":
                System.out.println("We have your favorite fruit in out store");
                break;
            case "banana":
                System.out.println("We have your favorite fruit in out store");
                break;
            case "kiwi":
                System.out.println("We have your favorite fruit in out store");
                break;
            case "orange":
                System.out.println("We have your favorite fruit in out store");
                break;
            case "apple":
                System.out.println("We have your favorite fruit in out store");
                break;
            case "grape":
                System.out.println("We have your favorite fruit in out store");
                break;
            default:
                System.out.println("Sorry, we don't have your favorite fruit :(");
        }

    }
}
