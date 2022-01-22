package Loops.while_DoWhile;

import java.util.Scanner;

public class LettersFromString {

    public static void main(String[] args) {

        // get a string from user and print out every letter from given string
        // separated by comma

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scanner.nextLine();

        int i = 0;
        while(i<str.length()){
            System.out.print(str.charAt(i)+", ");  // remove ln from sout and will print out next to each other
            i++;                                     // instead of vertical printout
        }
        // print those letters in reverse order
        System.out.println();
        int lindex = str.length()-1;
        while(lindex>=0){
            System.out.print(str.charAt(lindex)+", ");
            lindex--;
        }
    }
}
