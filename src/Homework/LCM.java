package Homework;

import java.util.Scanner;

public class LCM {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number 1");

            int num1 = scanner.nextInt();
            System.out.println("Enter the number 2");
            int num2 = scanner.nextInt();

            int hcf=1;
            for(int i = 1; i <= num1 && i <= num2; i++)
            {
                if(num1%i==0 && num2%i==0)
                    hcf = i;
            }
            System.out.println((num1*num2)/hcf);
        }
    }
