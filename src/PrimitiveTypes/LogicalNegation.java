package PrimitiveTypes;

public class LogicalNegation {

    public static void main(String[] args) {

        boolean isLightOn = true;
        System.out.println(isLightOn);
        System.out.println(!isLightOn);
        System.out.println(5==5); //because it is comparing values, thus it's true
        System.out.println(!(5==5));  // will be false because of logical negation

        boolean haveMoney = false;

        haveMoney = !haveMoney;
        System.out.println(haveMoney);
        System.out.println(!haveMoney); //because i reversed it again with (!)
        System.out.println(">>>>>"+isLightOn);
        System.out.println("*****"+haveMoney);
        System.out.println(isLightOn == haveMoney);
        System.out.println(!(isLightOn ==haveMoney));

        System.out.println(true == false); // false

    }
}
