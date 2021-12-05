package ifStatement;

import java.util.Scanner;

public class elseTask2 {
    public static void main(String[] args) {
        // find out is your zipcode is even number or odd number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your zipcode");
        int zip = sc.nextInt();
        if(zip % 2 == 0){
            System.out.println("Your zipcode is even number");
        }else{
            System.out.println("Your zipcode is odd number");
        }
    }
}
