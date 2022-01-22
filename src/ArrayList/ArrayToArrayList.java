package ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {

        int[] numbers = {3,4,5,6};

        List<int[]> listNumbers = Arrays.asList(numbers);

        Integer [] numbers1 = {3,4,5,6};

        List<Number> listNumbers1 = Arrays.asList(numbers1);

        System.out.println(listNumbers1);

        // System.out.println(listNumbers1.add(7));  // UnsupportedOperationException

        for(int[] i : listNumbers) {
            System.out.println(Arrays.toString(i));
        }

    }
}
