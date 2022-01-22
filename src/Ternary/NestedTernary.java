package Ternary;

public class NestedTernary {
    public static void main(String[] args) {
        int num1 = 4, num2 = 5;

        // condition   ?     :

        String r1 = ++num1 >= num2 ? num1 < num2 ? "Java" : "Selenium" : "Nested";
        System.out.println(r1);  // result should Selenium

        String r2 = num1 < 1 ? num1 < num2 ? "Java" : "Selenium" : num1 < 1 ? "Summer" : "Winter";
        // num is 5
        System.out.println(r2); // result should be Winter

        System.out.println(1 != 1 ? "David" : 1 > 2 ? "Nested first side" : 3 == 4 ?
                "second side of first" : "second side of second");

    }
}
