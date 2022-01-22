package Blocks;

public class Practice {

    String lastName;
    String name;
    static String color;
// instance block runs for every object
// initialize instance variables
    {
        this.name = "Karol";
        name = "Joe";
        System.out.println("This is instance block");
    }
// static block runs before everything in the class
// initialize static variables
    static {
        color = "orange";
        System.out.println("This is STATIC block");
    }

    public static void main(String[] args) {
        Practice o = new Practice();
        Practice o1 = new Practice();
    }
}
