package Loops.while_DoWhile;

import java.util.Scanner;

public class MultiplicationPractice {
    public static void main(String[] args) {
        // ask user to provide a whole integer number
        // create a multiplication table from 1 to 10 from the given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole integer number");
        int multiplier = scanner.nextInt();
        int num = 1;
        while(num<11){
            System.out.println(multiplier+ " * "+num +" = " +multiplier*num);
            num++;
        }
    }
}
