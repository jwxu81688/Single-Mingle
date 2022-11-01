package com.revature.test;

import com.revature.Main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestMain {

	@Test
    public void test1(){
		Integer[] input = {2, 4, 6, 8, 10, 2, 6, 10};
		Object[] result = Main.SingleAndMingled(input);
    	Assertions.assertEquals((Integer) result[0], 4);
    	Assertions.assertEquals((Integer) result[1], 8);
    }
    @Test
    public void test2(){
    	Integer[] input = {1, 2, 3, 2, 1, 4, 4, 6, 7, 8, 7, 6, 9, 9};
		Object[] result = Main.SingleAndMingled(input);
    	Assertions.assertEquals((Integer) result[0], 3);
    	Assertions.assertEquals((Integer) result[1], 8);
    }
    @Test
    public void test3(){
    	String[] input = {"me", "she", "he", "they", "you", "he", "they", "she"};
    	Object[] result = Main.SingleAndMingled(input);
    	Assertions.assertEquals((String) result[0], "me");
    	Assertions.assertEquals((String) result[1], "you");
    }
    @Test
    public void test4(){
    	String[] input = {"me", "she", "he", "they", "you", "he", "they", "she"};
    	Object[] result = Main.SingleAndMingled(input);
    	Assertions.assertNotEquals((String) result[0], "he");
    	Assertions.assertNotEquals((String) result[1], "she");
    }
    @Test
    public void test5(){
    	Character[] input = {'a', 'i', 'a', 'o', 'o', 'e', 'u', 'e'};
    	Object[] result = Main.SingleAndMingled(input);
    	Assertions.assertEquals((Character) result[0], 'i');
    	Assertions.assertEquals((Character) result[1], 'u');
    }
    @Test
    public void test6(){
    	Double[] input = {1.3, 1.3, 1.4, 1.5, 1.5, 1.6, 1.7, 1.7};
		Object[] result = Main.SingleAndMingled(input);
    	Assertions.assertEquals((Double) result[0], 1.4);
    	Assertions.assertEquals((Double) result[1], 1.6);
    }
}
