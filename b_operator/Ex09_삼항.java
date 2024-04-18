package b_operator;

/*
 * 삼항연산자
 * 	 	조건 ? 참인경우실행문 : 거짓인경우실행문
 * 
 */

import java.util.*;
public class Ex09_삼항 {

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("점수를 입력하세요 -> ");
//		double score = in.nextDouble();
//		
//		
//		
//		
//		String result = (score > 80) ? "합격" : "불합격";   //점수가 몇점인지에 대한 조건을 넣기 > 물음표 이후 > 참의 실행문 : 거짓의 실행문
//		System.out.println("결과 : " + result);			//앞에 넣은 조건에 참이면 참의 실행문이 거짓이면 거짓의 실행문이 출력된다

		
		/*
		 * 두 수를 입력받아 a,b 변수를 저장한다
		 * 그 두 수 중에서 큰 수를 출력한다
		 * 
		 * int max = (a > b) ? a : b
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("비교하고 싶은 숫자를 입력하세요");
		
		int a = in.nextInt();								//입력에서도 형변형을 하려면?
		double b = in.nextDouble();								
		
		String max = (a > b) ? "첫번째가 큽니다" : "두번째가 큽니다";
		System.out.println(max);
		
		in.close();
		
		
	}

}
