package b_operator;

import java.util.*;
public class 복습 {

	public static void main(String[] args) {
		
		/*
		 * 100점 만점의 학생 점수를 입력 받아 80~90 사이라면 '평균'
		 */
		
		//1) 학생점수 변수 선언
		//2) Scanner 선언
		//3) 콘솔에 "점수를 입력하세요" 출력
		//4) 입력값을 1번 변수에 저장
		//5) 입력값이 80보다 크고 90보다 작다면 
		//5) '평균' 이라고 출력
		
		int score;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 -> ");
		score = sc.nextInt();		
		
		
		
		
		if(score > 80 && score < 90) {
			System.out.println("평균");
		}else {
			System.out.println("평균이 아닙니다");
		}

	}

}
