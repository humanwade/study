package b_operator;

public class Ex07_이진논리 {

	public static void main(String[] args) {
		
		int a = 15;		//00000000 00000000 00000000 00001111
		int b = 10;		//00000000 00000000 00000000 00001010
		
		int and = a & b;		//& 1개는 이진논리에서 쓰는것
				//a 	00001111
				//b 	00001010
				//--------------
				//& 	00001010
		int or = a | b;
				//a 	00001111
				//b		00001010
				//--------------
				//|		00001111
		
				
		System.out.println("and = " + and);		//&는 둘다 만족해야 해서 00001010 = 10이 나온다
		System.out.println("or = " + or);		//|는 둘 중 하나만 만족하면 된다 00001111 = 15가 나온다
		
		int xor = a ^ b;
				//a 	00001111
				//b		00001010
				//--------------
				//^		00000101
		System.out.println("xor = " + xor); 	//xor(exclusive or)는 둘다 신호가 다른 경우만 나온다
		

	}

}
