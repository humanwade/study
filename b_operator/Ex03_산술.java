package b_operator;

/*
 * 산술연산자
 * 
 * 		*	/	+	-	%
 */
public class Ex03_산술 {

	public static void main(String[] args) {
		
		int a = 3;
		
		if(a%2 != 0)	{				//a를 2로 나눴을때 나머지가 1) 0이 아니면 홀수  2)0 이면 짝수
			System.out.println("홀수");	//a는 3이라서 나머지 1이 있으니 0이 아니다의 if문이 true가 된다 -> 홀수가 출력됨
		}else{
			System.out.println("짝수");	//a가 짝수라면 2로 나눴을 때 나머지가 0이므로 0이다란 뜻이 된다
		}
		
		
	}

}
