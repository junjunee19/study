package com.variable.test;

public class array { 
	int x; ///heap�ǿ����̱⋚���� ���θ޼ҵ��� �������� �ٸ�. �ߺ�ó�� no

	public static void main(String[] args) {
		
		{
			int x; //main method �ǿ��� 
			// int x; ���������� �ִٸ� ���� �ߺ� ����
			//System.out.println(x); //
			{

				{ // int x; ���������� �ִٸ� ���� �ߺ� ����
					int y; // ����

				}

				{
					int y;// �������� ���� y
				}
			}
		}		
		
		
		
		// �ð��� ������ �����ʹ� ��� �߿��ϴ�.
		// valus�� ������ index�Ͱ��� �����Ҽ��ִ� ���𰡰� ������ �ߺ��� ����Ѵ�.
		// �ߺ��� ����ϴ��� ���ϴ����� ���� ������ �����ؾ��Ѵ�.
		// 1���� �迭 (��)
		int[] intArray = new int[5]; // Ÿ�� []�̸� = �����Ҵ�,������ ���� �Է°� '����� intŸ����
										// ��������
		intArray[0] = 1; // 0��° �Է°� 1
		intArray[1] = 2; // 1��° �Է°� 2
		intArray[2] = 3; // 2��° �Է°� 3
		intArray[3] = 4; // 3��° �Է°� 4
		intArray[4] = 5; // 4��° �Է°� 5

		int[] intArray2 = { 1, 2, 3, 4, 5 }; // �ʱ�ȭ������ ��밡��

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5 }; // ���ο� �迭�� �Ҵ��ҋ�. new int
														// '������'�Ҷ�.

		int[] intArray4 = new int[100]; // int��Ÿ���� �������� 100���� �迭����

		for (int index = 0; index < intArray4.length; index++) { // �������ع迭��
																	// ��Ģ���̹Ƿ�
																	// for������ ����

			intArray4[index] = index + 1;

			System.out.print(intArray[index] + (intArray4[index] % 10 != 0 ? "," : "\n")); // for
																							// -->
																							// ���׿����ڷ�
																							// ª��

		}

		// 2�����迭 ( �� x �� ) --> �迭�ȿ� �迭
		int[][] intArrays = new int[3][3]; // 3�࿡ 3���� �迭.

		int[][] intArrays2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};

		int[][] scoreTable = {  {100,100,100 }, 
								{ 20, 20, 20 }, 
								{ 30, 30, 30 }, 
								{ 40, 40, 40 }, 
								{ 50, 50, 50 } };
		int total=0;
		
	/*	for (int row = 0; row < scoreTable.length; row++) {   ///����� ��Ż�� ����� ���ϴ� logic
			
			for(int col= 0; col< scoreTable.length[i]; col++){
				sum+=scoreTable[i][j];
			}

			total+= scoreTable.length;

			avg = sum/scoreTable.length;
			
			
		/
		//
*/		int korTotal=0;
		int engTotal=0;
		int mathTotal=0;
		for(int row = 0; row < scoreTable.length; row++){
			korTotal+=scoreTable[row][0];
			engTotal+=scoreTable[row][1];
			mathTotal+=scoreTable[row][2];   
			
			System.out.println("");
		}
				
			}
		
	
		

	
	// quiz
	// avg�� ��Ÿ�����
}
