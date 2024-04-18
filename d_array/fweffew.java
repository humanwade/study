package d_array;

import java.util.Scanner;

public class fweffew {

	public static void main(String[] args) {
		char[][] alpha = input();
		output(alpha);
	}


	static void output(char[][] alpha) {

		for(int i = 0 ; i < alpha.length ; i++) {
			for(int j = 0 ; j < alpha[i].length ; j++) {
				System.out.print(alpha[i][j] + " / ");
			}

			System.out.println();
		}
	}


	static char[][] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개와 알파벳 하나를 입력 하세요 => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);

		System.out.println("첫번째 정수 : " + a + " / " + " 두번째 정수 : " + b + " / "+ " 알파벳 : " + c);


		return makeSquare(a , b , c);




	}
	static char[][] makeSquare(int a , int b , char c) {
		char[][] ch = new char[a][b];

		for(int i = 0 ; i < a ; i++) {
			for(int j = 0 ; j < b ; j++) {
				ch[i][j] = c++;
			}
		}
		return ch;	
	}
}

