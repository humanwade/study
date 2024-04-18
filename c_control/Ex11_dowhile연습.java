package c_control;

import java.util.*;
public class Ex11_dowhile연습 {

	public static void main(String[] args) {

		//구구단을 입력받아서 해당 구구단을 출력해주세요

		Scanner sc = new Scanner(System.in);

		//		//[1]
		//		System.out.println("구구단 몇 번 반복할까요?");
		//		int num = sc.nextInt();
		//
		//		for(int j = 0 ; j < num ; j++) {
		//			System.out.println("구구단을 입력해주세요");
		//
		//			int dan = sc.nextInt();
		//
		//			for (int i = 1 ; i <= 9 ; i++) {
		//				System.out.printf("%d * %d = %d \n" , dan, i, dan*i);
		//			}
		//		}

		//[2] while문 이용 : 반복횟수가 정해지지 않을 때
//		while(true) {
//
//			System.out.println("구구단을 입력해주세요");
//			int dan = sc.nextInt();
//			for (int i = 1 ; i <= 9 ; i++) {
//				System.out.printf("%d * %d = %d \n" , dan, i, dan*i);
//			}
//			System.out.println("종료를 원하나요?");
//			String answer = sc.next();
//			if (answer.equals("Y")||answer.equals("y")) break;				//문자열 비교할때는 equals를 사용하여 문자열 비교를 한다. 
//			
//		}

		
		//[3]do~while문 이용 :
		
		String answer = "";
		do {

			System.out.println("구구단을 입력해주세요");
			int dan = sc.nextInt();
			for (int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d * %d = %d \n" , dan, i, dan*i);
			}
			System.out.println("계속하시겠습니까?");								//do while은 마지막 조건이 true인 경우 반복하기 때문에, 종료를 원하십니까 > 계속하시겠습니까? 라고 조건을 바꿔야 한다. 
			answer = sc.next();
										
		} while(answer.equals("Y")||answer.equals("y"));					//해당 조건이 true라면 반복을 하고 아니라면 안한다. 
		
	}

}
