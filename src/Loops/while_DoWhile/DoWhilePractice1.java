package Loops.while_DoWhile;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        // find and show sum of the numbers between 10 and 20 by using do-while loop

        int a = 10;
        int b = 20;
        int sum = 0;
        do {
            sum +=a;
            a++;
        }while( a <= b );                       // as long as this while is true continue to go back to (do) & execute
        System.out.println("Sum is: "+ sum);   // otherwise go down and finish
    }
}
