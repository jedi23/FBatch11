package PrimitiveTypes;

public class CastingPractice
{

    public static void main(String[] args) {

        int number1 = 23;
        long l1 = number1;  // implicit casting happens by Java automatically

        short sh1 = (short)number1;  // explicit casting we are asking Java to convert with parentheses command

        byte by1 = 1;
        byte by2 = 2;
        // short sum1 = by1 + by2; will not compile, compile time error (due to numeric promotion
        // Java wants to store the result into larger data type (int). That's why it is not compiling.

        short sum2 = (short)(by1 + by2);  // explicit casting
        // short sum3 = (short) by1 + (short) by2; // cannot do this because it's just converting by's but not asking
        // Java to change into short with explicit command. This is still individual casting for each variable
        // result is not casted yet...

        int price = (int)750.99;
        System.out.println(price);

        double samsung = 900.45;

        int priceSamsung = (int)samsung;
        System.out.println("Samsung --> "+samsung);
        System.out.println("Price Samsung in int --->"+priceSamsung);

    }
}
