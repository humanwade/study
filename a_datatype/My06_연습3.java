package a_datatype;

import java.util.*;
public class My06_연습3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력해 주세요");
		String univ = sc.next();

		String year = univ.substring(0 , 4);
		char cls = univ.charAt(4);
		String maj = univ.substring(5 , 7);
		String lef = univ.substring(8 , 10);


		System.out.print(univ + "은 " + year + "년도에 입학한 ");



		if(cls == '1') {
			System.out.print("공대 학생입니다");
			if(maj.equals("11")) {
				System.out.print("컴퓨터학과 학생입니다");
			}else if(maj.equals("12")) {
				System.out.print("소프트웨어학과 학생입니다");
			}else if(maj.equals("13")) {
				System.out.print("모바일학과 학생입니다");
			}else if(maj.equals("22")) {
				System.out.print("자바학과 학생입니다");
			}else if(maj.equals("33")) {
				System.out.print("서버학과 학생입니다");
			}
		}else if(cls == '2') {
			System.out.print("사회대 학생입니다");
			if(maj.equals("11")) {
				System.out.print("사회학과 학생입니다");
			}else if(maj.equals("12")) {
				System.out.print("경영학과 학생입니다");
			}else if(maj.equals("13")) {
				System.out.print("경제학과 학생입니다");
			}



		}
	}
}























// 0~3 번째 자리까지 숫자를 읽어와서 그걸 연도라고 입력되게 해야함
// 4 번째 자리는 단과대 번호, 1 : 공대 / 2 : 사회대
// 5~6번째 자리는 학과번호