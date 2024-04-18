package e_method;

/*
 * 메소드 선언
 * 
 * (문제1)
 * 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true를 반환 그렇지 않으면 false를 반환하는 메소드를 작성해라
 * 함수명 : checkLower
 * 인자 : char
 * 리턴(반환) : boolean
 * 
 */

import java.util.*;
public class Ex09_연습 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("영문자 하나 입력해라");
		String str = sc.nextLine();
		char alpha = str.charAt(0);
		//스캐너로 영문자 입력하라는 문자를 입력받고
		//입력한 문자는 string형식이지만, 입력한 문자의 첫번째 글자를 charAt를 통해서 받아오는 코드이다. 
		
		
		//메소드 호출 + 결과 출력
		boolean result = checkLower(alpha);
		System.out.println(result);
		
		//34.35행의 결과를 boolean을 통해 반환 되었다. 
		//반환된 값이 소문자라서 true라면 boolean result 값은 true 가 출력되고, 
		//소문자가 아니라서 false라면 result 값은 false가 된다. 
		

	}
	static boolean checkLower(char alpha) {
		if(alpha>='a' && alpha<='z') return true;
		else return false;
	}
	//checkLower라는 매소드(함수)를 선언하고, 인자는 char로 받아온다. 
	//아래는 만약 조건이 맞으면 어떻게 하겠다는 뜻이다. 
	//main 함수의 29행 까지 실행이 되고, 29행의 checkLower 함수에 영향을 받아서 34행의 매소드로 이동한다. 
	//35/36행에서 적용된 값을 가지고, 29행으로 다시 돌아가게 된다. 


	
	}

