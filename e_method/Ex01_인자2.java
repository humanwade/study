package e_method;

public class Ex01_인자2 {

	public static void main(String[] args) {

		int a = 10, b = 20;
		method(a,b);
		System.out.println("가 A" + a + "가 B" + b);		//a 10 b 20
				

	}
	static void method (int a, int b) {
		a+=b;
		System.out.println("나 A" + a + "나 B" + b);		//a 30  b 20
		
	}

}
