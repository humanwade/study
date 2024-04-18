package e_method;

// String class만의 특권으로
// 원본 변수에 영향을 미치지 않는다
// 내용이 변경되면 새로운 메모리를 잡는다

public class Ex05_CallByString {

	public static void main(String[] args) {

		String a = new String("안녕");
		String b = new String("헬로");

		add(a, b);
		System.out.println("A" + a + "/" + "B" + b);

	}

	static void add(String a, String b) {
		a += b;		
		System.out.println("A" + a + "/" + "B" + b);
	}

}




