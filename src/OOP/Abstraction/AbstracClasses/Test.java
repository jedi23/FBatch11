package OOP.Abstraction.AbstracClasses;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // Student student = new Student();   you cannot create object from abstract class
        Map map = new LinkedHashMap();

        Student student = new OnlineStudent();

        OnlineStudent student1 = new OnlineStudent();
    }
}
