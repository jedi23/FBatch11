package String;

public class MethodChaining
{
    public static void main(String[] args) {
        String name = "          David    ";
        char letter = name.substring(5).substring(2).toUpperCase().replace("A","xxx")
                .trim().charAt(1);
        // cannot call on any other method because char is primitive
        System.out.println(letter);

       name = name.substring(5).substring(2).toUpperCase().replace("A","xxx")
                .trim();
        System.out.println(name);
        String n = name.substring(5).substring(2).toUpperCase().replace("a","xxx")
                .trim();
        System.out.println(n);

    }
}
