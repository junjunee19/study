package weekend_home;

import java.util.Random;
import java.util.Scanner;

class updown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubR

		Scanner scan = new Scanner(System.in);

		int i = 0; // ����ڰ� �Է��ϴ� ��
		int cnt = 0;// ��� �Է��ߴ��� ������ ����

		String check = "N";
		boolean reGame = true;
		boolean isNumber = false;
		Random random = new Random();
		
		while (reGame) {


			int r = random.nextInt(100) + 1;// 1���� 100����

			int a = 1;
			int b = 100; // ������ ��Ÿ�����ִ� ���� a,b
			cnt=0;
			// System.out.println(r);
			System.out.println("���� �����Ͽ����ϴ�. ���߾����.");
			System.out.println("1~100");
			
			while (true) {

				cnt++; // �ʱ�ȭ�� cnt = 0 �̿����Ƿ�

				System.out.print(cnt + "--");// 1���� ī��Ʈ����!

				i = scan.nextInt();

				if (i > r) {
					System.out.println("down!");
					b = i;
					System.out.println(a + "-" + b);//
				}

				else if (i < r) {
					System.out.println("up!");
					a = i;
					System.out.println(a + "-" + b);

				} else {
					System.out.println("�����Դϴ�.");
					System.out.println("�ٽ��Ͻðڽ��ϱ�?(y/n)");

					check = scan.next().toUpperCase();
					if (check.equals("N")) {
						reGame = false;
						//������ ���������� ��
						break;
						//�����ʱ�ȭ�ϱ����� ���� while������
					}else{
						break;
						//�����ʱ�ȭ�ϱ����� ���� while������
					}
				}

			}
		}
		System.out.println("END");
	}
}
