package Homework;
import java.util.Scanner;
public class FindingDad {
        public static void main(String[] args) {
            System.out.println("Enter a string value");
            //where the middle
            //'a' char can be any char otherwise please do not print anything.
// I am looking for two d chars , but there should be only one char between two d chars.
// d6d. first d's index is x second d's index is x+2
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();

// I should check all the chars in this string
// loop
// str.charAt(); -> To be able to use char at method we need an index number
//
            // i represents the index number
// Does index number has to be always smaller than length?
//Yes
// What is the biggest index number I used in the loop?
// i+2
// Always use condition
// biggestindexNumberYouUsedInLoop<LengthOfString
            int i = 0;
            while(i+2<str.length()){
                if(str.charAt(i)=='d' && str.charAt(i+2)=='d'){
                    System.out.println("dad");
                    break;
                }
                i++;
            }
        }
    }
