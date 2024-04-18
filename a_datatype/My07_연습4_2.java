package a_datatype;

import java.util.*;

public class My07_연습4_2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 넣어주세요");
		int n = sc.nextInt();
		int a = 0;

		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 1 ; j < i+1 ; j++) {
				System.out.print("*");
			}
			for(int k = 0 ; k < n-i ; k++) {
				a+=1;
				System.out.print(a);
				
			}
			System.out.println(" ");
		}

	}

}
			// 공백을 먼저 넣고 > false인 경우 숫자를 넣기 
