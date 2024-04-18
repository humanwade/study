package c_control;

import java.util.*;
public class Ex02_전화번호 {

	public static void main(String[] args) {

		String tel = "02-123-4567";
		//String tel = "032-123-4567";
		int idx = tel.indexOf("-");					//하이픈 앞의 숫자를 가져온다 -> index가 몇번째 자리에 있는건지 찾는거라서 int를 쓰는것
		System.out.println(idx);					
		
		String localNum = tel.substring(0 , idx); //substring은 구간의 정보를 가져옴, (0,idx)의 뜻은 0번째부터 idx앞까지 가져온다는 것!
		System.out.println(localNum);			//substring을 통해 idx 앞까지 가져와서 '02'(이건 문자열임) 가 출력되는 것 확인 가능함
		
		
		/*
		 * 지역번호가 02라면 "서울입니다" 출력
		 * 그렇지 않고 지역번호가 032라면 "인천입니다" 출력
		 * 나머지는 "한국입니다" 출력
		 */
		
		//[1]
//		if(localNum.equals("02")) {
//			System.out.println("서울입니다");
//		}else if(localNum.equals("032")) { 
//			System.out.println("인천입니다");
//		}else {
//			System.out.println("한국입니다");
//		}
		
		
		char ch = tel.charAt(5);
		System.out.println(ch);
		/*
		 * 서울인 경우에 5번째 문자의 값이 3이라면 '마포구' 이고
		 * 그렇지 않으면 '강남구' 라고 출력
		 * 
		 */
		
			
		//[2]
		String city = "";
		String gu = "";
		
		if(localNum.equals("02")) {
			city = "서울";
			if(ch == '3') {
				gu = "마포구";
			}else {
				gu = "강남구";
			}
		}else if(localNum.equals("032")) {
			city = "인천";
		}
		
		System.out.println(city + "/" + gu + " 입니다");
		
		
		//[3]
//		Scanner num = new Scanner(System.in);
//		System.out.println("지역번호를 입력해 주세요");
//		String str = num.next();
//		int idx = str.substring(0 , 2);
//		
//		if(ing.contains("02")) {					
//			System.out.println("서울 입니다");
//		}else if(ing.contains("032")) {
//			System.out.println("인천 입니다");
//		}else {
//			System.out.println("한국 입니다");
		}
	}	
		



