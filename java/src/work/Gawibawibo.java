package work;

import java.util.Scanner;

public class Gawibawibo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1:���� 2:���� 3:�� ���Է��ϼ���.");
		int user = scan.nextInt();
		int computer = (int) (Math.random() * 3 + 1);
		System.out.println("�����" + user + "�� �½��ϴ�.");
		System.out.println("��ǻ�ʹ�" + computer + "�� �½��ϴ�.");
		switch (user - computer) {
		case 0:
			System.out.println("�����ϴ�.");
			break;
		case -2:
		case 1:
			System.out.println("�̰���ϴ�.");
			break;
		case -1:
		case 2:
			System.out.println("�����ϴ�.");
			break;

		}
	}

}
