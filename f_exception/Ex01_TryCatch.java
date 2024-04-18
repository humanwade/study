package f_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {


		String[] str = {"행복하자","맛점","맑은정신"};
		
//		for(int i = 0 ; i<=str.length ; i++) {		//<=이면 str의 문자열과 i의 수가 맞지 않아 오류 발생
//			System.out.println(str[i]);
		
		try {
			for(int i = 0 ; i<=str.length ; i++) {	//오류가 발생하는 에러를 try catch를 통해서
				System.out.println(str[i]);			//예외를 발생시켜 프로그램이 중단되지 않게 한다. 
			}
		
			//try의 {} 안에 들어가는 내용은 예외가 발생할 여지가 있는 구문을 넣는다
			System.out.println("예외가 발생할 여지가 있는 구문");
		}catch(Exception ex) {
			
			//catch의 {} 안에 들어가는건 예외가 발생하는 구문을 넣는다 
			System.out.println("예외발생 : " + ex.getMessage());
		}

		System.out.println("정상적인 종료");
	}

}
