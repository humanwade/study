package c_control;

import java.util.*;
public class Ex05_switch_성적 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수를 입력해 주세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		int total = kor + eng + math;
		System.out.println("총점 = " + total);

		int avg = total / 3;
		System.out.println("평균 = " + avg);


		char score = '0';

		switch (avg / 10) {								
			case 10 : 
			case 9 : score = 'A'; break;
			case 8 : score = 'B'; break;
			case 7 : score = 'C'; break;
			default : score = 'F';
		}

		System.out.println("학점 : " + score + " 학점 입니다");

	}

}
