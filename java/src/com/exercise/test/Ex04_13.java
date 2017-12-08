package com.exercise.test;

public class Ex04_13 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true; //플래그 변수
		//charAt(int i) 반복문과를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다
		for (int i = 0; i < value.length(); i++) {
			ch=value.charAt(i);
			if (ch>'0' && ch<='9') {
				isNumber=false;
				break; //만나는 순간 for의 반복을 멈추게한다
						//만약 for문안에 스위치문이있으면 break로 스위치만멈춤 for 문 못멈춤
			}
		}
		if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
	
	}	

}
