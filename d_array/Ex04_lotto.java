package d_array;

/*
 * 임의의 수(랜덤 수)
 * 
 * 	Math.random() : 0.0부터 1.0보다 작은 어떤 수를 뽑아준다.
 * 
 *  Math.random() * 10 
 *  
 *  (int) (Math.random() * 10) 
 *  
 * 
 */

public class Ex04_lotto {

	public static void main(String[] args) {
		
		int [] lotto = new int [6];
		
		//로또번호 생성 -> 임의의 수 생성해서 저장
		for(int i = 0 ; i < lotto.length ; i++) {
			//0.0부터 1.0사이의 수 * 45는 0부터 44까지의 정수로 표현을 할 수 있고, +1을 하여 45까지 숫자가 나온다.
			lotto[i] = (int)(Math.random()*45)+1; 	
		}
		
		//정렬
		for(int j = lotto.length-1 ; j > 0 ; j--) {
			for(int k = 0 ; k < j ; k++) {
				if(lotto[k] > lotto[k+1]){
					int temp 	= lotto[k];
					lotto[k]	= lotto[k+1];
					lotto[k+1]	= temp;
				}
			}
		}
		
		
		
//		//출력
		for(int i = 0 ; i < lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

}
