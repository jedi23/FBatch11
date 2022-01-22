package Homework;
import java.util.Scanner;
public class Concat {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter string 1");
            String word=input.nextLine();
            System.out.println("Enter string 2");
            String word1=input.nextLine();
//two string value
//if both string length is the same, concat two string together and
//print out
//if the length is not the same,omit last chars from longer string
//so it is the same length as shorter string.ater concat.the print out
            if(word.length()==word1.length()){
                System.out.println(word.concat(word1));
            }else if(word.length()>word1.length()){
                System.out.println(word.substring(0,word1.length())+word1);
            }
            else if(word1.length()>word.length()){
                System.out.println(word+word1.substring(0,word.length()));
            }
        }
    }
