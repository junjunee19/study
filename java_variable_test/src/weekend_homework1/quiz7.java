package weekend_homework1;

import java.util.Arrays;
import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {
		// 임의릐 숫자 7개를 입력받아 가장큰수와 가장 작은수를 출력하는 프로그램을 작성하시오

		// 실행결과)
		// 1번째: 숫자 :45                      String울 받을수있는 references1변수의 배열
		// 2번쨰: 숫자 :97
		// ...
		// 7번째: 숫자 : 43
		// max num : 149
		// min num : 8
		Scanner scan = new Scanner(System.in);

		int[] intArray = new int[7];   //// references 형의 참조변수
		
		for (int i = 1; i < intArray.length; i++) {
			System.out.print((i + 1) + "번째 숫자: "); // 입력받은 숫자를 어레이에 담아라
			intArray[i]= Integer.parseInt(scan.nextLine());

		}
		// 입력

		Arrays.sort(intArray); // 정렬
		
		System.out.println("max num : " + intArray[intArray.length - 1]);
		System.out.println("max num : " + intArray[0]);

	}

}
