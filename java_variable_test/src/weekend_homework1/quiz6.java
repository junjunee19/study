package weekend_homework1;

import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		// �л� 3���� �̸��� ��/��/�� ������ �Է¹޾� ������ �л��� ����� ����ϴ�
		// ���α׷��� �ۼ��Ͻÿ�.
		// ������}
		// 1���л�
		// �̸�: kim
		// ����:
		// ����
		// ����
		// 2���л�
		// ,
		// ,
		// 1�� kim ��� = 59��
		// 2�� lala��� = 75��
		/////���Ͽ����� �����ʿ�.
		String[][] studentArray = new String[3][4]; // 3��4�� ����Ÿ������ �ؾߵǱ⋚����
													// int���ƴ� string����
													// ���ڹ����� parse �������
		Scanner scan = new Scanner(System.in);		// Integer.parseInt <----�Ľ�ó�� string�� int�� ��ȯ

		// �Է�

		for (int num = 1; num < studentArray.length; num++) {
			System.out.println(num + "�� �л�"); /// num�����л� ex)1�� 2���л�...
			System.out.println("�̸� : ");			studentArray[num-1][0] = scan.nextLine();
			System.out.println("���� : ");
			studentArray[num-1][1] = scan.nextLine();
			System.out.println("���� : ");
			studentArray[num-1][2] = scan.nextLine();
			System.out.println("���� : ");
			studentArray[num-1][0] = scan.nextLine();

		} // ���

		int total = 0;
		for (int num = 1; num < studentArray.length; num++) {
			total
			= Integer.parseInt(studentArray[num-1][1]) + Integer.parseInt(studentArray[num-1][2])
					+ Integer.parseInt(studentArray[num-1][3]);

			System.out.println(num-1 + "�� " + studentArray[num-1][0] + " ��� " + (total / (studentArray[num-1].length - 1)));
		}

	}  

}
