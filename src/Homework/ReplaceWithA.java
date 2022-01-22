package Homework;
import java.util.Scanner;
public class ReplaceWithA {
        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("Enter a string value");
            String value=input.nextLine();
            int index=1;
            String a="a";
            while(index<=value.length()){
                value=value.substring(index);
                value=a+value;
                index++;
                a +="a";
                System.out.println(value);
            }
        }
    }
