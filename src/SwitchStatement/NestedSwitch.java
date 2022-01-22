package SwitchStatement;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*
        1. IT Dept
        David, Tima
        2. Admin
        Alex, Jessi
        3.Customer Care
        Zack, Ana, John
         */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like IT, Admin or Customer Care?");
        String dept = scanner.nextLine().toLowerCase();

        switch (dept){
            case "IT":
                System.out.println("IT");
            System.out.println("Who would u like to speak with? David or Tima?");
            String itperson = scanner.nextLine().toLowerCase();
                switch (itperson){
                    case "David":
                        System.out.println("David is on the phone.");
                        break;
                    case "Tima":
                        System.out.println("Tima is on the phone.");
                        break;

                } case "Admin":
                System.out.println("Choose Alex or Jessi?");
                String admin = scanner.nextLine();
                switch(admin){
                    case "Alex":
                        System.out.println("Alex is on the phone.");
                    case "Jessi":
                        System.out.println("Jessi on on the phone.");
                }
        }

    }
}
*/
Scanner scanner = new Scanner(System.in);
        System.out.println("Which dept IT=n1, Admin=n2 or Customer Care=n3?");
        int dept = scanner.nextInt();
        switch (dept){
            case 1:
                System.out.println("David or Tima");
                scanner = new Scanner(System.in);
                        String name = scanner.nextLine().toLowerCase();
                switch (name){
                    case "david":
                        // want to differ morning and afternoon
                        int hour = LocalDateTime.now().getHour()+10;
                        System.out.println(hour);
                        if(hour > 8 && hour < 12){
                            System.out.println("I am still sleeping.");
                        }else if(hour > 12 && hour < 17){
                            System.out.println("Hello this is David");
                        }else {
                            System.out.println("This is not a good time.");
                        }
                        System.out.println("David is on the phone");
                        break;
                    case "tima":
                        System.out.println("Tima is on the phone");
                        break;
                    default:
                        System.out.println("We don't have "+ name);
                        break;
                }break;
            case 2:
                System.out.println("Alex or Jessi");
                scanner = new Scanner(System.in);
                String name1 = scanner.nextLine().toLowerCase();
                switch (name1){
                    case "alex":
                        System.out.println("Alex is on the phone");
                        break;
                    case "jessi":
                        System.out.println("Jessi is on the phone");
                        break;
                    default:
                        System.out.println("We don't have "+ name1);
                        break;
                }break;
            case 3:
                System.out.println("You have reached Customer Care, Zack, Ana or John");
                scanner = new Scanner(System.in);
                String name2 = scanner.nextLine().toLowerCase();
                switch (name2){
                    case "zack":
                        System.out.println("Zack is on the phone");
                        break;
                    case "ana":
                        System.out.println("Ana is on the phone");
                        break;
                    case "john":
                        System.out.println("John is on the phone");
                        break;
                    default:
                        System.out.println("We don't have "+ name2);
                        break;
                }break;
            default:
                System.out.println("Your selection is invalid for the dept.");
                break;
        }
    }
}
