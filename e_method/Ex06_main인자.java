package e_method;

public class Ex06_main인자 {
	
	// 함수명(method) : main
	// 리턴형			: void
	// 				 반환되는 리턴값이 없음
	// 매개변수 		: 문자열 배열 (String[])

	public static void main(String[] args) {
		
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println(args[i]);
		}
			



		

	}
	
	
	/*
	 *	> javac Ex06_main인자.java
	 *	> java Ex06_main인자 + 뒤에 문자열을 넣을 수 있음
 	 */

}
