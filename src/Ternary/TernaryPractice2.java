package Ternary;

public class TernaryPractice2 {
    public static void main(String[] args) {

        int a = 3, b = 5, k = 7;

        // ternary using increments ++ / decrements --

        int r1 = a >= k ? a + k++ : ++b + k;
        System.out.println(r1); // 13
        System.out.println(b);
        System.out.println(k);

        int r2 = k < ++b ? 2 * ++k -2 : --k * 2 - 1;
        System.out.println(r2);  // 11
        System.out.println(k >= b ? "I got this" : false); // because k is 6 after comparison
                                                           // and b is 7 after previous execution
        System.out.println("test".equals("test") ? "TEST".toLowerCase() : 99);

        // String x = "test".equals("test") ? "TEST".toLowerCase() : 99 // error because of diff data types
        // but you can use it in println to show result...
    }
}
