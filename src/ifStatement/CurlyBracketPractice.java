package ifStatement;

public class CurlyBracketPractice
{
 public static void main(String[] args) {
  int num = 1234;
  if(num==1234)  // you can use if statement without curly braces
  System.out.println("Num is equals 1234");
  System.out.println("Num is not equals to 1234");

  if(num==5)  // since there is no semi-colon here Java will not compile next line only
              // if there was a semi-colon if statement will not affect any following line of code
   System.out.println("Hello Universe");  // in this scenario if statement will skip to next line
   System.out.println("Hello JAVA");      // because there is no curly braces
   System.out.println("Hello Selenium");
  System.out.println("Hello Ruby :)");
   System.out.println("Hello All");

   int num1 = 6;
   if(num1<10)
    num1++;
  System.out.println(num1);
  int num2 = 4;
  if(num2>20)
   num2++;
  System.out.println(num2);
  if(num2>20) {
   num2++;
   System.out.println("I am in the curly ===>" + num2);
  }
  int a=9;
  if (1==1)
   a = 2+2;
  System.out.println("==========");
  System.out.println(a);
 }
}
