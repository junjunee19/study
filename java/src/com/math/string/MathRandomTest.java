
package com.math.string;

import java.util.Scanner;

public class MathRandomTest {

	public static void main(String[] args) {
	/*	
		 * // 0<=Math.random()<1 인 임의의 실수 System.out.println(Math.random());
		 * 
		 * // 1~10 사이의 임의 정수 int randomInt = (int) (Math.random() * 10 + 1);
		 * System.out.println(randomInt);
		 * 
		 * 
		 * 
		 

		Scanner input = new Scanner(System.in);

		final int RATE = 5000;
		int pay;
		int hours;

		System.out.println("시간을 입력하시오: ");
		hours = input.nextInt();

		if (hours > 8)
			pay = RATE * 8 + (int) (1.5 * RATE * (hours - 8));
		else
			pay = RATE * hours;
		System.out.println();
		
		
		
		
		
		
*/
		
		
		int n =1;
		
		if(n>=100){
			
			System.out.println("large");
			
			
		}else{
			System.out.println("small");
			
		}
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int cup = Integer.parseInt(scan.nextLine());
		if(100<cup){
			
			System.out.println("small");
		}else if(cup>=100 && cup<200){
			
			System.out.println("mediup");
			
		}else{
			System.out.println("large");
		}
		
		
		
		
		
	}

}
