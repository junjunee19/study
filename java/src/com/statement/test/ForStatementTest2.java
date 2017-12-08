 package com.statement.test;

public class ForStatementTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10사이에 있는 짝수를 더하시오
		System.out.println("1~10사이의 짝수를 더하시오");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("더해진 정수는 :" + i);
				sum = sum + i;
			}
		}
		System.out.println(sum);

		// 2단 구구단을 작성하시오.
		System.out.println("2단 구구단을 작성하시오.");
		int a = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(a + "*" + i + "=" + a * i);
		}
		// 구구단
		for (int b = 2; b < 10; b++) {
			System.out.println(b + "단입니다.");
			for (int c = 1; c < 10; c++) {
				System.out.println(b + "*" + c + "=" + b * c);
			}
			System.out.println();
		}
		// 별찍기 삼각형
		char symbol = '*';
		for (int row = 1; row < 11; row++) {
			for (int num = 1; num < row + 1; num++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		// 별 찍기 역삼각형
		int rows = 10;
		for (int roww = 1; roww < rows + 1; roww++) {
			for (int numm = 1; numm < rows - roww + 2; numm++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		int value = 0;
		for (int row = 1; row < 11; row++) {
			for (int num = 1; num < row + 1; num++) {
				System.out.print(++value);
			}
			System.out.println();

		}
	}
}
