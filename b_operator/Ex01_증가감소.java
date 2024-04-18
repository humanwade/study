package b_operator;

public class Ex01_증가감소 {

	public static void main(String[] args) {
		
		int a = 5, b = 7;
		
		//[0]
		System.out.println("A=" + a + ",B=" + b);  				// A=5, B=7
		System.out.println("A=" + a + 1 + ",B=" + b + 1); 		// A=51, B=71  이건 a5에 1을 더해서 5 1 이란 수를 만들어낸다
		System.out.println("A=" + (a + 1) + ",B=" + (b + 1));	// A=6, B=8    계산이 하고 싶으면 a+1을 먼저 계산하도록 한다. 
		a = a + 1;
		b = b - 1;
		System.out.println("A=" + a + ",B=" + b);				// A=6, B=6
		
		
		//중요포인트!!******
		//증가연산자 ++
		//감소연산자 --
		
		//[1]
		++a;
		--b;
		System.out.println("A=" + a + ",B=" + b);				//A=7, B=5 
		
		a++;
		b--;
		System.out.println("A=" + a + ",B=" + b);				//A=8. B=4
		
		//[2] 증가/감소연산자가 앞에/뒤에 붙는 경우 결과가 다르다
		//case1
		int c = 10;
		int result = ++c;
		// c = c + 1
		// int result = c;    ++이 앞에 있는 경우 C에 +1을 먼저 하고 결과를 추출한다
		
		System.out.println("결과: " + result);					//예상값 : 11
		System.out.println("c=" + c);
		
		//case2
		int d = 10;
		int result2 = c++;
		// int result2 = d;
		// d = d + 1		  ++이 뒤에 있는 경우는 result 값을 내고 거기에 +1을 한다
		System.out.println("결과: " + result2);					//예상값 : 11
		System.out.println("d=" + d);
		
		//[3]
		int x = 5, y = 9;
		System.out.println("X=" + ++x + ",Y=" + --y); 			//예상값 x:6   y:8
		System.out.println("X=" + x++ + ",Y=" + y--);			//예상값 x:6   y:8
		System.out.println("X=" + x + ",Y=" + y);				//예상값 x:7   y:7
		
		
		
	}

}
