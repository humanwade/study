package a_datatype;

import java.util.Scanner;  //ctrl + shift + O(영문자)  자동으로 패키지임포트 import java.util.Scanner를 잡아준다

/*
 * 
 * 콘솔에 출력
 * 		System.out
 * 				print()
 * 				println()
 * 				printf()
 * 
 * 콘솔에 입력
 * 		System.in
 * 		
 * 	-> Scanner 이용 //이용이 편리하게 해준 새로운 기능이었다, 기존에는 복잡한 코딩을 활용하에 입력했지만 Scanner로 쉽게 입력 가능
 * 
 *  	- 문자열 입력시 : next() or nextLine() 함수 활용 가능  -> [과제] 두개의 차이점 미리 확인해보기
 *  	- 정수형 입력시 : nextInt() 함수 활용 가능
 *  	- 실수형 입력시 : nextDouble()함수 활용 가능
 */

//import java.lang.*;
import java.util.*;

public class Ex07_Scanner {

	public static void main(String[] args) {
		
		System.out.println("이름입력하세요 ->");
		
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		System.out.println("당신의 이름은 " + name + " 입니다");
		
		
		/* [연습문제]
		 * 1. 두 정수를 입력받아 변수 first, second 저장하기
		 * 2. 두 정수를 더해서 add 변수에 저장하기
		 * 3. add 변수값을 콘솔에 출력하세요
		 */
		
		
		System.out.println("첫번째 숫자 a =");    				//내가 출력하고자 하는 내용을 입력하기
		Scanner number1 = new Scanner(System.in);			//Scanner 클래스에 원하는 이름 지정하고 그 대상을 신규 생성한다는 뜻
		int first = number1.nextInt();						//앞이 int면 뒤에 nextInt로 scanner의 지정이름을 넣어준다.
															//(double = nextDouble, string = nextLine etc)
		
		
		System.out.println("두번째 숫자 b =");					//내가 출력하고자 하는 내용을 입력하기
		Scanner number2 = new Scanner(System.in);			//Scanner 클래스에 원하는 이름 지정하고 그 대상을 신규 생성한다는 뜻
		int second = number2.nextInt();
 
		int add = first + second;							
		
		System.out.println("a + b = " + add);
		
		number1.close();
		number2.close();
	}
	
}