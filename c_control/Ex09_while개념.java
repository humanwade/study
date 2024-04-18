package c_control;


/* 
 * for : (주로) 반복횟수가 정해진 경우 쓴다
 * while : (주로) 반복횟수가 고정적이지 않은 경우 쓴다. 
 */

import java.util.*;
public class Ex09_while개념 {

	public static void main(String[] args) {


//		int sum = 0;
//		
//		int i = 1;
//		//for(  ; i <= 10 ; ) {				//1번째 변수를 주고(int i) / 두번째 조건에 맞으면(i<=10) / 세번째 수행을 하고(sum+=1) / 네번째 조건을 따른다(i++)
//		while(i<=10) {						//for문에서 조건문(두번째)만 남아있는 경우가 while문이라고 보면 된다 > 변수와 조건을 아래로 뺀것과 같은 거라고 보면 된다. 
//			sum+=i;
//			i++;
//		}
//		
//		System.out.println("합 : " + sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		
		//구구단의 3단을 출력
		//for 문으로 작성 후 -> while문으로 변경
		
		for(int i = 1 ; i <=9 ; i++) {
			System.out.println("for 구구단 : " + dan + "*" + i + "=" + (dan*i));
		}
		
		int i = 1;
		while(i <= 9) {
			System.out.println("while 구구단 : " + dan + "*" + i + "=" + (dan*i));
			i++;
			//System.out.printf("%d * %d = %d \n" , dan, i, dan*i);
		}
		
	
		
		
		

	}

}
