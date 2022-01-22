package Mentoring;

public class Methods {

    public static void Methods(){
        System.out.println("This is doable");

    }

    public static void main(String[] args) {
        Methods();
        // Every time you crate an object it calls the constructor
        // Constructor is a method without a return type with class name
        // We cannot make the constructor static.
        Methods methods = new Methods();
        Methods methods1 = new Methods();
        System.out.println(methods.equals(methods1));
        //
        System.out.println(methods==methods1);
        //  == sign it looks for where object is pointed
        //  Using a new keyword creates a new pointer
        //  Pointing means with which object is saved into memory
        //  It also looks for value of the both objects
        //  Equals method looks for value of object only

    }
}
