package String;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        // BMI calculation (Body Mass Index) = weight/(height*height) * 703)
        // 18 - 24, less than 18 = tiny, more than 24 = biggy
        // " your BMI is <BMI>"

        double multiplier = 703;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight");
        double weight = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        double BMI = weight/(height*height)*multiplier;
        System.out.println("Your BMI is: "+BMI);
    }
}
