package e_method;

import java.util.*;
public class My01_과제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 => 100,000 이하");
		int num = sc.nextInt();


		int count = 0;
		for(int i = 1 ; i <= num ; i++ ) {
			String str = String.valueOf(i);
			boolean su369 = str.contains("3") || str.contains("6") || str.contains("9");
			if(su369) {
				System.out.print("짝! ");
				count += 1;

			}else {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		System.out.println("박수 횟수 : " + count);

	}
}

