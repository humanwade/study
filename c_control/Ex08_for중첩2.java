package c_control;

public class Ex08_for중첩2 {

	public static void main(String[] args) {


//		for(int j = 0 ; j < 26 ; j++) {
//			for(char alpha = 'A' ; alpha <= 'Z' ; alpha++) {
//				System.out.print(alpha + " ");
//			}
//			System.out.println();
//
//		}
//
//		System.out.println("---------------------------------");

		System.out.println("문제 1번");
		for(int j = 0 ; j < 26 ; j++) {
			for(char alpha = 'A' ; alpha <= 'A'+j ; alpha++) {
				System.out.print(alpha + " ");
			}
			System.out.println();
		}	

		System.out.println("---------------------------------");

		System.out.println("문제 2번 j 조절");
		for(int j = 25 ; j >= 0 ; j--) {
			for(char alpha = 'A' ; alpha <= 'A'+j ; alpha++) {
				System.out.print(alpha + " ");
			}
			System.out.println();

		}
	
		System.out.println("---------------------------------");
		
		System.out.println("문제 2번 alpha 조절");
		for(int j = 0 ; j < 26 ; j++) {
			for(char alpha = 'A' ; alpha <= 'Z'-j ; alpha++) {
				System.out.print(alpha + " ");
			}
			System.out.println();	

		}

		System.out.println("---------------------------------");
	
		System.out.println("문제 3번");
		for(int i = 0 ; i < 26 ; i++) {
			System.out.print((i+1) + " ");
			for(char alpha = 'Z' ; alpha >= 'Z'-i ; alpha--) {
				System.out.print(alpha + " ");
			}
			System.out.println();

		}

		System.out.println("---------------------------------");

		System.out.println("문제 4번");
		for(int j = 0 ; j < 26 ; j++) {
			System.out.print((j+1) + " ");
			for(char alpha = (char)('A'+j) ; alpha <= 'Z' ; alpha++) {
				System.out.print(alpha + " ");
			}
			System.out.println();	

		}

		System.out.println("---------------------------------");
	}
}








