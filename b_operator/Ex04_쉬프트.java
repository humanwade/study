package b_operator;

public class Ex04_쉬프트 {

	// shift연산자
	// 각각 비트의 값을 이동하는 연산자
	
	//   0010 -> 2 였던 값이 자리 이동을 하나씩 하면
	// 0 010  -> 이동하여 4가 된다
	
	
	public static void main(String[] args) {
		
		int a =4;							//0100
		
		int b = a << 2;
		int c = a >> 1;
		
		System.out.println("a=" + a);		//4   0100
		System.out.println("a=" + b);		//16 0001 0000
		System.out.println("a=" + c);		//2  0000 0010
		
		int d = a >>> 1;
		System.out.println("d=" + d);		//?

	}

}
