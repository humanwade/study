package e_method;

/*
 * [함수-메소드 구조]
 * 
 * 리턴형 메소드명 (파라메타 변수) {
 * 
 *  }
 *  
 *  리턴형 : 반환하는 값의 자료형
 *  	void : 없다
 *  
 *  파라메타 변수 : 인자(argument)를 받는 변수
 *  		없으면 안써도 됨
 *  
 */

public class Ex01_인자 {
	
	//함수에 꼭 static을 붙이고 + void + 함수명을 넣어야한다. 

	public static void main(String[] args) {
		//데이타
		int a = 10, b = 20;
		
		add(a, b);		//생성한 함수에 값을 가져가겠다는 뜻이다 = argument(인자) 라고 한다. 
				

		

	}
	//생성한 add함수 내에서만 변수가 작동을 하기 때문에, main 함수에 있는 a.b를 받아오지 못한다.
	//그래서 main 함수 내의 a.b를 가져오기 위해서 인자를 만들고, 그걸 add 함수에 가져오는걸 파라메터 라고 한다. 
	
	static void add(int a, int b) {	 		//위에 add의 a.b에서 받아오는걸 파라메터 라고 한다. 
		int sum = a+b;
		System.out.println("합 : " + sum);
		
	}


}
