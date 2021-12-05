package ifStatement;

public class elsePractice {
    public static void main(String[] args) {

        boolean myLicense = true;

        if (myLicense==true){
            System.out.println("You can drive the Ferrari!");
        }else{
            System.out.println("DMV is next door, please visit");
        }
        int number = 1234;
        if (number <24){
            System.out.println("yaaayyyyyyy");
        }else{
            System.out.println("this is print out from else block");
        }
        // ----------------------
        if ( 'A' != 'A')
            System.out.println("**********");
        //System.out.println("XXX");  // will give error, else if
        else
            System.out.println("!!!!!!!!!!");
    }
}
