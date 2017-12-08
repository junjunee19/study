/*package com.variable.test;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// TODO Auto-generated method stub
		int kor; // kor 변수 선언 및 변수에 80 저장
		int eng; // eng 변수 선언 및 변수에 80 저장
		int math; // math 변수 선언 및 변수에 80 저장
		String answer = "";
		boolean scoreStr= false;
		boolean isNumber= true;
		int score =0;
		// Quiz 3
		// 입력되는 값은 정수만 가능하며 0~100 사이에 정수만 가능하도록
		// '계속하시겠습니0까?(y/n)' 메세지를 출력하고
		// 'n' 일떄 까지 반복
		while (!answer.equals("n")) {
			
			score =0;
			String msg = "";
			System.out.print("국어점수 : ");
			kor = Integer.parseInt(scan.nextLine()); // 줄단위로 입력받음 scan만 있으면
			char checkchar=' ';								// error	// 왼쪽과 파일형이 다름0
					
			for(int i=0;i<msg.length();i++)	{
				checkChar=msg.charAt(i);
				if(checkChar>='0' && checkChar<=9)
					isNumber=true;
			}
			
			//숫자형인지에 대한 판단
			//0~100 숫자
			if(isNumber){
				score=Integer.parseInt(scoreStr);
				if(!(score>=0 && score<=100)){
					isNnumber=false;
					msg="0~100사이의 점수를 입력하십시오."
				}
			}
			System.out.print("영어점수 : ");
			eng=score;
			eng = Integer.parseInt(scan.nextLine()); // println 안쓰는이유 > 커서가 떨어짐
			System.out.print("수학점수 : ");
			math = Integer.parseInt(scan.nextLine()); //

			int total = kor + eng + math; // total 이라는 변수에 점수총합값을 저장하기 위한 식
			float avg = total / 3; // total/3 할때 정수의 계산이 되기 때문에 소수점을 버리게 된다.
									// 소수점 까지 출력하려면 3을 3.0f 로 바꾸어서 정수 소수 연산을 만들면
									// 됨

			System.out.println("총점 : " + total); // 총점을 출력하는 식
			System.out.println("평균 : " + avg); // 평균을 출력하는 식

			// Quiz 2)
			// 평균이 90이상 : A
			// 평균이 80이상 : B
			// 평균이 80미만 : F 를 출력하시오

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			System.out.println("학점 : " + grade);// 먼지 어떻게쓰는지 왜쓰는지 중

			String gradeIf = ""; // 문자열 스페이스 안줘도 됨
			if (avg >= 90) {
				gradeIf = "A";
				if (avg >= 95) {
					gradeIf = gradeIf + "+"; // 스트링은 한군데만 스트링이여도 다 스트링으로 통일
				}
			} else if (avg >= 80) { // avg<90는 필요없다
				gradeIf = "b";
				if (avg >= 85) {
					gradeIf = gradeIf + "+";
				} // 중첩 if문 로그인 회원가입
			} else { // 병렬 if문 금도끼 은도끼
				// 가위바위보 가위 +1 보+1 이김 hint 012 3나눔
				// min max 값 조절 스무고개
				gradeIf = "f";
			}

			System.out.println(gradeIf);
			System.out.println();
			System.out.print("계속하시겠습니까?(y/n)");
			answer=scan.nextLine().toLowerCase();
			
		}
	}

}
*/