package PrimitiveTypes;

import java.sql.SQLOutput;

public class CharPractice {
    public static void main (String[] args)
    {
        char ch1 = 'A';
        System.out.println(ch1);

        System.out.println("A");

        System.out.println('A');

        ch1= '5';  // reassignment
        System.out.println(ch1);

        System.out.println(ch1*2);
     //because ch1 is a char '5' according to ASCII table char 5 is = decimal 53
        // that's why output is 106 when code is run
        char ch2 = ch1;
        System.out.println(ch2);
        // out put is 5 because of reassignment of ch1

        char ch3 = '&';
        System.out.println(ch3);

        char ch4= 80;  // char 80 = P in the ASCII Table for its char value and vice versa
        System.out.println(ch4); // will output P
        //char ch5 'ye'; you cannot assing(assign)lol! more than one character in single quotation mark

        int number = '9';
        int numberChar = 'T';
        System.out.println(numberChar);

        char randomChar = 2345;
        System.out.println(randomChar);


    }
}
