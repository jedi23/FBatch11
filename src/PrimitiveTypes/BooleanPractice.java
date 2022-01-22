package PrimitiveTypes;

public class BooleanPractice {
    public static void main(String[] args) {

        int number = 11;
        System.out.println(number); //output will be 11

        boolean isHungry = true;
        System.out.println(isHungry);
        // only two options for boolean is either true or false (reserved Java words/values

        boolean isLightOn = false;
        System.out.println(isLightOn);
        System.out.println(true); //output will be true

        System.out.println(isHungry == isLightOn); // == means comparing since 1 is true & 1 is false will b false
                                                    //output will be false
        isLightOn = isHungry;
        isLightOn = false;
        System.out.println("Last version for iHungry >> "+isHungry); // output will be true
        System.out.println(isLightOn); //output will be false because of reassignment on line 20
        System.out.println("Last for Is light >> "+isLightOn);
    }
}
