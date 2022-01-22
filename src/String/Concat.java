package String;

public class Concat
{

    public static void main(String[] args) {

        String number= "1";
        number +="2";
        number +=2;
        System.out.println(number); // 122 is the outcome

        // String has build methods/functions you can by using your variables

        String test = "Chicago";

        test = test.concat(" is the Best"); // Chicago is the Best
        test = test.concat(" in the Summer");  // Chicago is the Best in the Summer
        System.out.println(test);

        test += test.concat(" EVER!");
        System.out.println(test);
    }
}
