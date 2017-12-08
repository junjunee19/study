package weekend_homework1;

import java.util.Arrays;
import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		///////// quiz5
		/////////// 1~45까지의 정수 중에 중복없이임의 6개를 선택해서 출력하시오.
		/*
		 * Scanner sc = new Scanner(System.in); String[] lotto = new String[6];
		 * //사용자가 입력한 값을 저장해주기위한 배열 int random = (int)(Math.random()*45+1);
		 * //1부터45까지의 랜덤한 수
		 * 
		 * 
		 * int	
		 */
		
	
		System.out.println("출력할 세트 수를 입력하세요.");
		int set = Integer.parseInt(new Scanner(System.in).nextLine());  ///입력하는숫자를 받아서 set라는 변수에 입력

		for (int k = 0; k < set; k++) {

			int[] lottoNum = new int[45];
			for (int i = 0; i < lottoNum.length; i++) {
				lottoNum[i] = i + 1;                                      //?
			}
			int tempNum = 0; // 섞어줄떄 임시로 보관해줄용도
			int changeIndex = 0;
			for (int i = 0; i < lottoNum.length * 2; i++) {
				changeIndex = (int) (Math.random() * lottoNum.length); // 상수를
																		// 주는것보다
																		// 변수를
																		// 주는것이
																		// 낫다.
				tempNum = lottoNum[changeIndex];
				lottoNum[changeIndex] = lottoNum[0];
				lottoNum[0] = tempNum; // 바꿔준다

			}

			int[] output=new int[6];
			
					output=Arrays.copyOfRange(lottoNum, 0, 6);  //해당 Array를 copy를해서 그대로 옮겨주고 할당받으면된다.
					Arrays.sort(output);                     //()안을 오름차순으로 출력해준다
					System.out.println(Arrays.toString(output));//to String 
					
					
			

			for (int i = 0; i < 6; i++) {
				output[i]=lottoNum[i];           
				
				
			/*	
				System.out.print(lottoNum[i]);
				System.out.print(i == 5 ? "\n" : ", ");*/

			}
			Arrays.sort(output); ////////순서대로 나열해준다
			// 출력할 세트 수를 입력하시오.
			
			

		}
	}

}
