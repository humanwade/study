package a_datatype;

/*
 * 문자 하나를 입력 받아서 그 문자가 대문자인지 소문자인지 출력
 * 
 * [예시]
 *  	문자 입력하세요 -> a / A
 *  	: 소문자 입니다 / 대문자 입니다
 * 
 * [힌트]
 *  비교 연산자와 일반논리 연산자 활용
 * 
 */


import java.util.*;
public class My04_연습2 {

	public static void main(String[] args) {

		System.out.println("문자를 입력하세요");
		Scanner letter = new Scanner(System.in);	//형변환이 가능한것은 기본형꺼리만 가능하다, 따라서 string(참조)>char(기본) 형변환X
		String str = letter.next();      
		char c = str.charAt(0);						//charAt 의 숫자는 0번째 자리의 글자를 char로 읽어 온다는 뜻이다


		if(c >= 'A' && c <='Z' ) {
			System.out.println("대문자 입니다");
		}else if(c >= 'a' && c <= 'z' ) {
			System.out.println("소문자 입니다");
		}else if((c <= 'A' || c >= 'Z') && (c <= 'a' || c >= 'z')){		//A ; 65 , z ; 122
			System.out.println("알파벳을 입력해주세요");						// 왜 출력이 안되지..?
		}
		



	}
}




