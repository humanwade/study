package c_control;

import java.util.*;
public class Ex07_for연습 {

	public static void main(String[] args) {


		/*
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 인 경우에 줄을 나눠려면?
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");			//꼭 이거 먼저 넣기 기억하자
		int a = sc.nextInt();
		
		for(int i = 1 ; i<=a ; i++) {				//for의 a위치에 조건을 넣어준다.
			System.out.print(i + " ");

			if(i%5 == 0) {
				System.out.println();
			}
		}


	}

}
