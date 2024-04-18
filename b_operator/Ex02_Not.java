package b_operator;

public class Ex02_Not {

	public static void main(String[] args) {
		
		/*
		 * 결과를 반대로 하는 연산자
		 * 		- 일반논리 : !
		 * 		- 이진논리 : ~
		 */
		
		
		// 일반논리 NOT -> !를 사용한다
		boolean result = 3<4;
		System.out.println(result);
		System.out.println(!result);
		
		// 이진논리 NOT -> ~를 사용한다
		int a = 15;
		System.out.println(a);			//00000000 00000000 00000000 00001111 (int = 4byte / 32bit)
		System.out.println(~a);			//11111111 11111111 11111111 11110000
		
	}

}
