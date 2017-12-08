package com.exercise.test;

public class Ex04_9 {

	public static void main(String[] args) {
		String star ="12345";
		int sum =0;
		for (int i = 0; i < star.length(); i++) {
			sum=sum+Integer.parseInt(""+star.charAt(i));
			
			
		}
		System.out.println("sum="+sum);

	}

}
