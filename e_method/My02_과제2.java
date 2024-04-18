package e_method;

import java.util.*;
public class My02_과제2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요");
		int mod1 = sc.nextInt();
		int mod2 = sc.nextInt();
		int max_range = sc.nextInt();


		int count = solution(mod1, mod2, max_range);

		System.out.println("조건에 해당하는 숫자의 갯수는 : " + count);

	}

	static int solution(int mod1, int mod2, int max_range) {

		int count = 0;
		for(int i = 0 ; i <= max_range ; i++) {
			if((i%mod1) == 0 && (i%mod2) != 0) {
				count += 1;
			}
		}
		return count;

	}

}
