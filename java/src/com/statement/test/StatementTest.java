package com.statement.test;

import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor;
		int eng;
		int math;

		Scanner scan = new Scanner(System.in);
		System.out.print("국어:");
		kor = Integer.parseInt(scan.nextLine());
		System.out.print("영어:");
		eng = Integer.parseInt(scan.nextLine());
		System.out.print("수어:");
		math = Integer.parseInt(scan.nextLine());

		float avg = (kor + eng + math) / 3f;
		String grade = "";
		switch ((int) (avg / 10)) {
		case 10:
		case 9: // break를 걸지않고 9로 넘긴다
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);

	}

}
