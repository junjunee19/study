package com.string.test;

public class StringTest {

	public static void main(String[] args) {
		
		
		String msg="12345678";// ������Ŭ���� ���ڿ��� ����� �ִ� Ŭ����Ÿ��(reference)
		       
		System.out.println(msg); //��¹� = �ݰ����ϴ�.
		System.out.println("���ڿ�����  :"+msg.length());  //���ڿ��� ����
		System.out.println("���ڿ� �� : "+msg.equals("�ٹٹ�")); ///.equals(���ϰ����ϴ´��)
		System.out.println("����Ž�� : "+msg.contains("�ݰ�")); //msg�ȿ� �ݰ��̶�� �ܾ ���ԵǾ��ֳ�
		System.out.println("�� �ε��� ��ȯ : "+msg.indexOf("�ϴ�"));//()
		System.out.println("index�� ���� ��ȯ:"+msg.charAt(2)); //index�� ���� ��ȯ:��
		System.out.println("���ڿ� Ȯ��:"+msg.isEmpty()); // false ������ //i ���翩�� (�ִ���)
		System.out.println("���ڿ� ��ü "+msg.replace("�ݰ���", "������"));//msg���ִ� �ݰ���=>������ (��ü)
		System.out.println("���ڿ� �߶󳻱�:"+msg.substring(0,3));// �ε���0~3(��������) : 0.1.2.(�ݰ���)
		System.out.println("�빮�� ��ȯ :"+msg.toUpperCase());
		System.out.println("�ҹ��� ��ȯ :"+msg.toLowerCase()); //to:~�� ��ȯ(�����ǿ��� ���̻��)
		                                                  
		boolean isNumber=true;
		for(int index=0;index<msg.length();index++){
			System.out.println(msg.charAt(index));
			char ch =msg.charAt(index);
			
			if(!(ch>=48 && ch<=57)){//���ڹ��� ���׿�����(int���ϴ� ���int�� �ٲ۴�.)
				isNumber=false;
				
				
			}
			
			
			
		
		}
		System.out.println(isNumber?"����":"���ڰ� �ƴ�");
		
	}
	
	

}
