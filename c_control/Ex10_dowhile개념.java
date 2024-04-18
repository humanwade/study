package c_control;

public class Ex10_dowhile개념 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println(sum);

	}
}
