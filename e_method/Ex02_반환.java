package e_method;

public class Ex02_반환 {

	public static void main(String[] args) {
		
		int sum = add ();			//16행에서 return이 되면서 int형 sum add변수로 선언함
		//출력
		System.out.println("합 : " + sum);	//int형 sum이 출력 된다. 

	}
	static int add(){				//void를 쓰는 경우 return에서 반환할 수 없음>int형을 써야함
		//데이타
		int a =10, b =20;
		int sum = a+b;
		return sum;					//return 할때는 메모리 1개를 가지고 갈 수 있어서 sum을 가져간것			
		
		//return 이후의 문장은 실행되지 않음, 16행에서 위 add의 문장이 끝나고 7행으로 돌아간다 
		//System.out.println("end");
	}
	
	//return : 제어권을 반환하는 것 

}
