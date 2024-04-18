package c_control;

import java.util.*;
public class Ex03_switch_주민번호 {

	public static void main(String[] args) {


		String id = "890101-35042334";

		char ch = id.charAt(8);		//id에서 8번째 자리의 한자리를 가져와서 변수ch에 저장을 한다는 뜻

		System.out.println(ch); 	// 8번째 숫자 1이 오겄쥬?

		/*
		 * 출신지 값이 
		 * 0이라면 서울출신
		 * 1이라면 인천/부산출신
		 * 2라면 경기출신
		 */
		
//		if(ch == '0') {
//		System.out.println("서울출신");
//		}else if(ch == '1') {
//			System.out.println("인천/부산출신");
//		}else if(ch == '2') {
//			System.out.println("경기출신");
//		}else {}
//		System.out.println("대한민국 출신");

		

//		switch (ch) {
//		case '0' : System.out.println("서울 출신");
//					break;
//
//		case '1' : System.out.println("인천/부산 출신");
//					break;
//
//		case '2': System.out.println("경기출신");
//					break;
//		
//		default :  System.out.println("대한민국 출신");
		
//		String chul = "";
//		switch (ch) {
//		case '0' : chul = "서울";
//					break;
//
//		case '1' : chul = "인천/부산";
//					break;
//
//		case '2': chul = "경기";
//					break;
//		
//		default : chul = "대한민국";
//		}
//		System.out.println(chul + " 출신 입니다");
		
		
		// 주민번호 7번째 문자에 의해 성별 출력, switch 문장으로 완성
		
		char gen = id.charAt(7);
		String gender = "";
		
		
		switch (gen){
			case '9': 
			case '1': 
			case '3': gender = "남자" ; break;  			//중복되는 값이 있는 경우, 조건이 유지되는 코드까지 영향을 받고 break이 나오는 경우 그 위치까지만 영향을 받는다
			case '0': 
			case '2': 
			case '4': gender = "여자" ; break;
		}
		System.out.println("당신은 " +gender + " 입니다");
		
		
		

	}

}
