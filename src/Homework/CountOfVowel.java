package Homework;

import java.util.*;

public class CountOfVowel {
        // Create the countVowel method here
        public Map<String,Integer> countVowel(String str){
            Map<String, Integer> map = new HashMap<>();
            int count[] = new int[5];
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                    count[0]++;
                }
                if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                    count[1]++;
                }
                if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
                    count[2]++;
                }
                if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                    count[3]++;
                }
                if (str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                    count[4]++;
                }
            }
            map.put("a", count[0]);
            map.put("e", count[1]);
            map.put("i", count[2]);
            map.put("o", count[3]);
            map.put("u", count[4]);
            return map;
        }
    }
