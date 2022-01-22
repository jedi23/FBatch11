package Homework;
import java.util.Scanner;
public class Substring {
        public static void main(String[] args) {
            System.out.println("Enter a string");
            Scanner input=new Scanner(System.in);
            String word=input.nextLine();
            int a=word.length();
            if(a>=3){
                System.out.println(word.substring(1,word.length()-1));
            }else if(a<3){
                System.out.println(word);}
        }
    }
