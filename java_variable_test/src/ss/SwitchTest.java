package ss;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // �����Է¹ޱ����� ��ĳ�� �߰�
		
		System.out.println("*** ���� ���� ���α׷� ***"); //���α׷� ����
		System.out.println("[1]�α���"); //�α��� ȭ��
		System.out.println("[2]ȸ������"); //ȸ������ ȭ��
		System.out.println("[3]���̵�/�н�����ã��"); //
		System.out.println("[4]����"); //
		System.out.println("�޴��� �����ϼ���._"); //
		
		String menu = scan.nextLine(); //menu ������ ��ĳ�ʷ� �Է��Ѱ��� �����ϱ����� ��
		String msg=""; //msg ���� ���� string�� ������ �ȳ־ �ȴ�
		switch (menu) {
		case "1":
			msg="�α����� �����ϼ̽��ϴ�.";
			break;//�ٱ����� �����¹� ������ 2345 �ٽ���
		case "2":
			msg="ȸ�������� �����ϼ̽��ϴ�.";
			break;
		case "3":
			msg="���̵�/�н����� ã�⸦ �����ϼ̽��ϴ�.";
			break;
		case "4":
			msg="���α׷��� �����մϴ�.";
			System.out.println(msg); //msg ���
			return ;
		default:
			msg="�޴������� �ùٸ��� �ʽ��ϴ�.";
				
		}
		System.out.println(msg); //msg ��� 

	}

}
