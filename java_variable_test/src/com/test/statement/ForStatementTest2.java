package com.test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 사이의 짝수를 더하시오.
		System.out.println("1~10 사이의 짝수를 더하시오.");
		int sum = 0;
		for (int i = 1; i < 11; i++)

			if (i % 2 == 0) {// 나머지 연산자사용
				System.out.println("더해진 정수는 :" + i);
				sum = sum + i;
			}
		System.out.println(sum);

		// 2단 구구단을 작성하시오.
		System.out.println("2단 구구단을 작성하시오.");
		int two = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(two + "X" + i + "=" + two * i);
		} /*
			 * 두개를 비교하여 문제해결할때, 공통적인것과 다른것을 추출해낸다 공통점의 이유를 알고 차이점은혹시 무엇일까 생각한다.
			 */
		int dan = 1;
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단입니다.");
			for (int gopp = 1; gopp < 10; gopp++) {
				System.out.println(i + "*" + gopp + "=" + i * gopp);
			}
		}

		char star = '*';
		for (int i = 1; i < 11; i++) {
			System.out.print('*');

			for (int j = 1; j < 11; j++) {
				System.out.print(j);
			}

			// 별찍기 삼각형
			char symbol = '*';
			for (int row = 1; row < 11; row++) {
				for (int num = 1; num < row + 1; num++) {
					System.out.print(symbol);
				}
				System.out.println();
			}
			//별찍기 역삼각형
			int rows=10;
			for(int roww=1;roww<rows+1;roww++){
				for(int numm=1;numm<rows-roww+1;numm++){
					System.out.print(symbol);
				}
				System.out.println();
			}

		}

	}

}
