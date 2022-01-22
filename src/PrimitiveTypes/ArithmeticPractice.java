package PrimitiveTypes;

public class ArithmeticPractice {
    public static void main(String[] args) {
        // addition ---> +
        int num1 = 3;
        int num2 = 4;
        System.out.println(num1+num2);
        System.out.println("Total is:"+(num1+num2));

        int sum = num1 + num2;
        System.out.println(sum);

        // subtraction ---> -
        int difference;
        difference = 10 - num2;
        System.out.println("difference is= "+ difference);

        //multiplication ---> *

        double product = difference * num2;
        System.out.println(product);  //output is 24.0 because of double data type

        //division ---> /

        double division = product / 3.0; // can be either 3 or 3.0 because of double assignment

        System.out.println(division);

        product = product * division;
        System.out.println(product);

        int division2 = 17/2;
        System.out.println(division2); // will only get 8 because of int data type assignment

        double division3 = 5/2;
        System.out.println(division3);

        float division4 = 5/2f;
        System.out.println(division4);

        //remainder ---> left over ---> % (Modulus)

        int a = 11;
        int b = 5;
        int remainder1 = a % b;
        System.out.println(remainder1);

int x = 13;
int y = 5;

int remainder2 = x % y;
        System.out.println(remainder2); //output will be 3

        System.out.println(25%21);  // 4

        System.out.println();

        // casting, will work on later

    }
}
