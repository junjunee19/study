package com.string.test;

public class StringTest {

	public static void main(String[] args) {

		String msg = "123485a6";// 문자열이 msg 저장

		System.out.println(msg); // msg 출력
		System.out.println("문자열길이 : " + msg.length()); // 문자열 길이를 알고싶을때 쓰는 함수
		System.out.println("문자열비교 : " + msg.equals("바바바")); // "바바바"랑값이같은지 확인하는 함수
		System.out.println("문자탐색 : " + msg.contains("반값")); // 문자에 반값이 있으면 true 확인 하는 함수
		System.out.println("비교 인덱스 반환 : " + msg.indexOf("니다")); // 반갑습니다 차례대로 01234 니가 걸리니까 3 반환
		System.out.println("index의 글자반환 : " + msg.charAt(2));// 인덱스가 2인 한글자를 가져와라
		System.out.println("빈문자열 확인 : " + msg.isEmpty());// 빈문자열 있으면 false 없으면 true 이름검사
		System.out.println("문자열 교체 : " + msg.replace("반갑습", "감사함"));// msg 문자열 중에 반갑습이라는 문자열을 감사함으로 바꿈
		System.out.println("문자열 잘라내기 : " + msg.substring(0, 3));// 인덱스 0부터 3이전까지 (0,1,2) 빼고 잘라냄
		System.out.println("대문자 변환 : " + msg.toUpperCase()); // 대문자로 변환 공인인증서에서많이씀
		System.out.println("소문자 변환 : " + msg.toLowerCase()); // 소문자로 변환
		// msg 값은 변하지않고 반환함 ※영소문자 구별법 한글자씩 빼서 아스키 코드로 봄
		boolean isNumber = true; // 신호등 역활

		for (int index = 0; index < msg.length(); index++) { // 한글자씩 뽑는 for문
			System.out.println(msg.charAt(index));// 캐릭터로 반환
			char ch = msg.charAt(index);

			if (!(ch >= 48 && ch <= 57)) { // 이항연산자에서 int로 자동변환 돼서 ch의 ascii 값이 나옴
				isNumber = false;
			}

		}

		System.out.println(isNumber ? "숫자" : "숫자가 아님");
	}

}
