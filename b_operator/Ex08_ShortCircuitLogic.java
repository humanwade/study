package b_operator;

public class Ex08_ShortCircuitLogic {			//두개의 조건이 있을 때 이미 결론이 앞에서 나오면 뒤에건 계산을 하지 않는 java만의 로직

	/*
	 * 	ShortCircuitLogic
	 * 		- 일반논리 연산자에 발생하는 로직
	 * 
	 */
	
	public static void main(String[] args) {
		
		int a = 3;
		
		if(a > 3 & ++a > 3) {					
		System.out.println("조건만족");		
	}
	
	System.out.println("A = " + a);
	
	if(a > 1 | ++a > 4) {					//이미 위에서 4로 되어 있는데 a>4인 조건을 넣으면 왜 계산이 안되지?
		System.out.println("조건만족2");
	}
	System.out.println("A = " + a);
		
		
		
		
		// 아래는 일반논리연산자
		
//		if(a > 3 && ++a > 3) {					//이미 결과에서는 첫번쨰 조건 a>3이 false가 나온경우 뒤의 조건은 볼것도 없어서 계산을 안한다
//			System.out.println("조건만족");			//그래서 결과는 ++a를 해서 4가 출력될 것으로 예상되지만 3이 나온다. 
//		}
//		
//		System.out.println("A = " + a);
//		
//		if(a > 1 || ++a > 3) {					//
//			System.out.println("조건만족2");
//		}
//		System.out.println("A = " + a);
	}
}



		
	


