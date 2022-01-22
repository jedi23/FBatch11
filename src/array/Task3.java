package array;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = {4,24,10,100,5,78,11,25,55};

        // print out numbers that are greater than 10

        int[] largeNumbers = new int[arr.length];

       for (int t=0; t<arr.length;t++){    // as long as t is 0 it will keep coming back to run again with for loop
           if (arr[t]>10){      // if t is > 10 then skip SOUT and go back to for loop to run again

               largeNumbers[t] = arr[t];
               // System.out.println(arr[t]);

           }
       }
        System.out.println(Arrays.toString(largeNumbers));
        Arrays.sort(largeNumbers);
        System.out.println(Arrays.toString(largeNumbers));





    }
}
