package weekend_homework1;

import java.util.Arrays;
import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		///////// quiz5
		/////////// 1~45������ ���� �߿� �ߺ��������� 6���� �����ؼ� ����Ͻÿ�.
		/*
		 * Scanner sc = new Scanner(System.in); String[] lotto = new String[6];
		 * //����ڰ� �Է��� ���� �������ֱ����� �迭 int random = (int)(Math.random()*45+1);
		 * //1����45������ ������ ��
		 * 
		 * 
		 * int	
		 */
		
	
		System.out.println("����� ��Ʈ ���� �Է��ϼ���.");
		int set = Integer.parseInt(new Scanner(System.in).nextLine());  ///�Է��ϴ¼��ڸ� �޾Ƽ� set��� ������ �Է�

		for (int k = 0; k < set; k++) {

			int[] lottoNum = new int[45];
			for (int i = 0; i < lottoNum.length; i++) {
				lottoNum[i] = i + 1;                                      //?
			}
			int tempNum = 0; // �����ً� �ӽ÷� �������ٿ뵵
			int changeIndex = 0;
			for (int i = 0; i < lottoNum.length * 2; i++) {
				changeIndex = (int) (Math.random() * lottoNum.length); // �����
																		// �ִ°ͺ���
																		// ������
																		// �ִ°���
																		// ����.
				tempNum = lottoNum[changeIndex];
				lottoNum[changeIndex] = lottoNum[0];
				lottoNum[0] = tempNum; // �ٲ��ش�

			}

			int[] output=new int[6];
			
					output=Arrays.copyOfRange(lottoNum, 0, 6);  //�ش� Array�� copy���ؼ� �״�� �Ű��ְ� �Ҵ������ȴ�.
					Arrays.sort(output);                     //()���� ������������ ������ش�
					System.out.println(Arrays.toString(output));//to String 
					
					
			

			for (int i = 0; i < 6; i++) {
				output[i]=lottoNum[i];           
				
				
			/*	
				System.out.print(lottoNum[i]);
				System.out.print(i == 5 ? "\n" : ", ");*/

			}
			Arrays.sort(output); ////////������� �������ش�
			// ����� ��Ʈ ���� �Է��Ͻÿ�.
			
			

		}
	}

}
