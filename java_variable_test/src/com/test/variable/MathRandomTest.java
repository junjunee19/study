package com.test.variable;

public class MathRandomTest {

	public static void main(String[] args) {
		
		// 0<=Math.random()<1 �� ������ �Ǽ�
		System.out.println(Math.random()); //doubleŸ��
		
		//1~10 ������ ���� ����
		int randomInt=(int)(Math.random()*10+1);
		System.out.println(randomInt);
	}

}