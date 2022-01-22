package PrimitiveTypes;

public class RemainderPractice2 {
    public static void main(String[] args) {
        // find the product of digits from given number
        // 456 ==> 4 * 5 * 6 = 120 sout("The product is = "+<product>
        int myNum1 = 4;
        int myNum2 = 5;
        int myNum3 = 6;
        int sum = myNum1*myNum2*myNum3;
        System.out.println(sum);

        int num =456;
        int d1 = num%10;
        num = num/10;

        int d2 = num % 10;
        num= num/10;

        int d3 = num %10;

        int product = d1 * d2 * d3;
        System.out.println("The product is= "+d1 * d2 * d3);
        System.out.println("The Product is= " +product);

    }
}
