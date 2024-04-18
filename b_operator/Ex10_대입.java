package b_operator;

public class Ex10_대입 {

	public static void main(String[] args) {


		int a = 10;
		int b = 7;
		
	  //a = a + b;
		a += b;
		System.out.println("결과1: " + a);

		
		a -= b;			// 3 -> 10 
		System.out.println("결과2: " + a);
		a *= b;			// 70 -> 70
		System.out.println("결과3: " + a);
		a %= b;			// 3 -> 0
		System.out.println("결과4: " + a);
		a /= b;			// 1.42 -> 0
		System.out.println("결과5: " + a);
	}

}
