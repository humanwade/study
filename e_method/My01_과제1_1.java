package e_method;

import java.util.Scanner;

public class My01_과제1_1 {

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
		

		solution(count);

		System.out.println("박수횟수 : " + count);
	}

	static int solution(int count) {
		return count;
	}
}


