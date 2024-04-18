package e_method;


/* 
 * 1. main 함수를 찾아서 A 출력
 * 2. test 매소드로 이동
 * 3. 21행 c 출력
 * 4. sample 매소드 이동 
 * 5. 27행 E 출력
 * 6. 22행으로 복귀 
 * 7. imsi로 이동
 * 8. 32행 F출력
 * 9. 27행 D출력
 * 10. 21행 복귀
 * 11. B 출력
 * 
 * 결과 : A > C > E > F > D > B
 */
public class Ex00_흐름2 {


	public static void main(String[] args) {
		System.out.println("A");
		test();
		System.out.println("B");
	}
	static void test() {
		System.out.println("C");
		sample();
		imsi();
		System.out.println("D");			
	}	
	static void sample() {
		System.out.println("E");	
	}
	static void imsi() {
		System.out.println("F");	
	}
}

