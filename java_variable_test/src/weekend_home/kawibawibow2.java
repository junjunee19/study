package weekend_home;

import java.util.Random;
import java.util.Scanner;

class kawibawibow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		//int random = (int) (Math.random() * 3 + 1); // 1~3의 랜덤수

		//System.out.println(random;

		int com; // 랜덤변수값
		int i ; // 사용자가 입력할값(1~3)
		int result = 0;

		boolean play = true;
		System.out.println("가위,바위,보 를시작합니다.");
		//String scanString;

		while (play){
			System.out.println("1(바위)2(가위)3(보)중 하나를선택하세요.");
			System.out.println("게임을 종료하려면 4를 선택하세요.");
			System.out.print("입력 :\n");
		i = scan.nextInt();
		System.out.println();
		com=random.nextInt(4);
		//scanString = scan.nextLine();
		//com = random.nextInt(3);
		com += 1;

		if (i == 1) {
			if (com == 1) {
				System.out.println("비겼습니다.");
				System.out.println("com=주먹");
			} else if (com == 2) {
				System.out.println("이겼습니다.");
				System.out.println("com=가위");
			} else if (com == 3) {
				System.out.println("졌습니다.");
				System.out.println("com=보");
			}
		} else if (i == 2) {
			System.out.println("졌습니다.");
			System.out.println("com=주먹");
		} else if (com == 2) {
			System.out.println("비겼습니다.");
			System.out.println("com=가위");
		} else if (com == 3) {
			System.out.println("이겼습니다.");
			System.out.println("com=보");
		}

		else if (i == 3) {
			System.out.println("이겼습니다.");
			System.out.println("com=주먹");
		} else if (com == 2) {
			System.out.println("com=가위");
			System.out.println("졌습니다.");
		} else if (com == 3) {
			System.out.println("비겼습니다.");
			System.out.println("com=보");

		} else if (i == 4) {
			System.out.println("게임을 종료하겠습니다.");
			play = false;
		} else
			System.out.println("잘못된 입력입니다.");
	}

	/*
	 * (scanString.equals("가위")) { scanValue = 0;
	 */
	}
}
