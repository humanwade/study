package z_recursive;


//재귀호출
public class ASumRecursive {

	public static void main(String[] args) {

		int sum = 0;
		sum = sumFunc(5);
		
		System.out.println("총합 : " + sum);

		

	}
	static int sumFunc(int i) {
		if(i == 1) return 1;
		return i + sumFunc(i-1);
		
	}
	
}
