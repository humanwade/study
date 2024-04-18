package e_method;

/*
 *  Call By Value
 *  
 *  인자의 자료형/기본형인 경우
 *  기존 데이터에 영향을 미치지 않음
 *  
 *  main 함수의 a b 값이 그대로 유지된다. 
 *  
 */

public class Ex05_CallByValue {

	public static void main(String[] args) {
		int a =10, b =20;
		add(a,b);
		
		System.out.println("가A" + a + "/" + "가B" + b);
		
		}
	static void add(int a, int b){
		a+=b;
		System.out.println("나A" + a + "/" + "나B" + b);
	}

}
