package c_control;

public class Ex06_for개념 {

	public static void main(String[] args) {
		
//		for(char ch = 'A' ; ch <= 'Z' ; ch+=1 ) {		//첫번째는 기준 ; 두번째는 조건 ; 세번째는 어떻게 할건지 조건 적어주기 -> 두번째 조건에 따라서 세번째를 반복한다
//			System.out.print(ch);						//println은 여러줄에,  print는 한줄에 다 나온다
//		}
//		System.out.println();
//		for (char ch='Z' ; ch>= 'A'; ch--) {
//			System.out.print(ch);
//		}
//		System.out.println(); 							//값이 겹쳐 나오는거 방지하는 빈 목록이라고 보면 됨
//
//		// A ~ S 
//		for(char al = 'A' ; al <= 'S' ; al+=2) {
//			System.out.print(al);
//		}
		
		//1부터 10까지의 합 구하기
//		int hap = 0;									//변수를 저장하고 싶으면 for문 이전에 작성을 해둬야 한다, 중괄호 안에 있으면 같은 메모리 저장이라 오류가 난다
//		for(int i = 1; i <= 10 ; i++) {
//			System.out.print(i);
//			hap += i;
//		}
//		System.out.println("합: " + hap);
		
		
		//1부터 100까지의 홀수의 합과 짝수의 합을 구하기
		
		int even = 0;
		int odd = 0;
		for (int i = 1 ; i <= 100 ; i++){
			if (i%2==0) {
				even += i; //2
			}else {
				odd += i; //1+3 4
			}
		}
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
		
		
//		for(int i = 10 ; i >= 1 ; i--) {
//			System.out.print(i);
//		}
		
//		for(int i = 1 ; i <= 30 ; i += 3) {
//			System.out.print(i);
//		}
		
		
	}

}
