package c_control;

import java.util.*;
public class Ex04_switch_전화번호 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호를 입력해 주세요");
		String tel = sc.nextLine();
		int idx = tel.indexOf('-');
		System.out.println(idx);

		String localNum = tel.substring(0 , idx);
		System.out.println(localNum);

		/* switch 사용
		 * 02 라면 "서울 입니다"
		 * 032라면 "인천 입니다"
		 * 나머지는 "한국 입니다" 출력
		 */

		String local = "";
		switch (localNum) {
		case "02" : local = "서울"; break;
		case "032" : local = "인천"; break;
		default : local = "한국"; break;

			
		}
		System.out.println(local + " 입니다");	

	}

}
