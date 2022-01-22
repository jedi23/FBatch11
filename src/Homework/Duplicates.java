package Homework;

import java.util.Arrays;

public class Duplicates {

    class Main {
        // create a method here
        // Do not forget return type of your method is int array and name of your method is duplicates
        public int[] duplicates(int[]nums,int[]nums2){
            String commons = "";
            for(int i = 0; i < nums.length;i++){
                for(int j = 0; j < nums2.length;j++){
                    if(nums[i]==nums2[j]){
                        commons += nums[i] + " ";
                    }
                }
            }
            if(commons.length()==0){
                return null;
            }
            String[] commonArray = commons.trim().split(" ");
            String commonsWithoutDuplicate = " ";
            for(int i = 0; i < commonArray.length;i++){
                if(!commonsWithoutDuplicate.contains(" " + commonArray[i]+ " ")){
                    commonsWithoutDuplicate += commonArray[i]+ " ";}
            }
            String [] commonsWithoutduplicateArray = commonsWithoutDuplicate.trim().split(" ");
            int [] commonNumbers = new int[commonsWithoutduplicateArray.length];
            for(int i = 0; i < commonNumbers.length;i++){
                commonNumbers[i] = Integer.parseInt(commonsWithoutduplicateArray[i]);
            }
            Arrays.sort(commonNumbers);
            return commonNumbers;
        }

    }

}  // check if main method is correct!?
