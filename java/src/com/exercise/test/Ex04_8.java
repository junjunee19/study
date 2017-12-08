package com.exercise.test;

public class Ex04_8 {

	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			for (int y = 0; y < 11; y++) {
				if ((i * 2) + (y * 4) == 10) {
					System.out.println(i + "," + y);
				}

			}
		}
	}

}
