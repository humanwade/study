package c_control;

import java.util.*;
public class Ex07_for연습2 {

	public static void main(String[] args) {

		/*
		 * 문자열 처리하기
		 * 
		 * 문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고
		 * N이 대문자이면 문자 N부터 Z까지 출력하라
		 * 그 밖의 문자가 입력되면 Error를 출력하라
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요 -> ");
		String str = sc.nextLine();
		char ch = str.charAt(0);

		if(ch <= 'z' && ch>= 'a') {			
			for(char alpha = ch ; alpha <= 'z' ; alpha++) {
				System.out.print(alpha + " ");
			}

		} else if(ch <= 'Z' && ch >= 'A') {
			for(char alpha = ch ; alpha <= 'Z' ; alpha++) {
				System.out.print(alpha + " ");
			}
		} else {
			System.out.println("Error");
		}

	}
}



//		Scanner small = new Scanner(System.in);
//		System.out.println("소문자를 입력해주세요 -> ");
//		
//		String str = small.nextLine();			//str = "f"
//		char ch = str.charAt(0);				//ch = 'f'
//		
//		for( char alpha = 'a' ; alpha <= ch ; alpha ++) {			//시작을 내가 지정해둔 값을 기준으로 할건지
//			System.out.print(alpha);
//		}
//		System.out.println();
//		
//		//입력한 문자부터 z까지 출력
//		
//		for(char alpha = ch ; alpha <= 'z'; alpha++) {				//시작을 내가 넣을 값을 기준으로 할건지를 정해야 한다. 
//			System.out.print(alpha);
//		}


