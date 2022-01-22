package Homework;
import java.util.Scanner;
public class LoopMultiplicationTable {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Please enter an integer number");
            int number=input.nextInt();
            int num=1;
            do{
                System.out.println( number+ " * " + num + " = "+(num*number));
                num++;
            }
            while(num<=10);
        }
    }
