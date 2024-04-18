package e_method;

/*
 * 	Call By Reference
 * 	- 메소드의 인자가 참조형인 경우
 *  - 주소가 복사되어서 원본에 영향을 미친다
 */


public class Ex05_CallByReference {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("헬로");
		
		add(a, b);
		System.out.println("A" + a + "/" + "B" + b);

	}
	
	static void add(StringBuffer a, StringBuffer b) {		//기본형이 아닌경우(클래스 등등)가 넘어올때는 주소 자체가 넘어오게 된다. main과 add함수가 같은 주소를 공유해서 원본 데이터에 영향을 미친다. 
		a.append(b);		//a = a+b 와 같은 형태라고 보면 된다. 문자열을 합칠때 append라는걸 쓴다. 
		System.out.println("A" + a + "/" + "B" + b);
	}

}
