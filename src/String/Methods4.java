package String;

import java.util.Locale;

public class Methods4
{
    public static void main(String[] args) {
        String text = "Selenium";
        // contains(); it will check if String has given value or not
        // returns true/false
        boolean result1 = text.contains("le");
        System.out.println(result1); // true
        System.out.println(text.contains("t")); // false
        System.out.println(text.contains("selenium")); // false
        System.out.println(text.contains("1"));
        System.out.println(text.contains("ium"));

        // equals(); it will check if the given string has exactly same order of char
        // then will return true/false

        System.out.println(text.equals("Selenium")+" : equals method"); // true
        System.out.println(text.equals("nium")); // false
        System.out.println(text.equals("selenium")); // false

        // equalsIgnoreCase();

        System.out.println(text.equalsIgnoreCase("SELeniuM")+" : equalsIgnoreCase"); // true
        String text2 = "Java";
        System.out.println(text.equalsIgnoreCase(text2)); // false
        String text3 = "SELENIUM";
        boolean result2 = text3.equalsIgnoreCase(text);
        System.out.println(result2);
        text3.concat(text);
        text3.toLowerCase();

        text = text3; // so now value of text will be whatever value of text3 is
        System.out.println(text3.equals(text)); // true because of reassignment


    }
}
