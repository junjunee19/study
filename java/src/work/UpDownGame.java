package work;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;

		answer = (int) (Math.random() * 100) + 1;
		// 1~100������ ������ ���� ����
		Scanner scanner = new Scanner(System.in);
		// ��ĳ�ʰ�ü�� �̿� ���ڸ� �Է¹޴´�.
		do {
			System.out.println("1~100������ �������� �Է�");
			String temp = scanner.nextLine();
			// �Է¹��� ���ڸ� temp�� ����
			input = Integer.parseInt(temp);
			// �Է¹��� ���ڿ��� ���ڷ� ��ȯ�Ͽ� input�� ����

			// ������ ���ڿ� �Է¹��� ������ ��Һ�
			if (input > answer) {
				System.out.println("�� �������� �Է����ּ���.");
			} else if (input < answer) {
				System.out.println("�� ū���� �Է����ּ���.");
			}

		} while (input != answer);
		// input(�Է¹�������)�� answer(������ ����)�� �������� �Ǹ� �ݺ��� ����
		System.out.println("�����Դϴ�! " + answer);
	}
}
