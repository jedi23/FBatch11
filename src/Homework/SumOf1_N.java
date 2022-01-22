package Homework;
import java.util.Scanner;
public class SumOf1_N {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of terms of series :");
            int number = scanner.nextInt();
            double total = 0;
            for(int i = 1; i<=number; i++){

                total =total+(double)1/i;

            }
            System.out.println(total);
        }
    }