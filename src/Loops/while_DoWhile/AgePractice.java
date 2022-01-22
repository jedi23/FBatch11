package Loops.while_DoWhile;

import java.util.Scanner;

public class AgePractice {
    public static void main(String[] args) {
        /*
        'My age is 21'
        'My age is 22'
        ...
        '          26'
         */

        int age = 21;
        while(age<27){
          //  Scanner scanner = new Scanner(System.in);
          //  System.out.println("Enter age");
            System.out.println("My age is : "+age);
            age++;    // also can do age +=1; also can do age = age +1;
           // age +=1;
           // age = age +1;
        }
        //print out #'s between 10 and 20 inclusive
        int num = 10;
        while(num<=20){
            System.out.println("Numbers : "+num);
            num++;
        }
    }
}
