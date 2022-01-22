package Loops.while_DoWhile;

public class CountingChars {
    public static void main(String[] args) {
        /*
          count letters, digits and other characters in the String
          String str = "$3%GTlk64mn^y?"
          sout("There are <..> letters in the string");
          sout("There are <..> digits in th string");
          sout("There are <..> special chars in the string");
         */
        int index = 0;
        int letterCounter = 0, digitCounter= 0, charCounter = 0;
        String str = "$3%GTlk64mn^y?".toUpperCase();

        do{
            if(str.charAt(index) >= 'A' && str.charAt(index) <= 'Z'){
                letterCounter++;
            }else if(str.charAt(index) >= '0' && str.charAt(index)<='9'){
                digitCounter++;
            }else{
                charCounter++;
            }
            index++;
        }while(index<str.length());
        System.out.println("There are "+ letterCounter + " letters in the string");
        System.out.println("There are " + digitCounter+ " numbers in the string");
        System.out.println("There are " + charCounter + " special chars in the string");
    }
}
