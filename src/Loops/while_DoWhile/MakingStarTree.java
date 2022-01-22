package Loops.while_DoWhile;

import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {
              /*
                 -Ask user to provide a number between 3 to 10
                 - make a star tree for that many line
                 (Use Do-While Loop to implement solution)
                 ex: input --> 4
                  *
                  **
                  ***
                  ****
               */
        Scanner scannner = new Scanner(System.in);
        System.out.println("please enter a number between 3 and 10");
        int num = scannner.nextInt();
        int x = 0;
        String str = "*";
            do{
                System.out.println(str);
                str+="*";
                x++;
            }while(x<num);
    }
}
