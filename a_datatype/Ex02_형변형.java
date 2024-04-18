package a_datatype;

public class Ex02_형변형 {

	public static void main(String[] args) {
		
		//**** 기본형
		// (1)변수의 자료형과 같이 일치
		// (2)크기가 큰 자료형에 작은 값 넣을 때 (자동형변환)
		// (3)크기가 작은 자료형에 큰 값을 넣을 때  
		// 		-> 아무조치 없을 시 에러 발생
		//		-> 형변환 필요 (**** casting)
		
		int su;
		su = '문';
		System.out.println(su);

		double d;
		d = (double)1000;
		d = 1000;
		System.out.println(d);
		
		//블록지정 후 cntl + / 는 전체 주석 설정/해제
		//int su2;
		//su2 = 1.2;  
		
		float f;
		f = 1.2F;	//4B 변수에 8B 값을 넣고자 하는 상황(소수점은 8B) 
					//-> 자바의 소수점은 기본적으로 double형임 (굳이 float을 쓰고 싶으면 소수점 다음  "F"를 써야함)
		System.out.println(f);
		
		int big;
		big = 1000000000;
		System.out.println(big);
		
		long big1;
		big1 = 10000000000L;		//10억 단위 이상의 숫자를 넣고 싶은 경우는 long을 써야 하고, long을 쓴 변수값에는 숫자 뒤에 대문자L을 써야함 (L이 long을 의미하는듯?)
		System.out.println(big1);
		
		int z;
		z = (int)1.6;
		System.out.println(z);
		
	
		 
		
		
		
		
	}
	

}
