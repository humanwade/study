package a_datatype;

import java.util.Scanner;

public class My06_연습3_1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력해 주세요");
		String univ = sc.next();

		String year = univ.substring(0 , 4);
		char cls = univ.charAt(4);
		String maj = univ.substring(5 , 7);
		String lef = univ.substring(8 , 10);


		System.out.print(univ + "은 " + year + "년도에 입학한 ");


		String cla = ""; //단과대
		String mj = "";  //학과

		if(cls == '1') {
			cla = "공대";
			if(maj.equals("11")) {
				mj = "컴퓨터학과";
			}if(maj.equals("12")) {
				mj = "소프트웨어학과";
			}if(maj.equals("13")) {
				mj = "모바일학과";
			}if(maj.equals("22")) {
				mj = "자바학과";
			}if(maj.equals("33")) {
				mj = "서버학과";
			}
		}else if(cls == '2') {
			cla = "사회대";
			if(maj.equals("11")) {
				mj = "사회학과";
			}else if(maj.equals("12")) {
				mj = "경영학과";
			}else if(maj.equals("13")) {
				mj = "경제학과";
			}


		}
		System.out.println(cla + mj + "학생 입니다.");
	}
}






















// 0~3 번째 자리까지 숫자를 읽어와서 그걸 연도라고 입력되게 해야함
// 4 번째 자리는 단과대 번호, 1 : 공대 / 2 : 사회대
// 5~6번째 자리는 학과번호