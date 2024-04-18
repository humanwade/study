package d_array;

public class Ex09_복습 {

	public static void main(String[] args) {
		
		
		//혼자 좀 더 공부해보기
		
		
		
		//char[][] star = new char [4][0];
		char[][] star;
		star = new char[5][5];
		
		//각각 char에 "*" 저장하기
		
		for(int i = 0 ; i < star.length ; i++) {
			
			star[i] = new char[i+1];
			
			for(int j = 0 ; j < star[i].length; j++) {
			star[i][j] = '*';	
			}
		}
		
		
		//출력
		for(int i = 0 ; i < star.length ; i++) {
			for(int j = 0 ; j < star[i].length ; j++) {
				System.out.print(star[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
