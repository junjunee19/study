package weekend_homework1;

import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		// 학생 3명의 이름과 국/영/수 점수를 입력받아 각각의 학생의 평균을 출력하는
		// 프로그램을 작성하시오.
		// 실행결과}
		// 1번학생
		// 이름: kim
		// 국어:
		// 영어
		// 수학
		// 2번학생
		// ,
		// ,
		// 1번 kim 평균 = 59점
		// 2번 lala평균 = 75점
		/////파일에러남 검토필요.
		String[][] studentArray = new String[3][4]; // 3행4열 같은타입으로 해야되기떄문에
													// int가아닌 string으로
													// 숫자받으면 parse 해줘야함
		Scanner scan = new Scanner(System.in);		// Integer.parseInt <----파싱처리 string을 int로 변환

		// 입력

		for (int num = 1; num < studentArray.length; num++) {
			System.out.println(num + "번 학생"); /// num번쨰학생 ex)1번 2번학생...
			System.out.println("이름 : ");			studentArray[num-1][0] = scan.nextLine();
			System.out.println("국어 : ");
			studentArray[num-1][1] = scan.nextLine();
			System.out.println("수학 : ");
			studentArray[num-1][2] = scan.nextLine();
			System.out.println("영어 : ");
			studentArray[num-1][0] = scan.nextLine();

		} // 출력

		int total = 0;
		for (int num = 1; num < studentArray.length; num++) {
			total
			= Integer.parseInt(studentArray[num-1][1]) + Integer.parseInt(studentArray[num-1][2])
					+ Integer.parseInt(studentArray[num-1][3]);

			System.out.println(num-1 + "번 " + studentArray[num-1][0] + " 평균 " + (total / (studentArray[num-1].length - 1)));
		}

	}  

}
