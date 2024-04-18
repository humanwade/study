package b_operator;

/*
 * 논리연산자
 * 
 *  	- 일반논리 : &&(and)		||(or)		
 *  
 *  	- 이진논리 : &				 |
 *  
 *  A	B			A&&B	A||B   			//&&는 스위치 2개 있는걸 다 켰을때 불 들어오는 것 상상 (둘 다 결과가 나와야만 OK)
 *  0(F)0(F)		0		0				//||는 스위치 2개 중 하나만이라도 켰을 때 불 들어오는 것 상상 (둘 중 하나만 결과가 나와도 OK)
 *  0(F)1(T)		0		1				
 *  1(T)0(F)		0		1	
 *  1(T)1(T)		1		1
 *  
 *  
 */




public class Ex06_논리 {

	public static void main(String[] args) {
		int 성적 = 75;
		char 태도 = 'A';
		if (성적>=80 || 태도=='A') {										//||는 둘중 하나라도 만족하면 ok
			System.out.println("우등생");
		}
		if (성적>=80 && 태도=='A') {
			System.out.println("성적이 80점 이상이고 태도가 A라면 성적향상반");		//&&는 둘다 만족해야 ok
		}else {
				System.out.println("성적향상반이 아님");
		
			}
		}

	}


