package First;

import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number of quarters");
        double quarters = scanner.nextDouble();
        System.out.println("please enter number of dimes");
        double dimes = scanner.nextInt();
        System.out.println("please enter number of nickles");
        double nickles = scanner.nextInt();
        System.out.println("please enter number of pennies");
        double pennies = scanner.nextInt();

        double totalAmount = (nickles*5 + pennies*1 + dimes*10 + quarters*25)/100;
        System.out.println(totalAmount);

        //double dollarCalc = quarters/4;
        //double dollarQ = quarters%4;
        //double dollarRemain = quarters*0.25;
        //double qTotal = dollarCalc +dollarRemain;
        //System.out.println(dollarCalc+dollarRemain);

        //System.out.println("please enter number of dimes");
        //int dimes = scanner.nextInt();
        //double dollarCalc2 = dimes/10;
        //double dollarQ2 = dimes%10;
        //double dollarRemain2 = quarters*0.25;
        //double qTotal2 = dollarCalc2 +dollarRemain2;
        //System.out.println(dollarCalc2+dollarRemain2);

        //System.out.println("please enter number of nickles");
        //int nickles = scanner.nextInt();
        //double dollarCalc3 = nickles/20;
        //double dollarQ3 = dimes%4;
        //double dollarRemain3 = quarters*0.25;
        //double qTotal3 = dollarCalc3 +dollarRemain3;
        //System.out.println(dollarCalc3+dollarRemain3);

    }
}
