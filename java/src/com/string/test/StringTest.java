package com.string.test;

public class StringTest {

	public static void main(String[] args) {

		String msg = "123485a6";// ���ڿ��� msg ����

		System.out.println(msg); // msg ���
		System.out.println("���ڿ����� : " + msg.length()); // ���ڿ� ���̸� �˰������ ���� �Լ�
		System.out.println("���ڿ��� : " + msg.equals("�ٹٹ�")); // "�ٹٹ�"�����̰����� Ȯ���ϴ� �Լ�
		System.out.println("����Ž�� : " + msg.contains("�ݰ�")); // ���ڿ� �ݰ��� ������ true Ȯ�� �ϴ� �Լ�
		System.out.println("�� �ε��� ��ȯ : " + msg.indexOf("�ϴ�")); // �ݰ����ϴ� ���ʴ�� 01234 �ϰ� �ɸ��ϱ� 3 ��ȯ
		System.out.println("index�� ���ڹ�ȯ : " + msg.charAt(2));// �ε����� 2�� �ѱ��ڸ� �����Ͷ�
		System.out.println("���ڿ� Ȯ�� : " + msg.isEmpty());// ���ڿ� ������ false ������ true �̸��˻�
		System.out.println("���ڿ� ��ü : " + msg.replace("�ݰ���", "������"));// msg ���ڿ� �߿� �ݰ����̶�� ���ڿ��� ���������� �ٲ�
		System.out.println("���ڿ� �߶󳻱� : " + msg.substring(0, 3));// �ε��� 0���� 3�������� (0,1,2) ���� �߶�
		System.out.println("�빮�� ��ȯ : " + msg.toUpperCase()); // �빮�ڷ� ��ȯ �����������������̾�
		System.out.println("�ҹ��� ��ȯ : " + msg.toLowerCase()); // �ҹ��ڷ� ��ȯ
		// msg ���� �������ʰ� ��ȯ�� �ؿ��ҹ��� ������ �ѱ��ھ� ���� �ƽ�Ű �ڵ�� ��
		boolean isNumber = true; // ��ȣ�� ��Ȱ

		for (int index = 0; index < msg.length(); index++) { // �ѱ��ھ� �̴� for��
			System.out.println(msg.charAt(index));// ĳ���ͷ� ��ȯ
			char ch = msg.charAt(index);

			if (!(ch >= 48 && ch <= 57)) { // ���׿����ڿ��� int�� �ڵ���ȯ �ż� ch�� ascii ���� ����
				isNumber = false;
			}

		}

		System.out.println(isNumber ? "����" : "���ڰ� �ƴ�");
	}

}
