package ss;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 값을입력받기위에 스캐너 추가
		
		System.out.println("*** 도서 관리 프로그램 ***"); //프로그램 글자
		System.out.println("[1]로그인"); //로그인 화면
		System.out.println("[2]회원가입"); //회원가입 화면
		System.out.println("[3]아이디/패스워드찾기"); //
		System.out.println("[4]종료"); //
		System.out.println("메뉴를 선택하세요._"); //
		
		String menu = scan.nextLine(); //menu 변수에 스캐너로 입력한값을 저장하기위한 문
		String msg=""; //msg 변수 선언 string은 공백을 안넣어도 된다
		switch (menu) {
		case "1":
			msg="로그인을 선택하셨습니다.";
			break;//바깥으로 나가는문 없으면 2345 다실행
		case "2":
			msg="회원가입을 선택하셨습니다.";
			break;
		case "3":
			msg="아이디/패스워드 찾기를 선택하셨습니다.";
			break;
		case "4":
			msg="프로그램을 종료합니다.";
			System.out.println(msg); //msg 출력
			return ;
		default:
			msg="메뉴선택이 올바르지 않습니다.";
				
		}
		System.out.println(msg); //msg 출력 

	}

}
