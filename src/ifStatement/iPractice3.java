package ifStatement;


import java.util.Scanner;

public class iPractice3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter just 1 word");
        String word = scanner.nextLine().toUpperCase();
        if (word.startsWith("M")) {
            System.out.println("Monday");}
            if (word.startsWith("T")) {
                System.out.println("Tuesday/Thursday");}
                if (word.startsWith("W")) {
                    System.out.println("Wednesday");}
                    if (word.startsWith("F")) {
                        System.out.println("Friday");}
                        if (word.startsWith("S")) {
                            System.out.println("Saturday/Sunday");}
                        if(!word.startsWith("M") && !word.startsWith("T") && !word.startsWith("W")
                && !word.startsWith("T") && !word.startsWith("F") && !word.startsWith("S")){
            System.out.println("There is no day");}
                        }
                    }