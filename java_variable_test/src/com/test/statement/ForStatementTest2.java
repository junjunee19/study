package com.test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 ������ ¦���� ���Ͻÿ�.
		System.out.println("1~10 ������ ¦���� ���Ͻÿ�.");
		int sum = 0;
		for (int i = 1; i < 11; i++)

			if (i % 2 == 0) {// ������ �����ڻ��
				System.out.println("������ ������ :" + i);
				sum = sum + i;
			}
		System.out.println(sum);

		// 2�� �������� �ۼ��Ͻÿ�.
		System.out.println("2�� �������� �ۼ��Ͻÿ�.");
		int two = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(two + "X" + i + "=" + two * i);
		} /*
			 * �ΰ��� ���Ͽ� �����ذ��Ҷ�, �������ΰͰ� �ٸ����� �����س��� �������� ������ �˰� ��������Ȥ�� �����ϱ� �����Ѵ�.
			 */
		int dan = 1;
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "���Դϴ�.");
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

			// ����� �ﰢ��
			char symbol = '*';
			for (int row = 1; row < 11; row++) {
				for (int num = 1; num < row + 1; num++) {
					System.out.print(symbol);
				}
				System.out.println();
			}
			//����� ���ﰢ��
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
