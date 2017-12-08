package com.string.test;

public class StringTest {

	public static void main(String[] args) {
		
		
		String msg="12345678";// 일종의클래스 문자열을 만들어 주는 클래스타입(reference)
		       
		System.out.println(msg); //출력문 = 반갑습니다.
		System.out.println("문자열길이  :"+msg.length());  //문자열의 길이
		System.out.println("문자열 비교 : "+msg.equals("바바바")); ///.equals(비교하고자하는대상)
		System.out.println("문자탐색 : "+msg.contains("반갑")); //msg안에 반갑이라는 단어가 포함되어있냐
		System.out.println("비교 인덱스 반환 : "+msg.indexOf("니다"));//()
		System.out.println("index의 글자 반환:"+msg.charAt(2)); //index의 글자 반환:습
		System.out.println("빈문자열 확인:"+msg.isEmpty()); // false 떨어짐 //i 존재여부 (있느냐)
		System.out.println("문자열 교체 "+msg.replace("반갑습", "감사함"));//msg에있는 반갑습=>감사함 (대체)
		System.out.println("문자열 잘라내기:"+msg.substring(0,3));// 인덱스0~3(이전까지) : 0.1.2.(반갑습)
		System.out.println("대문자 변환 :"+msg.toUpperCase());
		System.out.println("소문자 변환 :"+msg.toLowerCase()); //to:~로 변환(금융권에서 많이사용)
		                                                  
		boolean isNumber=true;
		for(int index=0;index<msg.length();index++){
			System.out.println(msg.charAt(index));
			char ch =msg.charAt(index);
			
			if(!(ch>=48 && ch<=57)){//숫자범위 이항연산자(int이하는 모두int로 바꾼다.)
				isNumber=false;
				
				
			}
			
			
			
		
		}
		System.out.println(isNumber?"숫자":"숫자가 아님");
		
	}
	
	

}
