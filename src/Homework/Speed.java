package Homework;
import java.util.Scanner;
public class Speed {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter current speed");
            int current=input.nextInt();
            System.out.println("Enter target speed");
            int target=input.nextInt();
            int second=0;
            while(current<=target){
                current+=10;
                second++;
            }System.out.println(second);
        }
    }
