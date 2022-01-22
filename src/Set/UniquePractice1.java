package Set;

import java.util.*;

public class UniquePractice1 {

    public static void main(String[] args) {

        String[] letters = {"a", "b", "c", "d", "d"};

        // Store these elements in to a set

        // convert Array to List >> List to Set

        List listOfLetters = Arrays.asList(letters);
        // ListOfLetters.add("t");

        System.out.println(listOfLetters);
        TreeSet setOfLetters = new TreeSet(listOfLetters);

        setOfLetters.add("x");
        setOfLetters.add("t");
        System.out.println(setOfLetters);

        HashSet set = new HashSet(Arrays.asList(letters));

        String[] letters1 = {"a", "a", "b", "c", "d","d","t","t","a"};

        // show/print duplicate elements

        HashSet<String> hashSet = new HashSet<>(); for (String letter : letters1) {
            if (hashSet.add(letter)) {
                System.out.println("This is repeating element" + letter);
                // duplicateStorage.add(letter);                         RED!?!? ----------------------
            }
        }
        System.out.println(hashSet);
        // System.out.println(duplicateStorage);
    }
}