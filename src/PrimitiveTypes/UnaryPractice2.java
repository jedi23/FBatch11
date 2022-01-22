package PrimitiveTypes;

public class UnaryPractice2
{

    public static void main(String[] args) {

        int a = 7;
        int b = 4;

        int result = --a + --b + a++ * 2 - b++ * a--;

        System.out.println(a);
        System.out.println(b);
        System.out.println(result);
        // 6 + 3 + 6 * 2 - 3 * 7
        // 6 + 3 + 12 - 21
        // 21 - 21 = 0

        int donut = 2;
        int dozen = donut * 12;

        System.out.println("Krispy Kreme 1 Dozen with $1 off today :) $"+dozen);
        int dozenCost = --dozen;
        System.out.println(dozenCost);

        // or

        int donut2 = 2;
        int dozen2 = donut2 * 12;

        System.out.println("Dunkin Donuts 1 Dozen you get $1 off Next Time :) $"+dozen2);
        int dozenCost2 = dozen2--;
        System.out.println(dozenCost2);

        int donutNumber = 12;
        int eachDonut = 2;

        int total = donutNumber * eachDonut;
        System.out.println("DD: $ "+total); // DD

        System.out.println("KK: $ "+ --total);

        char ch = 'a';
        System.out.println(--ch);
        System.out.println(ch);
        System.out.println(ch++);
        ch++;
        ++ch;
        System.out.println(ch);
        System.out.println(--ch);



    }
}
