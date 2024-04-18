package a_datatype;

/*
 	자료형 (데이터타입)
 	1. 기본형 (Primitive)
 		- 논리형 : boolean
 		- 문자형 : char (문자 1개를 뜻함)
 		- 정수형 : int / long
 		- 실수형 : double
 		
 	2. 참조형 (Reference): 클래스 / 배열
 		- new 키워드를 통해서 메모리확보(=객체생성)해야함 
  
  [ex] 이름이 홍길동
  		char a = '홍길동'; // 안됨
  		char b = "홍길동"; // 안됨
  		
  		char x = '홍';
  		char y = '길';
  		
  [cf] 문자 1개 => char
       문자열 0개 이상 => string (클래스 -> 참조형으로 표현해야함)
 */





public class Ex05_String {

	public static void main(String[] args) {
		
		char c = 'ㅁ';
		
		// 참조형변수선언
		String name;   //string 쓸때는 항상 대문자로 시작하기!
		// 메모리확보 (값지정) -> 객체생성
		name = new String("홍길동");
		
		String irum = new String("홍길동");
		
		if(name == irum) {
			System.out.println("동일이름");
			} else {			{
				System.out.println("다른이름");
			 
		//출력값이 "다른이름"이라고 나오는 이유는 stack에 지정된 이름과 힙(free memory)에 다른 객체가 생성되어 그렇다
		//"동일이름"을 출력값으로 확인하고자 하면 equals 함수를 이용하여 조건을 대조해야 한다
		
				if(name.equals(irum)) {
			System.out.println("동일이름2");
			} else {
				System.out.println("다른이름2");
			}
		
			}
		}
		
	}

}
