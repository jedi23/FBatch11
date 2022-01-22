package String;

public class Methods6
{
    public static void main(String[] args) {
        String name = "   Techtorial Academy is located in Des plaines    ";

        // trim() --> will remove spaces before and after string

        String updatedName = name.trim(); // click and hold CTRL then hover over method to see the return type
        System.out.println(updatedName);
        System.out.println(name);

        // "Techtorial Academy"
        // substring(); --> it will return part of the String/cut the string in part
        // name.subString(4); --> torial Academy
        // name.subString(4,6); --> to
        String part1 = updatedName.substring(4);
        System.out.println(part1);

        String part2 = updatedName.substring(4,12); // char/symbol of 1st index is included
                                                    // char/symbol of 2nd index is not included
                                                    // in the substring
        System.out.println(part2);
    }
}
