package Homework;
import java.util.*;
public class AscendingList {

        public Set<Integer> ascending(int[] array){
            Set<Integer> set = new TreeSet<>();
            for(Integer num : array){
                set.add(num);
            }
            return set;
        }
    }
