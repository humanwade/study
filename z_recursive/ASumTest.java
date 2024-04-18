package z_recursive;

public class ASumTest {

	public static void main(String[] args) {

		//1부터 5까지 합을 구하기
		
		int sum = 0;
		for(int i = 0 ; i <= 5 ; i++) {
			//sum += i;
			int exsum = sum;
			sum = exsum + i;
			System.out.println(sum + "=" + exsum + "+" + i);
		}
		System.out.println("합계 : " + sum);
		

	}

}
