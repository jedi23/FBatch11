package ifStatement;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {

        // passport
        // visa
        // ticket

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have passport? yes/no ");

        String passport = scanner.nextLine();

        if (passport.equalsIgnoreCase("yes")) {  // in order to get another string type double quotes "

            System.out.println("Do you have visa? yes/no ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {

                System.out.println("Do you have ticket? yes/or");
                if (scanner.nextLine().equalsIgnoreCase("yes")) {
                    System.out.println("Enjoy your flight to our country");

                } else {
                    System.out.println("Please get a ticket");
                }
            }else {              // end of 2nd if statement
                System.out.println("You need to get a visa");
            }
            }else {              // end of 1st if statement
                System.out.println("Please get a passport first");
            }
        }
    }