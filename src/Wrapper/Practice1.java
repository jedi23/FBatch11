package Wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {

        byte b = 2;

        Byte bt = new Byte(b);

        System.out.println(bt);

        short s = 7;

        Short sh = new Short(s);
        System.out.println(sh);

        char c = 'a';
        Character ch = new Character('a');

       // Student st = new Student();
       // System.out.println(st);
       // Object.Car = new Object.Car("Honda");
       // System.out.println(car5);

        System.out.println(ch);

        Integer integer = new Integer(4);

        Float fl = new Float(3.4);
        Double db = new Double(4.5);
        Long lg = new Long(1234);

        Boolean bl = new Boolean(true);
        System.out.println(bl);
        Boolean bl1 = new Boolean("123");  // false
        System.out.println(bl1);

        int i = new Integer(22); // UnBoxing --> when Java converts Wrapper class object to primitive data

        Integer number = 3;  // Autoboxing --> when you store primitive data to Wrapper object

        System.out.println(number.toString().concat("random text"));
        // Student st = new Object.Student();  // why is Student RED!!! remove commentary signs ...
        // array
        int[] numbers = {i, number};

        System.out.println(number*25);
        Practice1 p = new Practice1();
        p.add(2);
    }
    public void add(Integer i){
        System.out.println(34-i);
    }

}
