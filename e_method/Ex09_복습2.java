package e_method;

import java.util.*;

public class Ex09_복습2 {

	public static void main(String[] args) {
		
		//input에서 반환된 2차배열을 alpha라는 변수에 저장한다. 
		char[][] alpha = input();
		
		//output으로 인자 한다. 현재까지의 값은 알파벳으로 구성된 행렬 구조의 데이터가 저장되어 있을 것이다.
		//이후 출력하기 위해서 output 함수로 해당 데이터를 argument(=인자) 한다. 
		output(alpha);
	}

	/*
	 * output함수는 ?
	 * makeSquare() 함수 안에서 생성한 문자배열에 저장된 문자를 화면 출력
	 */
	
	//alpha라고 지정된 데이터를 받아오기 위해 char[][] alpha의 파라메터를 작성한다. 
	static void output(char[][] alpha) {
		
		//출력하기 위해서 반복문을 이용한다. 
		for(int i = 0 ; i < alpha.length ; i++) {
			for(int j = 0 ; j < alpha[i].length ; j++) {
				System.out.print(alpha[i][j] + " / ");
			}

			System.out.println();
		}
	}

	/*
	 * input함수는?
	 * 두정수와 알파벳 문자 하나를 입력받음
	 * 
	 * ex) 두정수와 알파벳 문자 하나를 입력하세요 => 3 4 F
	 * 
	 */
	
	//static void input() 매소드 였던걸, makeSquare에서 반환 받은 2차배열을 main 매소드로 반환하기 위해 void > char[][]로 변환한다. 
	static char[][] input() {
		//스캐너를 사용한다. 
		Scanner sc = new Scanner(System.in);
		
		//정수두개와 알파벳을 받아온다고 한다. 
		System.out.println("정수 두개와 알파벳 하나를 입력 하세요 => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		
		//위에서 입력된 정수 두개와 알파벳 하나(charAt(0))을 활용하여 각각의 값을 출력한다. 
		System.out.println("첫번째 정수 : " + a + " / " + " 두번째 정수 : " + b + " / "+ " 알파벳 : " + c);

		//makeSquare 매소드를 호출하고 이후 생성된 행렬이 반환되면 다시 main 함수로 반환한다.
		return makeSquare(a , b , c);


		/*
		 * input 함수에서 입력받은 첫번째 정수만큼의 행과 두번째 정수만큼의 열의 배열을 만들어서 
		 * 입력받은 문자로 시작하는 배열값을 저장합니다. 
		 * 
		 * ex) 3 4 F - 3행 4열 배열을 만들고, F부터 시작하는 것을 만든다
		 *  F G H I
		 *  J K L M
		 *  N O P Q
		 */

	}
	//input에서 생성된 3개의 값 a,b,c를 받아온다, 기존 static void makeSquare였던걸 반환하면서 2차배열을 반환해야 하기 때문에 void > char[][] 로 변환하도록 한다. 
	static char[][] makeSquare(int a , int b , char c) {
		//문자로 구성된 2차배열 ch를 신규로 생성한다 > 생성된 행렬을 input에서 출력된 a와 b의 값으로 각각 행/렬 로 구성이 된다. 
		char[][] ch = new char[a][b];

		//반복문을 통해서 2차행열의 값 (00 / 01 / 02 ...)의 숫자에 c값을 대입하는 반복을 진행한다. 
		for(int i = 0 ; i < a ; i++) {
			for(int j = 0 ; j < b ; j++) {
				ch[i][j] = c++;
			}
		}
		//위 반복문에서 생성된 배열 ch를 다시 input내의 makeSquare로 반환한다. 
		return ch;			
	}
}
