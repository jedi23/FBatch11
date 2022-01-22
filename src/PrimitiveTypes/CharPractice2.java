package PrimitiveTypes;

//import java.util.Scanner;

public class CharPractice2
{
    // We will ask user to enter a letter
    // abcdefghijklmnopqrstuvwxyz

    // If user enters char that is not an English letter
    // code should print false
    // If user enters English letter code should print true

    public static void main(String[] args)
    {
        // ASCII Table
        // the table that all chars has a unique value
        // char a = 97; the same as below line
        // char s2 = 'a';
        // if the value of the char between char a and char z
        // it means this char is a letter

        System.out.println("please enter English Letter");
        char ch = '1';  // changing this value will determine result of either true or false
        // is this a letter or not
        boolean isLetter = ch >='a'&& ch <= 'z' || ch>='A'&&ch<='Z';
        System.out.println(isLetter);

    }
}
