package c_control;

public class Ex08_for중첩 {

	public static void main(String[] args) {

		for(int j = 0 ; j < 4 ; j++) {
			for (int i = 0 ; i < 5 ; i++) {
				System.out.print("*");
			

			}
			System.out.println();
		}

		System.out.println("------------------");

		for(int j = 0 ; j < 4 ; j++) {
			for (int i = 0 ; i < j+1 ; i++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println("------------------");
		
		for(int j = 0 ; j < 4 ; j++) {
			for (int i = 0 ; i < 5-j ; i++) {
				System.out.print("*");
			}
		System.out.println();
		}
		



	}
}