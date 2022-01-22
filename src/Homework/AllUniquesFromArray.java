package Homework;
import java.util.Scanner;
public class AllUniquesFromArray {

        public static void main(String[] args) {
            int[] numbers=new int[13];
            Scanner scanner=new Scanner(System.in);
            for (int i=0;i<numbers.length;i++){
                System.out.println("Enter number for array");
                numbers[i]=scanner.nextInt();}
            boolean unique=false;
            for (int i=0;i<numbers.length;i++){
                boolean isnumberuniq=true;
                for( int b=0;b<13;b++){
                    if(numbers[i]==numbers[b]&& i!=b){
                        isnumberuniq=false;
                    }
                }
                if (isnumberuniq){
                    System.out.print(numbers[i]+" ");
                    unique=true;
                }
            } if (unique==false){
                System.out.println("Array doesn't have any unique element");
            }
        }
    }
