package com.test;

public class SumOf3or5 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=3; i<1000; i++) {
			if (i%3 == 0 || i%5 == 0) sum+=i;
		}
		
		System.out.println("The sum of 3 and 5 multiples is :"+sum);
	}

}
