package y_useful;

import java.util.*;

public class 연습_나이구하기 {

	public static void main(String[] args) {
		
		String id = "041212-1234567";
		
		String nai_str = id.substring(0 , 2);
		System.out.println(nai_str);			//"90"
		
		//문자열을 숫자로 바꾸려면,,? String > int 형으로 변환
		//"90" > 90 으로 바꿔야 계산을 할 수가 있을듯?
		//int nai = (int)nai_str;  이건 int > String으로 바꿀 수가 없음 
		int nai = Integer.parseInt(nai_str); //Integer.parseInt가 string > int로 바꾸는 함수
		System.out.println(nai);
		
		int age = 0;
		//int age1 = 0;
		//int a = 1900;
		//int b = 2000;
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		char sung = id.charAt(7);
		System.out.println("7번째 수는 " + sung);
		
		
		if(sung == '1'|| sung == '2') {
			age = year - (1900 + nai) + 1;
		}else if (sung == '3' || sung == '4') {
			age = year - (2000 + nai) + 1;
		}
		
		System.out.println("1번 : " + age);
		
		
		age = year - (1900 + nai) + 1;
				
		if(age < 100) {
			System.out.println(age);
		}else if(age>=100) {
			System.out.println(age  - 100);
		}
		System.out.println("2번 : " + age);
		
				

	}

}
