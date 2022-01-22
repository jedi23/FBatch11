package ArrayList;

import java.util.ArrayList;

public class Flower {
    /*
    Create a Flower class
       create few instance variables which includes
          color, name, price
       initialize the instance variables
    Create a FlowerTest class
       create few Flower object and store them in an ArrayList
       print out prices of each flower
     */

    String name;
    String color;
    double price;

    public Flower(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // create a method that will take a parameter as ArrayList of Flowers
    // this method will return total prices of the flowers

    public static double totalPrice1(ArrayList<Flower> vase){
        double sum = 0;
        for(Flower flower: vase){
            sum+= flower.price;
        }
        return sum;
    }

}
