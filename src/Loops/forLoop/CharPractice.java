package Loops.forLoop;

public class CharPractice {
    public static void main(String[] args) {
        // print out lowercase alphabet

        for(char ch1 = 'a';ch1<='z';ch1++){
            System.out.print(ch1+ " ");
        }
        System.out.println();
        // only print out letters from z to a
        for(char ch1 = 'z' ; ch1>='a';ch1--) {
            System.out.print(ch1 + " ");
        }
    }
}
