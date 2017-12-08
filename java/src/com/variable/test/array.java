package com.variable.test;

public class array { 
	int x; ///heap의영역이기떄문에 메인메소드의 영역과는 다름. 중복처리 no

	public static void main(String[] args) {
		
		{
			int x; //main method 의영역 
			// int x; 같은영역에 있다면 변수 중복 에러
			//System.out.println(x); //
			{

				{ // int x; 같은영역에 있다면 변수 중복 에러
					int y; // 변수

				}

				{
					int y;// 독립적인 변수 y
				}
			}
		}		
		
		
		
		// 시간에 종속한 데이터는 모두 중요하다.
		// valus가 같더라도 index와같이 구분할수있는 무언가가 있으면 중복을 허용한다.
		// 중복을 허용하는지 안하는지에 대한 구분이 가능해야한다.
		// 1차원 배열 (행)
		int[] intArray = new int[5]; // 타입 []이름 = 공간할당,공간에 대한 입력값 '만들어 int타입의
										// 연속적인
		intArray[0] = 1; // 0번째 입력값 1
		intArray[1] = 2; // 1번째 입력값 2
		intArray[2] = 3; // 2번째 입력값 3
		intArray[3] = 4; // 3번째 입력값 4
		intArray[4] = 5; // 4번째 입력값 5

		int[] intArray2 = { 1, 2, 3, 4, 5 }; // 초기화에서만 사용가능

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5 }; // 새로운 배열을 할당할떄. new int
														// '재정의'할때.

		int[] intArray4 = new int[100]; // int형타입의 연속적인 100개의 배열선언

		for (int index = 0; index < intArray4.length; index++) { // 선언해준배열은
																	// 규칙적이므로
																	// for문으로 나열

			intArray4[index] = index + 1;

			System.out.print(intArray[index] + (intArray4[index] % 10 != 0 ? "," : "\n")); // for
																							// -->
																							// 삼항연산자로
																							// 짧게

		}

		// 2차원배열 ( 행 x 열 ) --> 배열안에 배열
		int[][] intArrays = new int[3][3]; // 3행에 3열의 배열.

		int[][] intArrays2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};

		int[][] scoreTable = {  {100,100,100 }, 
								{ 20, 20, 20 }, 
								{ 30, 30, 30 }, 
								{ 40, 40, 40 }, 
								{ 50, 50, 50 } };
		int total=0;
		
	/*	for (int row = 0; row < scoreTable.length; row++) {   ///행수로 토탈의 평균을 구하는 logic
			
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
	// avg값 나타내어라
}
