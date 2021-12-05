package ifStatement;

public class ifPractice
{
    public static void main(String[] args) {
        int appleNumber = 5;
        int orangeNumber = 10;
        // ==, >, < , !=, >=, <= can use these to compare

        System.out.println("I am about to create an IF block");

        if(appleNumber == orangeNumber){
            System.out.println("I am so lucky today!");
        }
        if (appleNumber != orangeNumber){
            System.out.println("I am so happy today");
        }
        if(appleNumber<=orangeNumber){
            int sum = appleNumber+orangeNumber;
            System.out.println("You have " + sum +" fruits");
        }
        // if you have multiple if statements they don't affect each other
        // you can have multiple if statements within 1 block
        System.out.println("if statements ... so far so good");

        if(orangeNumber < appleNumber){
            System.out.println(orangeNumber * appleNumber + " is in the false conditional " +
                    "if block. That is why it will not show on the console");
        }
        int num = 1234;
       // if(num) { // num is not a condition, that is why it will not compile
            System.out.println("Hello Universe");
        }
    }
