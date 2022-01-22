package ArrayList;

import java.util.ArrayList;

public class Practice3 {

    /*
       ===TASK===
       -Create an ArrayList that will store 5 fruit names
       -Print out stored values by using for Loop
     */

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Strawberry");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Watermelon");
        fruits.add("Kiwi");

        for (String fruit: fruits){

            System.out.println(fruit);
        }
        System.out.println("This is after first for loop");
         printFruits(fruits);
        System.out.println("This ");
        // create a method that will take arraylist as a parameter of fruits
        // this method will print out fruits if it has 5 or more letters
    }

    public void sum(int i1, int i2){
        System.out.println(i1+i2);
    }
    public static void printFruits(ArrayList<String>fruits){

        //for (String fruit: fruits){
          for(int i=0; i<fruits.size();i++){
         //   if(fruit.length()>=5){
              if(fruits.get(i).length()<=4){
         //       System.out.println(fruit);
                  fruits.remove(i);
            }
        }
        System.out.println(fruits);
    }
    // create a method that will take arraylist as a parameter of fruits
    // this method will remove elements that has 4 or less letters from the arraylist
}
