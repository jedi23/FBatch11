package String;

import java.util.Scanner;

public class PracticeChar
{

    public static void main(String[] args) {

     String device = "microphone";
     char ch = device.charAt(0);
        System.out.println(ch);
        char ch1 = device.charAt(4);
        System.out.println(ch1);

        System.out.println(device.charAt(9));

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a word");

        String word = input.next();
        System.out.println("This is your first letter of String: "+word.charAt(0));
// without storing incoming string value, taking a letter from it and print
        System.out.println("Please enter another word");
        System.out.println("!"+input.next().charAt(0));

    }
}
