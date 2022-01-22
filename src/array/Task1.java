package array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        ask user, how many names that s/he wants to store in array
        store those names by getting it from user in to array that is called 'names'
        print them out by using -->Arrays.toString(); method
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do u want to store");
        int num = scanner.nextInt();
        String[] names = new String[num];

        scanner = new Scanner(System.in);

        for (int i=0; i<num; i++){
            System.out.println("enter " + (i+1) + " name");
            names[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(names));

    }
}
