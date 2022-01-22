package Homework;
import java.util.Scanner;
public class PrintFirstUnique {
    public static void main(String[] args) {
        int [] array = new int[7];
        Scanner scanner = new Scanner(System.in);
        boolean isThereUniqueArray = false;
        for (int i = 0; i <array.length; i++){
            System.out.println("Enter number for array");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i<array.length;i++){
            int num = array[i];
            boolean isNumUnique = true;
            for(int b=0; b<array.length; b++){
                if(num==array[b] && i != b){
                    isNumUnique = false;
                }
            }
            if (isNumUnique){
                System.out.println(num);
                break;
            }
        }
        if( isThereUniqueArray = false);
        System.out.println("Array doesn't have any unique element");
    }
}
