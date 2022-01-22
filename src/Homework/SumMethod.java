package Homework;

public class SumMethod {

// Create your method here
/*public static int sumofnum(int[] sum){
  int sum1=0;
  for(int i=0;i<sum.length;i++){
    sum1+=sum[i];
  }return sum1;
}
public static void main(String[] args){
  int[] sum ={1,23,4,5};
}
}
*/

    public static int sumOfNumbers(int[] array){
        int sum = 0;
        for(int num : array){
            sum+=num;
        }
        return sum;
    }
}