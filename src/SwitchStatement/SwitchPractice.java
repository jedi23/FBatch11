package SwitchStatement;

public class SwitchPractice {
    public static void main(String[] args) {

        int number = 2000;
        System.out.println("Before switch");
        switch(number){                                    // if no options available will just skip switch statement
            //default:
              //  System.out.println("This is default case");
            case 100:
                System.out.println("This is first case");
            case 110:
                System.out.println("This is second case");
            case 120:
                System.out.println("This is third case");
            case 123:                                      // will execute any code after it finds matching value
                System.out.println("This is fourth case");
                break;                                     // break; will stop any further code from executing
            case 130:
                System.out.println("This is fifth case");
            //default:
              //  System.out.println("This is default case");

        }
        System.out.println("After switch");  // this will also print because it's outside of the switch block
    }
}
