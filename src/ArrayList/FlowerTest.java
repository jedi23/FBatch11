package ArrayList;

import java.util.ArrayList;

public class FlowerTest {
    public static void main(String[] args) {


        Flower flower1 = new Flower("Rose", "Red", 12);
        Flower flower2 = new Flower("Tulip", "Yellow", 11);
        Flower flower3 = new Flower("Lily", "White", 10);

        ArrayList<Flower> flowersList = new ArrayList();

        flowersList.add(flower1);
        flowersList.add(flower2);
        flowersList.add(flower3);

        for(Flower flower: flowersList){
            System.out.println(flower.name+ " is $"+flower.price);
        }
        System.out.println(totalPrice(flowersList));

        // calling totalPrice method from the Flower class
        double flowerCost = Flower.totalPrice1(flowersList);
        System.out.println("This is cost calculation from totalPrice1 method "+
                flowerCost);
    }
    // create a method that will take a parameter as ArrayList of Flowers
    // this method will return total prices of the flowers

    public static double totalPrice(ArrayList<Flower> vase){
        double sum = 0;
        for(Flower flower: vase){
            sum+= flower.price;
        }
        return sum;
    }

}
