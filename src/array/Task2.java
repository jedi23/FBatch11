package array;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
         /*
        ask user, how many names that s/he wants to store in array
        store those names by getting it from user in to array
        if the name has 5 or more letters store it in an 'longNames' array
        if the name has less than 5 letters store it on 'shortNames' array
        print both arrays by using -->Arrays.toString(); method
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do u want to store");
        int num = scanner.nextInt();
        String[] longNames = new String[num];
        String[] shortNames = new String[num];

        scanner = new Scanner(System.in);

        for (int i=0; i<num; i++){
            System.out.println("enter " + (i+1) + " name");
            String name = scanner.nextLine();
            if(name.length() >= 5){

                longNames[i]= name;
                }else{
                    shortNames[i] = name;
                }
            }

            System.out.println(Arrays.toString(longNames));
            System.out.println(Arrays.toString(shortNames));



        }
    }
