package weekend_home;

import java.util.Random;
import java.util.Scanner;

class updown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubR

		Scanner scan = new Scanner(System.in);

		int i = 0; // 사용자가 입력하는 값
		int cnt = 0;// 몇번 입력했는지 세어줄 변수

		String check = "N";
		boolean reGame = true;
		boolean isNumber = false;
		Random random = new Random();
		
		while (reGame) {


			int r = random.nextInt(100) + 1;// 1부터 100까지

			int a = 1;
			int b = 100; // 범위를 나타내어주는 변수 a,b
			cnt=0;
			// System.out.println(r);
			System.out.println("수를 결정하였습니다. 맞추어보세요.");
			System.out.println("1~100");
			
			while (true) {

				cnt++; // 초기화가 cnt = 0 이였으므로

				System.out.print(cnt + "--");// 1부터 카운트시작!

				i = scan.nextInt();

				if (i > r) {
					System.out.println("down!");
					b = i;
					System.out.println(a + "-" + b);//
				}

				else if (i < r) {
					System.out.println("up!");
					a = i;
					System.out.println(a + "-" + b);

				} else {
					System.out.println("정답입니다.");
					System.out.println("다시하시겠습니까?(y/n)");

					check = scan.next().toUpperCase();
					if (check.equals("N")) {
						reGame = false;
						//게임을 끝내기위한 값
						break;
						//게임초기화하기위해 안쪽 while나가기
					}else{
						break;
						//게임초기화하기위해 안쪽 while나가기
					}
				}

			}
		}
		System.out.println("END");
	}
}
