package a_datatype;

import java.util.*;
public class My07_연습4_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 넣어주세요");
		int n = sc.nextInt();

		for(int i = 1 ; i <= n ; i++) {
			int a = 1;
			for(int j = 1 ; j <= n-i ; j++) {
				System.out.print("*");
			}
			for(int k = 1 ; k < i+1 ; k++) {
				System.out.print(a);
				a+=1;
			}
			System.out.println(" ");
		}

	}

}
