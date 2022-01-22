package First;

public class VariablePractice {

  public static void main(String[] args) {

    int number1 = 6;
//    int number1 = 7; you cannot create a variable with same name more than once
    System.out.println(number1);
    number1 = 7; // reassignment(reasigning the value fir variable)
    System.out.println(number1);
// will provide new output of 7 because of new reassignment of value for number1
    int $number = 6;
    int number$ = 7;
    // int *number = 9; you can not start naming with *
    int _number = 9;
    int num$ber = 10;
    int number3 = 11;

    // int class = 12; class is a reserved keyword for Java

    // Task: create two int variable and print as :
    // My numbers are = <number1> and <number2>
    int MyFirstNumber = 23;
    int MySecondNumber = 21;
    System.out.println("My numbers are: " + MyFirstNumber + " and " + MySecondNumber);

    System.out.println("My crazy number is: " + 555);
    System.out.println("My crazy number is: " + 555);
    System.out.println("My crazy number is: " + 555);

    int a, b, c; // you can declare and initialize variable on the same line
    //if they have same data type
    int x = 1, y = 2, z = 3;
    //must be same variable type and use commas to be able to declare more than variable on 1 line.
  }
  }
