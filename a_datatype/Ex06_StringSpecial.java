package a_datatype;

public class Ex06_StringSpecial {

	public static void main(String[] args) {
		//**********\
		// String 클래스는 참조형이다.
		// 전무후무 유일하게 String 클래스만 new 안써도 되게 만들어줌
		
		String hong = new String("홍길동"); //원래는 new를 String과 같이 써야 하지만 안써도 String만 new를 안써도 된다.
		String dong = new String("홍길동");
		
		System.out.println(hong); 
		System.out.println(dong);  //여기서 출력된 hong/dong은 다른 메모리에 저장된 "홍길동" 이다
		
		if (hong == dong) {
			System.out.println("주소가 같다"); 
		} else {
			System.out.println("주소가 다르다"); //다른 메모리에 저장(=객체생성)되었기 때문에 주소가 다른 것
		}
		
		
		if (hong.equals(dong)) {
			System.out.println("내용이 같다");  //equals를 통하여 내용을 비교해보면 메모리에는 다른 값이 들어가 있지만 같은 내용 "홍길동"이 있음
		} else {
			System.out.println("내용이 다르다");
		}
		
		
		String hong1 = "홍길동";  //new 없이 String 사용
		String dong1 = "홍길동";  //new 없이 String 사용
		
		System.out.println(hong1);
		System.out.println(dong1);
		
		if (hong1 == dong1) {
			System.out.println("주소가 같다");	//new없이 객체생성된 hong1/dong1은 하나의 free memory를 사용한다
		} else {							//따라서 같은 주소인지 확인해보면 출력값은 hong1에서 생성된 메모리를 dong1도 사용하는 것을 알 수 있다
			System.out.println("주소가 다르다"); //결과값을 그래서 "주소가 같다" 라고 출력되는 것이다. 
		}
		
		
		if (hong1.equals(dong1)) {
			System.out.println("내용이 같다");	//hong/dong과 마찬가지로 hong1/dong1도 "홍길동"의 값은 동일한 것을 equals 함수로 확인 가능
		} else {
			System.out.println("내용이 다르다");
		}
		
		

		
		
	}

}
