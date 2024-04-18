package d_array;

import java.util.*;
public class Ex02_최대값찾기 {

	public static void main(String[] args) {
		
		int [] su = {100,4,20,88,57,99,5};
		int max = su[0];
		
//		Scanner sc = new Scanner(System.in);   			//입력받아 최대값 구하기 만들어보기
//		System.out.println("숫자를 입력해주세요");
//		int big = sc.nextInt();
//		
//		int [] num = new int [big];
//		int max = num[0];
		
		for(int i = 1 ; i < su.length ; i++) {
			if(max < su[i]) {
				max = su[i];
			}
		}
		System.out.println("최대값 : " + max);
		

	}

}
