package if_;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		if(조건식){
			종속문장
		}
		다음 문장
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("1. 쉬운 게임");
		System.out.println("2. 어려운 게임");
		System.out.println("3. 종료");
		System.out.print(">>>");
		num = sc.nextInt();
		if(num == 1)
			System.out.println("쉬운 게임 실행");
		else if(num == 2)
			System.out.println("어려운 게임 실행");
		else if(num == 3)
			System.out.println("종료");
		else
			System.out.println("잘못 입력");
		
	}
}
