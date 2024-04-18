package a_datatype;

/*
 *  년도를 입력 받아서 해당 년도가 윤년인지 평년인지 출력해 주세요
 *  
 *  
 * 
 */


import java.util.*;
public class My05_연습option {
	public static void main(String[] args) {
		
		Scanner y = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = y.nextInt();
		
		if(((year%4)==0 && (year%100)!=0)||(year%400)==0) {
			System.out.println("윤년 입니다");
		}else {
			System.out.println("평년 입니다");
		}
		y.close();
		
		
		
		
		// 4로 나눈 나머지가 0이면 윤년이다 = year%4==0
		// 위 조건 중 100으로 나눈 나머지가 0이면 윤년이 아니다 = year%100!=0
		// 위 조건 중 400으로 나눈 나머지가 0이면 윤년이다 = year%400==0
	}
}
