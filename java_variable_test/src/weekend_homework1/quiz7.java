package weekend_homework1;

import java.util.Arrays;
import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {
		// ���ǐl ���� 7���� �Է¹޾� ����ū���� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�

		// ������)
		// 1��°: ���� :45                      String�� �������ִ� references1������ �迭
		// 2����: ���� :97
		// ...
		// 7��°: ���� : 43
		// max num : 149
		// min num : 8
		Scanner scan = new Scanner(System.in);

		int[] intArray = new int[7];   //// references ���� ��������
		
		for (int i = 1; i < intArray.length; i++) {
			System.out.print((i + 1) + "��° ����: "); // �Է¹��� ���ڸ� ��̿� ��ƶ�
			intArray[i]= Integer.parseInt(scan.nextLine());

		}
		// �Է�

		Arrays.sort(intArray); // ����
		
		System.out.println("max num : " + intArray[intArray.length - 1]);
		System.out.println("max num : " + intArray[0]);

	}

}
