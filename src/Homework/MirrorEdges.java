package Homework;

import java.util.Scanner;

public class MirrorEdges {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string value");
            String str = scanner.next();
            String result = "";

            for( int i = 0, l= str.length()-1; i <=str.length()-1; i++, l--){
                if (str.charAt(i) == str. charAt(l)){
                    result +=str.charAt(i);
                } else{
                    i=str.length();
                }
            }
            System.out.println(result);
        }
    }
