package com.exercise.test;

import java.util.Scanner;

public class Ex04_6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int sum=Integer.parseInt(scan.nextLine());
		
		sumResult(sum);
		
		  
		/*int sum=6;
		for (int num1 = 1; num1 < 7; num1++) {
			for (int num2 = 1; num2 < 7; num2++) {
				if (num1+num2==sum) {
					System.out.println("("+num1+","+num2+")");
				}
			}
		}
		
		//�ֻ����� ������ ���(Ƚ���� ��Ȯ)
		int sum1=6;
		
		for (int num2 = 1; num2 < 7; num2++) {
			if (sum1-num2>0) {
				System.out.println("("+num2+","+(sum1-num2)+")");
			}
			
		}

	}*/
	}
	public static void sumResult(int sum) {
		for (int num1 = 1; num1 < 7; num1++) {
			for (int num2 = 1; num2 < 7; num2++) {
				if (num1 + num2 == sum) {
					System.out.println("(" + num1 + "," + num2 + ")");
				}
			}
		}
	}

}
