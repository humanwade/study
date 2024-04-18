package d_array;

import java.util.*;

public class Ex01_성적 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력해 주세요 -> ");
		int su = sc.nextInt(); //su 학생수
		
		int [] score = new int [su];
		
		for( int i = 0 ; i < su ; i++) {
			System.out.println((i+1) + "번 학생의 국어점수를 입력하세요");
			score[i] = sc.nextInt();
			
		}
		//총점 구하기
		int total = 0;
		for(int i = 0; i < su ; i++) {
			total += score[i];
		}
		//평균 구하기
		int avg = total / su;
		
		System.out.println("위 학생들의 총점은 " + total + " 입니다");
		System.out.println("위 학생들의 평균은 " + avg + " 입니다");

	}

}
