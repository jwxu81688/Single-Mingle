package com.revature;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 2, 1, 4, 4, 6, 7, 8, 7, 6, 9, 9};
        System.out.println(SingleAndMingled(input)[0] + " " + SingleAndMingled(input)[1]);
        //String[] input2 = {"me", "she", "he", "they", "she", "they", "he", "you"};
        Character[] input2 = {'a', 'i', 'a', 'o', 'o', 'e', 'u', 'e'};
        System.out.println(SingleAndMingled(input2)[0] + " " + SingleAndMingled(input2)[1]);
    }

    // Returns an array of the single elements from input 
    public static Object[] SingleAndMingled(Object[] input){
    	Map<Object, Integer> map = new TreeMap<>();
        
        for(int i = 0; i < input.length; i++) {
        	map.put(input[i], map.containsKey(input[i]) ? map.get(input[i]) + 1 : 1);
        }
        
        Object[] result = new Object[2];
        int i = 0;
        for(Map.Entry<Object, Integer> el : map.entrySet()) {
        	if(el.getValue() == 1) {
        		result[i] = el.getKey();
        		i++;
        	}
        }
        return result;
    }
}
