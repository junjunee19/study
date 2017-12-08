package work;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;

		answer = (int) (Math.random() * 100) + 1;
		// 1~100사이의 임의의 수를 저장
		Scanner scanner = new Scanner(System.in);
		// 스캐너객체를 이용 숫자를 입력받는다.
		do {
			System.out.println("1~100사이의 숫자정수 입력");
			String temp = scanner.nextLine();
			// 입력받은 숫자를 temp에 저장
			input = Integer.parseInt(temp);
			// 입력받은 문자열을 숫자로 변환하여 input에 저장

			// 임의의 숫자와 입력받은 숫자의 대소비교
			if (input > answer) {
				System.out.println("더 작은수를 입력해주세요.");
			} else if (input < answer) {
				System.out.println("더 큰수를 입력해주세요.");
			}

		} while (input != answer);
		// input(입력받은숫자)괴 answer(임의의 숫자)가 같아지게 되면 반복문 종료
		System.out.println("정답입니다! " + answer);
	}
}
