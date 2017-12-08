package com.variable.test;

public class OperatorTest {

	public static void main(String[] args) {

		// 단항연산자
		int i = 0;
		// ++i, i++
		++i; // 이렇게 사용
		System.out.println("i+1=" + (i++)); // 이렇게 사용안함
		System.out.println("i=" + i); // 현재 i 값을 알아보는 출력문

		i = i - 1; // --i, i-- //음수버젼
		System.out.println("i-1" + i);// 음수버젼

		// 산술연산자
		int x = 10, y = 2; // x,y 변수를 선언하고 각각 10,2 라는 값을 저장함
		char ch = 'A'; // 캐릭터 ch 변수에 =A 값을 저장함
		ch = 65; // CH에 'A'의 ASCI 코드값인 65를 넣음 Char 변수기때문에 ch변수는 a가 저장됨

		int sum = x + y; // x + y 연산 10 +2 값을 sum 변수에 저장
		int sub = x - y; // x - y 연산값을 sub 변수에 저장
		int multi = x * y; // multi 변수에 곱 저장
		float div = x / (y * 1.0f); // div라는 변수에 x/y(실수) 를 저장
		int mock = x / y; // mock에다가 x/y 나눈 몫 저장
		int namuji = x % y; // 나머지 저장

		int chSumInt = ch + 3; // int 형 chsumint에 ch(65)+3 을저장 즉 int chsumint 값은 68
		char chSumInt2 = (char) chSumInt; // 하지만 char로 형변환을 해서 ASCI 코드68인 D를 저장

		System.out.println("x+y=" + sum); // 12
		System.out.println("x-y=" + sub); // 8
		System.out.println("x*y=" + multi); // 20
		System.out.println("x/y=" + div); // 실수 정수 연산을 했기떄문에 소수점 자리인 5.0
		System.out.println("몫:x/y=" + mock);// 5
		System.out.println("나머지 : x/y=" + namuji);// 0
		System.out.println("문자형 : char + int =" + chSumInt2);// D

		// 1234.56789 의 수에 소수점 세째자리에서 반올림하시오
		float z = 1234.56789f; // 변수선언및저장
		int zz = (int) (z * 100 + 0.5);// 123457 만듬
		float up = (float) zz / 100; // 1234.57 만듬
		System.out.println("반올림한값 : " + up);// 출력

		// z-((int)((roundNum+0.005f)/100));

		// 비교연산자

		System.out.println("x > y :" + (x > y)); // x>y 값에 true or false를 출력
		System.out.println("x >= y :" + (x >= y)); // x>=y 값에 true or false를 출력
		System.out.println("x < y :" + (x < y)); // true or false를 출력
		System.out.println("x <= y :" + (x <= y)); // true or false를 출력
		System.out.println("x == y :" + (x == y)); // true or false를 출력
		System.out.println("x != y :" + (x != y)); // true or false를 출력

		// 삼항연산자
		// (조건식) ? A(true) : B(false)
		int kor = 92;

		System.out.println("국어점수 레벨 :" + ((kor >= 90) ? "A" : "F")); // 레벨이 90 이상이면 삼항연산자에 의해
																		// a나 f를 출력

		// 논리연산자
		int k = 9; // k에 9
		int l = 10; // i에 10을 선언 및 저장

		System.out.println(k > 9 && (l = 11) > 10);// k>9 만실행한다. k>9 false 이면 바로
													// out

		System.out.println(l); // i값이 변했나 안변했나 확인하는 문장

		l = 10; // or 을 알아보기위해 i를 다시 초기화 시킨다

		System.out.println(k > 9 || (l = 11) > 10);// 첫항이 트루기때문에 뒤에는 10 하지만
													// false이면 뒷항까지 봐서 11
		System.out.println(l); // i값이 변했나 안변했나 확인하는 문장

		// 대입연산자

		int m = 0;
		m = m + 1; // m +=1; 안쓴다 버그있어서 알필요x
		m = m + 1;
		m = m + 1;
		m = m + 1;
		System.out.println("m=m+1 : " + m);

	}

}
