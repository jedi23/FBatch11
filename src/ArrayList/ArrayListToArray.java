package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Dima");
        names.add("Diana");
        names.add("Aizat");
        names.add("Samir");

        System.out.println(names);

        // convert this ArrayList to Array

        Object[] arrayNames = names.toArray();

        System.out.println(Arrays.toString(arrayNames));

        arrayNames[arrayNames.length] = "Alex";
        System.out.println(Arrays.toString(arrayNames));



    }

}
