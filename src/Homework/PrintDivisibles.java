package Homework;
import java.util.Scanner;
public class PrintDivisibles {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a starting number");
            int a=input.nextInt();
            System.out.println("Enter an ending number");
            int b=input.nextInt();
            int count=0;
            do{
                if(a%3==0 && a%5==0){
                    count++;
                }a++;
            }while(a<b);
            System.out.println(count);
        }
    }
