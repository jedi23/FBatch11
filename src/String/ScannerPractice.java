package String;

import java.util.Scanner;

public class ScannerPractice
{
    public static void main(String[] args) {
        String name = "Fer";
        System.out.println("My name is "+ name);
        // creating scanner object
        Scanner input = new Scanner(System.in);

        // . is used to call methods from the Java library from that particular class
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();
        System.out.println(lastName);

        // Task: Ask user to enter his/her city name and print as:
        // "<name><lastName> you are living in <city>

        System.out.println("Please enter your city name");
        String city = input.nextLine();

        System.out.println(name+" "+ lastName+" you are living in "+city);

        System.out.println("Please enter your age");
        //String age = input.nextLine();
        int age = input.nextInt();
        System.out.println(name+", Nice Age: "+age);

        System.out.println("Please enter your height in feet and inches (i.e. 5.8");
        double height = input.nextDouble();
        System.out.println(" your height is: "+height);

        System.out.println("Please enter your address");
        // must reassign scanner to get code to execute properly to take in inputs
        // new Scanner(System.in); (or also) input.nextLine();
        input = new Scanner(System.in);
        String address = input.nextLine();
        System.out.println("Is this correct address you provided? "+address);




    }

}
