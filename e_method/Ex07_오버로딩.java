package e_method;

public class Ex07_오버로딩 {
	public static void main(String[] args) {
		System.out.println(1000); 		 //int
		System.out.println(3.999);	     //double
		System.out.println('왕'); 	     //char
		System.out.println("안녕하세요");	 //String
	}

}

/*
 * 오버로딩 (overloading)
 *  	- 여러개의 함수가 동일 함수명을 사용
 *  	- 인자의 자료형이 다르거나 갯수가 달라야 한다
 *    
 *  [주의] 리턴형만 다른 것은 아님 - 이건 오버로딩이 아니다
 *  	void   test(int a) {}
 *  	double test(int z) {}
 *  	char   test(int h) {} 
 */
