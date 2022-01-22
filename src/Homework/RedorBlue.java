package Homework;
import java.util.Scanner;
public class RedorBlue {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a string value");
            String word=input.nextLine();
            if(word.toLowerCase().contains("r") && word.toLowerCase().contains("e") && word.toLowerCase().contains("d")
                    || (word.toLowerCase().contains("red"))){
                System.out.println("red");
            }
            if(word.toLowerCase().contains("b")&&word.toLowerCase().contains("l")&&word.toLowerCase().contains("u")
                    &&word.toLowerCase().contains("e")||word.contains("blue")){
                System.out.println("blue");
            }
        }
    }