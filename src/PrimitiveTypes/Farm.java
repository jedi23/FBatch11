package PrimitiveTypes;

public class Farm {

    public static void main(String[] args) {
        /*
        in a farm, there are 12 cows and 23 chickens
        1. find the total legs of the animals in the farm and print out
        2. if each cow costs $2345 and each chicken costs $23.99
        find the total worth of these animals and print out
         */

        int cow = 4;
        int chicken = 2;
        int cowcount = cow*12;
        int chickencount = chicken*23;

        int count1 = cow*12;
        int count2 = chicken*2;
        int totallegs = chickencount+cowcount;

        System.out.println("Cow leg count is = "+ cowcount);
        System.out.println("Chicken leg count is = " + chickencount);
        System.out.println(totallegs);

        int cowcost = 2345;
        double chickencost = 23.99;

        int totalcowcost = cowcost*12;
        double totalchickencost= chickencost*23;

        double totalanimalcost = totalcowcost+totalchickencost;

        System.out.println("Total Cost of the Farm Animals is = $"+totalanimalcost);


    }
}
