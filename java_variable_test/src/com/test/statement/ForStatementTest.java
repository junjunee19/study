package com.test.statement;

import java.util.Scanner;

public class ForStatementTest {

	public static void main(String[] args) {
		int sum = 0;
		int sumPluse=0; //sum�� ������Ű�� ���Ѻ���
		for (int i = 1; i < 11; i++)// 2,4,32,4,3t���� 
			{
			sum = sum + i;
			sumPluse+=sum;
		}
		System.out.println(sum);
		// 1+(1+2)+(1+2+3)+.....+(1+2+3+4+5+6+7+8+9+10)
		System.out.println(sumPluse);

		Scanner scan = new Scanner(System.in);
		while (!scan.nextLine().equals("y"))//�Է��� ����y�� ���� ������ �ݺ�(true,false �ۿ�����) 
			{
			System.out.println("y�� ������ ������ �ݺ��մϴ�");
			
			
		}
		
	}

}
