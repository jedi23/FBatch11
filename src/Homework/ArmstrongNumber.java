package Homework;
import java.util.Scanner;
public class ArmstrongNumber {
        public static void main(String[] args) {
            System.out.println("Enter a number");

            Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();
            int temp, res, rem =0;

            temp=number;
            res=0;

            while(temp!=0) {
                rem=temp%10;
                temp=temp/10;
                res=res+(rem*rem*rem);
            }
            if(number==res){

                System.out.println(number + " is an Armstrong number");
            }else{
                System.out.println(number + " is not an Armstrong number");
            }

        }
    }
