package weekend_homework1;

import java.util.Scanner;

public class quiz { ///

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); /// �ܼ�â���� �Է¹ޱ����� ��ĳ�ʶ��Ŭ������ �ҷ���

		String[] idArray = new String[100]; // ����ڰ� ȸ�����Խ� �Է��ϴ� ���̵�
		String[] pwdArray = new String[100]; // ����ڰ� ȸ�����Խ� �Է��ϴ� �н����尪
		String msg = "";
		String[] StringArray = new String[2];
		StringArray[0] = "���̵�:";    
		StringArray[1] = "�н�����:";
		String[] name = new String[3];
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";
		pwdArray[0] = "mimi";
		pwdArray[1] = "mama";
		pwdArray[2] = "mumu";
		int cnt = 3;
		String ID = ""; // ����ڰ� �Է��� ���̵��� �����Һ���
		String PASS = ""; //

		while (true) {
			System.out.println("*** ���� ���� ���α׷� ***"); // ���α׷� ����
			System.out.println("[1]�α���"); // �α��� ȭ��
			System.out.println("[2]ȸ������"); // ȸ������ ȭ��
			System.out.println("[3]���̵�/�н�����ã��"); //
			System.out.println("[4]����"); //
			System.out.println("�޴��� �����ϼ���._"); //

			String menu = sc.nextLine();

			switch (menu) {
			case "1":          //
				msg = "�α����� �����ϼ̽��ϴ�.";
				System.out.println(msg);
				System.out.println(StringArray[0]); //"���̵�:"
				ID = sc.nextLine();
				for (int i = 2; i < cnt; i++) {     /////////int i=0 �̸� "�н�����:";�� 3������
					if (idArray[i].equals(ID)) {          ///int i=1 �̸� "�н�����:";�� 2������
														/////int i=2 �̸� "�н�����:";�� 1������
														/////int i=3 �̸� "�н�����:";�� 0������
					} 
					System.out.println(StringArray[1]); //"�н�����:";
				}
				PASS = sc.nextLine();
				for (int i = 0; i < cnt; i++) {
					if (pwdArray[i].equals(ID)) {

						System.out.println("�α��ο� �����ϼ̽��ϴ�.");
						break;

						// id �Է��� ��������ºκ�
					} else {
						if (i == cnt-1) {
							// id �Է��� Ʋ������ºκ�
							System.out.println("�߸����Է��Դϴ�.");
						}
					} 
					//System.out.println("�α��ο� �����ϼ̽��ϴ�.");
					//break;

				}
				
				break;// �ٱ����� �����¹� ������ 2345 �ٽ���

			case "2":
				msg = "ȸ�������� �����ϼ̽��ϴ�.";
				System.out.println(msg);

				System.out.println(StringArray[0]);
				idArray[cnt] = sc.nextLine();

				System.out.println(StringArray[1]);
				pwdArray[cnt] = sc.nextLine();
				
				cnt++; // �迭�� �����ֱ� ���� ����.
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				System.out.println("�α��� �Ͻʽÿ�.");

				break;
			case "3":
				msg = "���̵�/�н����� ã�⸦ �����ϼ̽��ϴ�.";
				System.out.println(msg);
				break;
			case "4":
				msg = "���α׷��� �����մϴ�.";
				System.out.println(msg); // msg ���
				return;
			default:
				msg = "�޴������� �ùٸ��� �ʽ��ϴ�.";

			}
		}

	}

}
