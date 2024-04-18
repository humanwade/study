package b_operator;

/*
 * 	문자열 처리 클래스
 * 		- String
 * 		- StringBuffer
 * 		- StringBuilder
 */

public class Ex11_문자열클래스 {

	public static void main(String[] args) {
		
		String s = new String("홍길동");
		System.out.println("String : " + s);
		
		String s2 = "홍길동2";								//String은 new없이 사용이 가능한 유일무이한 클래스이다		
		System.out.println("String : " + s2);
		
		String s3 = "홍길동3";	
		// + 산술연산 : 숫자연산
		// String특권 : + 연산가능
		s3 += " 화이팅";									//s3 = 홍길동3 + 화이팅
		System.out.println("String : " + s3);
		
		//-----------------------------
		
		StringBuffer sb = new StringBuffer("홍길순");
	//	sb += "화이팅";									//String과 다르게 플러스(+)연산이 불가능하다, 오류가 발생한다. 
	//	sb.append("화이팅")								//+연산을 하고 싶다면 옆과같이 함수를 사용해야 하는게 원칙이다. 
		System.out.println("SB : " + sb);
	//	StringBuffer sb2 = "홍길순2";						//String 제외하고는 무적권 new와 함께 써야한다, 예외는 오직 String만!
	//	System.out.println("SB : " + sb2);
		
		

	}

}
