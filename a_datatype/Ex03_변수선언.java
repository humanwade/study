package a_datatype;

public class Ex03_변수선언 {
 
	public static void main(String[] args) {
	
		// [1] 변수선언 + 값 대입
		int kor;	//정수형 변수 kor의 방을 만듬 (국어점수를 만들것이닷)
		kor = 30; 	//만든 방에 kor의 값이 30이라는 정수값을 저장한다
		
		// [2] 초기화 = 변수선언 하면서 동시에 값을 넣는것, 위에 1번처럼 두번에 나눠서 할 필요없음
		int eng = 30; //메모리 확보하면서 영어점수가 30점이라고 입력을 같이 시키는 것
		
		// [3] 여러개 변수인 경우
		int math = 30, java = 50; //여러개의 변수가 있는 경우 콤마(,)로 연결 하면 된다.
	
		
		System.out.println("math=" + math + "java=" + java);
		int temp = math; 	//temp를 한번 넣었으면 아래에 또다른 temp를 쓰는 경우 그 값이 지정되어 들어간다. 또 입력하고자 하면 숫자를 추가해서 temp1,2,3 이렇게 넣어야함
				math = java;
				java = temp;
				System.out.println("math=" + math + "java=" + java);
		
		
		
		 if(kor == eng) {
			 System.out.println("점수 동일");
		 }else {
			 	System.out.println("점수 다름");
		}
		 
		 // [참고] swap : 두 변수의 값을 바꾸기
		 int a = 10, b = 20;
		 System.out.println("A=" + a +"B=" + b);
		int temp1 = a; // a와 b의 변수를 바꾸는 경우 첫번째로 temp라는 임시저장소를 만들어서 a의 값을 temp 에 넣어두라는 명령을 함
		 a = b;			// 두번째는 temp에 a값을 넣었으면 b를 a로 바꾸라는 명령을 한다
		 b = temp1;		// 세번째는 b의 값을 a로 바꿨으면 b의 공백을 temp(a를 임시저장해둔 것)를 b에 바꿔 넣으라는 명령을 한다
		 				// 이렇게 세 단계를 거쳐서 a와 b의 값을 치환할 수 있음
		 System.out.println("A=" + a +"B=" + b);
	
		 
	
	
	
	
	}
	

}