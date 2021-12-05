package ifStatement;

import java.util.Scanner;

public class NestedPractice1 {
    public static void main(String[] args) {
        // city, school, batch

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your city");
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase("Chicago")) {
            System.out.println("which course are you attending");
            String course = scanner.nextLine();
            if(course.equalsIgnoreCase("techtorial")) {
                System.out.println("Which batch are you in");
                String batch = scanner.nextLine();
                if (batch.equalsIgnoreCase("11")) {
                    System.out.println("It si getting easy");
                }else{
                    System.out.println("Congrats you already done!");
                }
            }else{
                System.out.println("We are in Des Plaines, please visit us");
            }
        } else {
            System.out.println("Please come to Chicago you will like it");
        }
    }
}