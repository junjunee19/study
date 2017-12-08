package com.test.variable;

public class MathRandomTest {

	public static void main(String[] args) {
		
		// 0<=Math.random()<1 인 임의의 실수
		System.out.println(Math.random()); //double타입
		
		//1~10 사이의 임의 정수
		int randomInt=(int)(Math.random()*10+1);
		System.out.println(randomInt);
	}

}
