package Homework;

public class FToCelsiusArray {
        public static void main(String[] args) {
            // Please DO NOT CHANGE any value of the array below.
            double[] fahrenheits = new double[]{32,21,0,-3,-40,32,80};
            for(int i=0;i<fahrenheits.length;i++){
                double fahrenheit=fahrenheits[i];
                if(i==fahrenheits.length-1){
                    double celsius=(fahrenheit-32)*5/9;
                    System.out.println(celsius);
                }else{
                    double celsius=(fahrenheit-32)*5/9;
                    System.out.print(celsius+", ");
                }
            }
        }
    }