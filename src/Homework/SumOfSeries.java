package Homework;
import java.util.Scanner;
public class SumOfSeries {
        public static void main(String[] args) {
            System.out.println("Enter the number of term");

            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int sum = 0, j = 1;
            for (int i = 1; i <= n; i++)
            {
                sum = sum + j;
                j = (j * 10) + 1;
            }

            System.out.println(sum);

        }
    }
