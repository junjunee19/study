package com.variable.test;

public class OperatorTest {

	public static void main(String[] args) {

		// ���׿�����
		int i = 0;
		// ++i, i++
		++i; // �̷��� ���
		System.out.println("i+1=" + (i++)); // �̷��� ������
		System.out.println("i=" + i); // ���� i ���� �˾ƺ��� ��¹�

		i = i - 1; // --i, i-- //��������
		System.out.println("i-1" + i);// ��������

		// ���������
		int x = 10, y = 2; // x,y ������ �����ϰ� ���� 10,2 ��� ���� ������
		char ch = 'A'; // ĳ���� ch ������ =A ���� ������
		ch = 65; // CH�� 'A'�� ASCI �ڵ尪�� 65�� ���� Char �����⶧���� ch������ a�� �����

		int sum = x + y; // x + y ���� 10 +2 ���� sum ������ ����
		int sub = x - y; // x - y ���갪�� sub ������ ����
		int multi = x * y; // multi ������ �� ����
		float div = x / (y * 1.0f); // div��� ������ x/y(�Ǽ�) �� ����
		int mock = x / y; // mock���ٰ� x/y ���� �� ����
		int namuji = x % y; // ������ ����

		int chSumInt = ch + 3; // int �� chsumint�� ch(65)+3 ������ �� int chsumint ���� 68
		char chSumInt2 = (char) chSumInt; // ������ char�� ����ȯ�� �ؼ� ASCI �ڵ�68�� D�� ����

		System.out.println("x+y=" + sum); // 12
		System.out.println("x-y=" + sub); // 8
		System.out.println("x*y=" + multi); // 20
		System.out.println("x/y=" + div); // �Ǽ� ���� ������ �߱⋚���� �Ҽ��� �ڸ��� 5.0
		System.out.println("��:x/y=" + mock);// 5
		System.out.println("������ : x/y=" + namuji);// 0
		System.out.println("������ : char + int =" + chSumInt2);// D

		// 1234.56789 �� ���� �Ҽ��� ��°�ڸ����� �ݿø��Ͻÿ�
		float z = 1234.56789f; // �������������
		int zz = (int) (z * 100 + 0.5);// 123457 ����
		float up = (float) zz / 100; // 1234.57 ����
		System.out.println("�ݿø��Ѱ� : " + up);// ���

		// z-((int)((roundNum+0.005f)/100));

		// �񱳿�����

		System.out.println("x > y :" + (x > y)); // x>y ���� true or false�� ���
		System.out.println("x >= y :" + (x >= y)); // x>=y ���� true or false�� ���
		System.out.println("x < y :" + (x < y)); // true or false�� ���
		System.out.println("x <= y :" + (x <= y)); // true or false�� ���
		System.out.println("x == y :" + (x == y)); // true or false�� ���
		System.out.println("x != y :" + (x != y)); // true or false�� ���

		// ���׿�����
		// (���ǽ�) ? A(true) : B(false)
		int kor = 92;

		System.out.println("�������� ���� :" + ((kor >= 90) ? "A" : "F")); // ������ 90 �̻��̸� ���׿����ڿ� ����
																		// a�� f�� ���

		// ��������
		int k = 9; // k�� 9
		int l = 10; // i�� 10�� ���� �� ����

		System.out.println(k > 9 && (l = 11) > 10);// k>9 �������Ѵ�. k>9 false �̸� �ٷ�
													// out

		System.out.println(l); // i���� ���߳� �Ⱥ��߳� Ȯ���ϴ� ����

		l = 10; // or �� �˾ƺ������� i�� �ٽ� �ʱ�ȭ ��Ų��

		System.out.println(k > 9 || (l = 11) > 10);// ù���� Ʈ��⶧���� �ڿ��� 10 ������
													// false�̸� ���ױ��� ���� 11
		System.out.println(l); // i���� ���߳� �Ⱥ��߳� Ȯ���ϴ� ����

		// ���Կ�����

		int m = 0;
		m = m + 1; // m +=1; �Ⱦ��� �����־ ���ʿ�x
		m = m + 1;
		m = m + 1;
		m = m + 1;
		System.out.println("m=m+1 : " + m);

	}

}
