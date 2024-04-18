package c_control;

import java.util.Scanner;

/*
 * 1~50까지 숫자 중 3.6.9 게임처럼
 * 3.6.9 숫자를 포함하면, 그 갯수만큼 "짝" 글자를 출력하고
 * 그렇지 않으면 숫자를 출력하도록 프로그램을 작성하기
 */


public class 중요_369 {

	public static void main(String[] args) {

//		//3.6.9 만들기 선생님용
		for(int i = 1 ; i <= 50 ; i++ ) {
			int su = i;
			boolean su369 = false;

			while(su != 0) {

				int na = su%10;
				if(na==3 || na==6 || na==9) {
					System.out.print("짝");
					su369 = true;
				}
				
				su /= 10;
			}
			if(!su369) System.out.println(i);
			else System.out.println();
		}
//		
//		
//		
//		//3.6.9 만들기 boolean으로 
//		for(int i = 1 ; i <= 50 ; i++) {
//			boolean a = false;  								//1의자리에 3.6.9가 있는지
//			boolean b = false;									//10의 자리에 3.6.9가 있는지
//			
//			int result = i%10;									//result라는 변수를 10으로 나눴을때 나머지가 3.6.9가 있다면 1의 자리는 "짝"이 입력되야 한다. 
//			if (result == 3 || result == 6 || result == 9) {	//3.6.9가 나오니까 a = true가 된다
//				a = true;
//			}
//			result = i/10;										//변수 i를 10으로 나눴을때 몫이 3.6.9가 나온다면 10의 자리는 "짝" 이 들어간다. 
//			if (result == 3 || result == 6 || result == 9) {	//result의 몫이 3.6.9중 있다면 b = true가 된다.
//				b = true;
//			}
//			if (a&&b == true) {									//만약 a,b 둘다 true라면 1의 자리, 10의 자리 "짝짝"을 출력한다. 
//				System.out.println("짝짝");
//			}else if(a||b == true) {							//만약 a나 b 둘중에 하나가 true라면 "짝"을 입력한다. 
//				System.out.println("짝");
//			}else {												//둘다 아니라면 변수 i를 입력한다 (숫자를 입력한다)
//				System.out.println(i);
//			}
//		}

		
		//while로
		
//		int i = 1;
//		while (i <= 50) {
//			
//			int tens = i / 10;
//			int units = i % 10;
//			
//			int count = 0;
//			if(tens == 3 || tens == 6 || tens == 9) {
//				count += 1;
//			}
//			if(units == 3 || units == 6 || units == 9) {
//				count += 1;
//			}
//			
//			if (count == 2) {
//				System.out.print(" 짝짝");
//			}else if(count == 1) {
//				System.out.print(" 짝");
//			}else {
//				System.out.print(" "+ i);
//			}
//			
//			i += 1;
//		
//		}


	}

}
