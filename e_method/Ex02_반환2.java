package e_method;

/* [이해하는 순서]
 * 1. main 함수를 시작한다. 
 * 2. 14행에서 int[]
 */


public class Ex02_반환2 {

	public static void main(String[] args) {


		int[] a_b = add();
		//아래 add함수의 값을 합산 후 출력하기
		int sum = a_b[0] + a_b[1];
		System.out.println("합 : " + sum);
		
	}
	static int[] add() {		//void는 가료 가져오는게 안되서, 가져오고자 하는 형태로 적어주면 된다.
		int a = 10, b =20;
		int[] a_b = {a, b};
		return a_b;				//리턴값을 1개만 가져갈 수 있어서 a,b를 하나의 배열로 만들어서 가져간다.
		
		
	}

}
