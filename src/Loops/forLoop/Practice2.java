package Loops.forLoop;

public class Practice2 {
    public static void main(String[] args) {
        // print out numbers between 0 to 5 decreasing by using for loop
        // 5, 4, 3, 2, 1, 0

    //    for (int num = 5; num >= 0; --num) {
    //        System.out.println(num);
    //    }
        // find the total of numbers between 1 to 5 by using for loop
        int sum = 0;
        for (int num = 1 ; num<5 ; num++){
            sum += num;
            System.out.println("Total: " +sum);
        }
        System.out.println("Final Total: " +sum);
    }
}