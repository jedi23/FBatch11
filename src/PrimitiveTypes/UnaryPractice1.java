package PrimitiveTypes;

public class UnaryPractice1
{

    public static void main(String[] args) {

      //  int studentNumber = 25;
      //   System.out.println(studentNumber);

      //  studentNumber = studentNumber++;
      //  System.out.println(studentNumber)
        //  studentNumber = ++studentNumber;
      //  System.out.println(studentNumber);

    //    int count = 5;
     //   System.out.println(count++);  // 5
    //    System.out.println(++count);  // 6   actually equals 7

        int studentNumber = 25;
         System.out.println(studentNumber++);  // shows 25 but it is actually 26
        // doesn't show yet because it's on the same line will show on next line when used again
        System.out.println(studentNumber);  // so now it does correctly show 26
        studentNumber++;
        System.out.println(studentNumber);

        int count = 5;
        System.out.println(++count); // 6

        System.out.println(count++); // shows 6 it is actually 7

        int number = 8;
        System.out.println(number--); // gonna show 8 it is 7
        System.out.println(number--); // shows 7 it is 6
        System.out.println(--number); // shows 5 it is 5

        number++;
        System.out.println(number++ + number++); // shows 13 number is 8
        System.out.println(number);

        int result = --number + --number + 2 - number++ *2; // 7 + 6 + 2 - 6 * 2
        System.out.println(result);   // result will be 3
        System.out.println(number);   // because number value is actually 7

        //      -----------------------------------------------------

        int a = ++number;
        System.out.println(a);
        System.out.println(number);






    }
}
