package a_datatype;

/*
 * 정수 하나 입력 받아서 3의 배수인지 여부를 출력
 * 
 * [예]
 * 		숫자입력 : 9 / 4
 * 		3의 배수 입니다/아닙니다
 * 	
 * [힌트] % (나머지) 활용
 */

import java.util.*;
public class My03_연습1 {

	public static void main(String[] args) {

		Scanner t_times = new Scanner(System.in);
		
		System.out.println("3의 배수인지 궁금한 숫자를 입력해 주세요");
		
		double number = t_times.nextDouble();
		
		if(number%3==0) {
			System.out.println("딩동댕");
		}else {
			System.out.println("땡");			
		}
		t_times.close();

	}

}
