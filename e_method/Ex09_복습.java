package e_method;

import java.util.*;
public class Ex09_복습 {

	public static void main(String[] args) {
		
		String jumsu = func();
		//합격여부 출력
		//System.out.println("당신은 " + jumsu + " 입니다.");
		
		method(jumsu);

	}
	static void method(String jumsu) {
		//합격여부 출력
		System.out.println("당신은 " + jumsu + " 입니다.");
	}
	
	
	//아래 함수 역할 : 콘솔창에서 점수를 입력 받기
	//			해당 점수가 80점 이상이면 "합격" 그렇지 않으면 "불합격" 반환
	
	static String func() {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 점수를 입력해주세요");
		int jumsu = sc.nextInt();
		System.out.println("당신은 " + jumsu + "점 입니다");
		
		if(jumsu >= 80) return "합격" ;
		else return "불합격" ;
	}

}
