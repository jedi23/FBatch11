package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        int[] nums= new int[] {10,4,3,55,32,145,443,234,98,32};
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number from array");
        int num=input.nextInt();
        boolean contains=false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                nums[i] = 0;
                contains=true; }}
        if (contains==false){
            System.out.println("false");
        } else{
            System.out.println(Arrays.toString(nums));
        }
    }
}
