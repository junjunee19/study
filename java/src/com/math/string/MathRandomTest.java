
package com.math.string;

import java.util.Scanner;

public class MathRandomTest {

	public static void main(String[] args) {
	/*	
		 * // 0<=Math.random()<1 �� ������ �Ǽ� System.out.println(Math.random());
		 * 
		 * // 1~10 ������ ���� ���� int randomInt = (int) (Math.random() * 10 + 1);
		 * System.out.println(randomInt);
		 * 
		 * 
		 * 
		 

		Scanner input = new Scanner(System.in);

		final int RATE = 5000;
		int pay;
		int hours;

		System.out.println("�ð��� �Է��Ͻÿ�: ");
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
