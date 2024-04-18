package c_control;

/*
 * 자료형
 * 	- 기본형 : boolean / char / int / double , etc
 *  - 참조형 : 클래스 / 배열
 *  		(*) String이 클래스 중에서 제일 중요쓰
 */

public class Ex01_if_주민번호 {				//학번, 전화번호, 주민번호 등 개인 정보 관련 숫자는 문자로 처리한다! -> 혹시 계산이 되는걸 방지함

	public static void main(String[] args) {
		
		  String id = "898989-5155115"; //String은 문자열의 new를 쓰지 않아도 된다. 일단은 편리함
		//String id = new String("898989-9155115"); //이게 정석이지만 위에처럼 쓰는게 편리함
		  
		  char sung = id.charAt(7);
		  											
		  if((sung == '1')||(sung == '3')||(sung == '9')) {		//비교대상을 그냥 1로 넣으면 문자 1과 숫자 1의 비교라 여성이라고 나온다
			  System.out.println("당신은 남성 입니다");				//문자와 문자를 비교하기 위해서는 '' 를 활용하여 숫자가 아닌 문자를 구성해야 한다. 
		  }else if((sung == '0')||(sung == '2')||(sung == '4')){
			  System.out.println("당신은 여성 입니다");
		  }
				
	}

}
