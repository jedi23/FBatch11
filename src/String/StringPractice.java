package String;

import java.util.Scanner;

public class StringPractice
{

    public static void main(String[] args) {

        // We will ask user to enter their fisrt name
        // We will ask user to enter their last name
        // We will print firstName in lower case
        // last name in upper case in the same line

        //Interview Question: If we don't reassign the string
        // it will not change it's value

        String str = "fernando";
        str.toUpperCase();
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        String firstName = scanner.nextLine();
        System.out.println("enter last name");
        String lastName = scanner.nextLine();

        // when we use nextLine it can take mulitple words
        // when we use next it will only take 1 word
        // If I apply method in print out parenthesis it will
        // print the values with method applied

        System.out.println(firstName.toLowerCase()+" "+lastName.toUpperCase());

    }
}
