package SwitchStatement;

import java.util.Scanner;

public class SwitchPractice4 {
    public static void main(String[] args) {
        /*
        ask user for geometrical shape
        based in the name of the shape
        calculate the area of that shape
        get length, width for rectangle
        get height and base for triangle from user to use them in calculations
        print out name of the shape and area of that shape
        -triangle, rectangle
        triangle formula = (base*height)/2
        rectangle formula = l * w
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose either your shape as either a triangle or rectangle");
        String shape = input.nextLine().toLowerCase();
        System.out.println("Enter length of shape");
        double length = input.nextInt();
        System.out.println("Enter height of shape");
        double height = input.nextInt();
        double area1 =  length * height;
        double area2 = (length*height)/2;
        switch(shape){
            case "triangle":
                System.out.println("Your shape is Triangle");
                System.out.println("Your shape area = "+ area2);
                break;
            case "rectangle":
                System.out.println("Your shape is a Rectangle");
                System.out.println("Your shape area = " + area1);
                break;
            default:
                System.out.println("You entered an invalid shape.");
                break;
        }
        /*
        double d = 2.5;   // Data types supported by switch: int, byte short, char, String
        short s = 2;
        boolean b = true;
        long l = 2;
        byte by = 2;
        switch(by){
            case true:
                System.out.println("******");
        */
        }
    }
/*
Scanner input = new Scanner(System.in);
System.out.println("Please choose either your shape as either a triangle or rectangle");
        String shape = input.nextLine().toLowerCase();

        switch(shape)
        case"triangle":
        System.out.println("Enter height of Triangle");
        double h = input.nextDouble();
        System.out.println("Enter base of Triangle");
        double b = input.nextDouble();
        System.out.println("The area of Triangle is: " + (b*h)/2;
        break;

        case "rectangle";
        System.out.println("Enter height of Rectangle");
        double l = input.nextDouble();
        System.out.println("Enter width of Triangle");
        double w = input.nextDouble();
        System.out.println("The area of Rectangle is: " + l*w);
        break:
        default:
        System.out.println("Your selection is invalid);
        break;
*/