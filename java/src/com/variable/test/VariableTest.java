/*package com.variable.test;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// TODO Auto-generated method stub
		int kor; // kor ���� ���� �� ������ 80 ����
		int eng; // eng ���� ���� �� ������ 80 ����
		int math; // math ���� ���� �� ������ 80 ����
		String answer = "";
		boolean scoreStr= false;
		boolean isNumber= true;
		int score =0;
		// Quiz 3
		// �ԷµǴ� ���� ������ �����ϸ� 0~100 ���̿� ������ �����ϵ���
		// '����Ͻðڽ���0��?(y/n)' �޼����� ����ϰ�
		// 'n' �ϋ� ���� �ݺ�
		while (!answer.equals("n")) {
			
			score =0;
			String msg = "";
			System.out.print("�������� : ");
			kor = Integer.parseInt(scan.nextLine()); // �ٴ����� �Է¹��� scan�� ������
			char checkchar=' ';								// error	// ���ʰ� �������� �ٸ�0
					
			for(int i=0;i<msg.length();i++)	{
				checkChar=msg.charAt(i);
				if(checkChar>='0' && checkChar<=9)
					isNumber=true;
			}
			
			//������������ ���� �Ǵ�
			//0~100 ����
			if(isNumber){
				score=Integer.parseInt(scoreStr);
				if(!(score>=0 && score<=100)){
					isNnumber=false;
					msg="0~100������ ������ �Է��Ͻʽÿ�."
				}
			}
			System.out.print("�������� : ");
			eng=score;
			eng = Integer.parseInt(scan.nextLine()); // println �Ⱦ������� > Ŀ���� ������
			System.out.print("�������� : ");
			math = Integer.parseInt(scan.nextLine()); //

			int total = kor + eng + math; // total �̶�� ������ �������հ��� �����ϱ� ���� ��
			float avg = total / 3; // total/3 �Ҷ� ������ ����� �Ǳ� ������ �Ҽ����� ������ �ȴ�.
									// �Ҽ��� ���� ����Ϸ��� 3�� 3.0f �� �ٲپ ���� �Ҽ� ������ �����
									// ��

			System.out.println("���� : " + total); // ������ ����ϴ� ��
			System.out.println("��� : " + avg); // ����� ����ϴ� ��

			// Quiz 2)
			// ����� 90�̻� : A
			// ����� 80�̻� : B
			// ����� 80�̸� : F �� ����Ͻÿ�

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			System.out.println("���� : " + grade);// ���� ��Ծ����� �־����� ��

			String gradeIf = ""; // ���ڿ� �����̽� ���൵ ��
			if (avg >= 90) {
				gradeIf = "A";
				if (avg >= 95) {
					gradeIf = gradeIf + "+"; // ��Ʈ���� �ѱ����� ��Ʈ���̿��� �� ��Ʈ������ ����
				}
			} else if (avg >= 80) { // avg<90�� �ʿ����
				gradeIf = "b";
				if (avg >= 85) {
					gradeIf = gradeIf + "+";
				} // ��ø if�� �α��� ȸ������
			} else { // ���� if�� �ݵ��� ������
				// ���������� ���� +1 ��+1 �̱� hint 012 3����
				// min max �� ���� ������
				gradeIf = "f";
			}

			System.out.println(gradeIf);
			System.out.println();
			System.out.print("����Ͻðڽ��ϱ�?(y/n)");
			answer=scan.nextLine().toLowerCase();
			
		}
	}

}
*/