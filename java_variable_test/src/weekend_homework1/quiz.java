package weekend_homework1;

import java.util.Scanner;

public class quiz { ///

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); /// 콘솔창에서 입력받기위해 스캐너라는클래스를 불러옴

		String[] idArray = new String[100]; // 사용자가 회원가입시 입력하는 아이디값
		String[] pwdArray = new String[100]; // 사용자가 회원가입시 입력하는 패스워드값
		String msg = "";
		String[] StringArray = new String[2];
		StringArray[0] = "아이디:";    
		StringArray[1] = "패스워드:";
		String[] name = new String[3];
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";
		pwdArray[0] = "mimi";
		pwdArray[1] = "mama";
		pwdArray[2] = "mumu";
		int cnt = 3;
		String ID = ""; // 사용자가 입력할 아이디값을 저장할변수
		String PASS = ""; //

		while (true) {
			System.out.println("*** 도서 관리 프로그램 ***"); // 프로그램 글자
			System.out.println("[1]로그인"); // 로그인 화면
			System.out.println("[2]회원가입"); // 회원가입 화면
			System.out.println("[3]아이디/패스워드찾기"); //
			System.out.println("[4]종료"); //
			System.out.println("메뉴를 선택하세요._"); //

			String menu = sc.nextLine();

			switch (menu) {
			case "1":          //
				msg = "로그인을 선택하셨습니다.";
				System.out.println(msg);
				System.out.println(StringArray[0]); //"아이디:"
				ID = sc.nextLine();
				for (int i = 2; i < cnt; i++) {     /////////int i=0 이면 "패스워드:";가 3번나옴
					if (idArray[i].equals(ID)) {          ///int i=1 이면 "패스워드:";가 2번나옴
														/////int i=2 이면 "패스워드:";가 1번나옴
														/////int i=3 이면 "패스워드:";가 0번나옴
					} 
					System.out.println(StringArray[1]); //"패스워드:";
				}
				PASS = sc.nextLine();
				for (int i = 0; i < cnt; i++) {
					if (pwdArray[i].equals(ID)) {

						System.out.println("로그인에 성공하셨습니다.");
						break;

						// id 입력이 맞을떄출력부분
					} else {
						if (i == cnt-1) {
							// id 입력이 틀릴떄출력부분
							System.out.println("잘못된입력입니다.");
						}
					} 
					//System.out.println("로그인에 성공하셨습니다.");
					//break;

				}
				
				break;// 바깥으로 나가는문 없으면 2345 다실행

			case "2":
				msg = "회원가입을 선택하셨습니다.";
				System.out.println(msg);

				System.out.println(StringArray[0]);
				idArray[cnt] = sc.nextLine();

				System.out.println(StringArray[1]);
				pwdArray[cnt] = sc.nextLine();
				
				cnt++; // 배열을 맞춰주기 위한 변수.
				System.out.println("회원가입이 완료되었습니다.");
				System.out.println("로그인 하십시오.");

				break;
			case "3":
				msg = "아이디/패스워드 찾기를 선택하셨습니다.";
				System.out.println(msg);
				break;
			case "4":
				msg = "프로그램을 종료합니다.";
				System.out.println(msg); // msg 출력
				return;
			default:
				msg = "메뉴선택이 올바르지 않습니다.";

			}
		}

	}

}
