package First;

import java.util.Scanner;

public class Project2Task6 {
    public static void main(String[] args) {
    /* Project 2, Task 6
       Using a scanner enter three different ingredients for the product on the
       same line. Then ask the user to enter any int number. Change the first
       letter of the ingredients starting from the entered number. (Ingredients
       should start with different letters. Please read the example carefully )
              Please enter three ingredients with spaces:
       Example 1:
       Milk Peanuts Butter
       Please enter the int number: 5
       The output is: 5ilk 6eanuts 7utter
       Example 2:
       Sugar Cocoa Oil
       Please enter the int number: 3
       The output is: 3ugar 4ocoa 5il
     */
    Scanner input = new Scanner(System.in);
    System.out.println("please enter a string of 3 words");
    String strU = input.nextLine();

    System.out.println("please enter a digit");
    input =new Scanner(System.in);

    int num = input.nextInt();
    String num1 = "" + num;
    String num2 = num + 1 + "";
    String num3 = num + 2 + "";
      //  System.out.println(num1);
      //  System.out.println(num2);
      //  System.out.println(num3);

    String first = strU.substring(0, strU.indexOf(" "));
       // System.out.println(first);                            // first word
    String first1 = first.replace(strU.charAt(0), num1.charAt(0));

    String second = strU.substring(strU.indexOf(" ") + 1, strU.indexOf(" ", strU.indexOf(" ") + 1));
       // System.out.println(second);                           // second word
    String second1 = second.replace(second.charAt(0), num2.charAt(0));

    String third = strU.substring(strU.indexOf(" ", strU.indexOf(" ") + 1) + 1);
    String third1 = third.replace(third.charAt(0), num3.charAt(0));
       // System.out.println(third);                            // third word
        System.out.println(first1 +" "+second1 +" "+third1);  // all three words with first letters replaced by #'s
    }
}
