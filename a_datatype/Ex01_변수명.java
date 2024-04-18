package a_datatype;

// 한 줄 주석
/*
 여러줄
 주석
 */
//
/* 여러줄 주석 , 설명문 주석
 */

/*
  	명명 규칙
  		- 문자 + 숫자 + _ + ($)
  		- 첫글자로 숫자가 오면 안됨
  		- 특수문자 오면 안됨
  		- 길이 제한없음
  		- 대소문자 구별 아주 중요함
  		- 키워드(자바가 인식하는 단어)는 안됨 / ex) char int  public  등등
  		
  	명명 권장사항
  		- 패키지명 전부 소문자로 씀
  		- 클래스명은 첫글자는 대문자 + 영단어의 첫글자 대문자여야함
  			ex) CuteDogBath
  				-> 낙타표기법 (camel case)
  		- 함수명/변수명 첫글자는 소문자 + 두번째 영단어의 첫글자는 대문자
  			ex) catBathAndFeed
  		
 */
public class Ex01_변수명 {

	public static void main(String[] args) {
		
		// 변수선언
		char chName;   //char은 문자 한개만 들어감('') / 문자열은 string을 사용해야함 ("")
		int i;
		double abcdef;
		boolean a;
		
		// 값 저장(=대입)
		chName = '김'; //문자형 ''
		i = 100;
		abcdef = 3.6; 
		a = true; // false
		
		// 출력(syso + crtl + space)
		System.out.println(chName);
		System.out.println(i);
		System.out.println(abcdef);
		System.out.println(a);
		System.out.print(chName);		//println 말고 print로 출력하면 한줄에 여러개가 같이 나온다
		System.out.print(i);			//위 chName과 i 두개를 print로 출력해서 결과값이 김100으로 출력되었다
	}

}

/*
	변수
		- 메모리상에 어떤 값을 저장하는 공간
		
	자료형 (데이터 타입)
		1. 기본형 (primitive)
			- 논리형 : boolean - 1byte (ex: 참/거짓을 말하는 것) - true or false 만 입력 가능
			- 문자형 : char - 2byte (ex: 김)
			- 정수형 : int - 4byte / long - 8byte (byte - 1byte / short - 2byte는 안쓰임) (ex: 1,2,3)
			- 실수형 : double - 8byte (float - 4byte는 안쓰임) (ex: 소수점)
			
		2. 참조형 (Reference)
			- 배열/클래스
			
			
		[참고]
			1 bit : 0 or 1
			8 bit = 1 byte
			
			1024B = 1KB
			1024KB = 1MB
			1024MB = 1GB
			1024GB = 1TB
			
			
		[참고] int : 4byte(B) = 32bit
			0  bit : 부호(0: 양수(+) / 1: 음수(-)) / 첫번째 자리가 부호비트임
			31 bit : 숫자표현 -> -2^31 ~ +2^31 -1
			
*/
