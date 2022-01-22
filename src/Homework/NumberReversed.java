package Homework;
import java.util.Scanner;
public class NumberReversed {
        public static void main(String[] args) {
            System.out.println("Enter a number");

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int reversed = 0;
            while( num!=0){
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            System.out.print(reversed + "");
        }
    }
