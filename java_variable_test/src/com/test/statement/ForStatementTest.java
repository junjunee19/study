package com.test.statement;

import java.util.Scanner;

public class ForStatementTest {

	public static void main(String[] args) {
		int sum = 0;
		int sumPluse=0; //sum을 누적시키기 위한변수
		for (int i = 1; i < 11; i++)// 2,4,32,4,3t순서 
			{
			sum = sum + i;
			sumPluse+=sum;
		}
		System.out.println(sum);
		// 1+(1+2)+(1+2+3)+.....+(1+2+3+4+5+6+7+8+9+10)
		System.out.println(sumPluse);

		Scanner scan = new Scanner(System.in);
		while (!scan.nextLine().equals("y"))//입력한 값이y랑 같지 않으면 반복(true,false 밖에못옴) 
			{
			System.out.println("y를 누르기 전까지 반복합니다");
			
			
		}
		
	}

}
