package d_array;

public class Ex00_배열초기화 {

	public static void main(String[] args) {
	
		//배열변수 선언
		//int [] kor;
		//int kor [];

		
		//배열객체 생성	
		//kor = new int [5];					//대괄호 안의 숫자에 대해서는 0부터 시작하는것 꼭 기억하기.
		//int [] kor = new int [5];
		
		//배열초기화
		int [] kor = {99,88,77,66,55};
		
		//값지정
//		kor[0] = 99;
//		kor[1] = 88;
//		kor[2] = 77;
//		kor[3] = 66;
//		kor[4] = 55;
		
		int total = 0;
		for (int i = 0 ; i < 5 ; i++ ) {	//i의 범위는 같은게 들어가면 오류가 난다, 객체생성된 갯수보다 작아야 한다. 
			total += kor[i];
		}
		
		System.out.println("총점 : " + total);

	}

}
