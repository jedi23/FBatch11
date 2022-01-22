
package map;

import java.util.HashMap;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        //create a method that will take a map<Integer , String>  as a parameter
        //and it will print out keys from that map one by one
        HashMap<Integer,String> cookies =new HashMap<>();
        cookies.put(1,"chocolate");
        cookies.put(2,"oreo");
        cookies.put(8,"browne");
        cookies.put(7,"browne");
        printKeys(cookies);
        printvalue(cookies);

    }
    public static void printKeys(HashMap<Integer,String> method){
        for( int keys1: method.keySet()){
            System.out.println(keys1);
        }

    }
    public static void printvalue(HashMap<Integer,String> map) {
        for (String keys : map.values()) {
            System.out.println(keys);
        }
    }
    }