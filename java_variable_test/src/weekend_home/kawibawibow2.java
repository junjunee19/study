package weekend_home;

import java.util.Random;
import java.util.Scanner;

class kawibawibow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		//int random = (int) (Math.random() * 3 + 1); // 1~3�� ������

		//System.out.println(random;

		int com; // ����������
		int i ; // ����ڰ� �Է��Ұ�(1~3)
		int result = 0;

		boolean play = true;
		System.out.println("����,����,�� �������մϴ�.");
		//String scanString;

		while (play){
			System.out.println("1(����)2(����)3(��)�� �ϳ��������ϼ���.");
			System.out.println("������ �����Ϸ��� 4�� �����ϼ���.");
			System.out.print("�Է� :\n");
		i = scan.nextInt();
		System.out.println();
		com=random.nextInt(4);
		//scanString = scan.nextLine();
		//com = random.nextInt(3);
		com += 1;

		if (i == 1) {
			if (com == 1) {
				System.out.println("�����ϴ�.");
				System.out.println("com=�ָ�");
			} else if (com == 2) {
				System.out.println("�̰���ϴ�.");
				System.out.println("com=����");
			} else if (com == 3) {
				System.out.println("�����ϴ�.");
				System.out.println("com=��");
			}
		} else if (i == 2) {
			System.out.println("�����ϴ�.");
			System.out.println("com=�ָ�");
		} else if (com == 2) {
			System.out.println("�����ϴ�.");
			System.out.println("com=����");
		} else if (com == 3) {
			System.out.println("�̰���ϴ�.");
			System.out.println("com=��");
		}

		else if (i == 3) {
			System.out.println("�̰���ϴ�.");
			System.out.println("com=�ָ�");
		} else if (com == 2) {
			System.out.println("com=����");
			System.out.println("�����ϴ�.");
		} else if (com == 3) {
			System.out.println("�����ϴ�.");
			System.out.println("com=��");

		} else if (i == 4) {
			System.out.println("������ �����ϰڽ��ϴ�.");
			play = false;
		} else
			System.out.println("�߸��� �Է��Դϴ�.");
	}

	/*
	 * (scanString.equals("����")) { scanValue = 0;
	 */
	}
}
