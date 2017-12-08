package work;

import java.util.Scanner;

public class Gawibawibo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1:가위 2:바위 3:보 를입력하세요.");
		int user = scan.nextInt();
		int computer = (int) (Math.random() * 3 + 1);
		System.out.println("당신은" + user + "를 냈습니다.");
		System.out.println("컴퓨터는" + computer + "를 냈습니다.");
		switch (user - computer) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case -2:
		case 1:
			System.out.println("이겼습니다.");
			break;
		case -1:
		case 2:
			System.out.println("졌습니다.");
			break;

		}
	}

}
