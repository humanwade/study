package d_array;

public class Ex07_로또 {

	public static void main(String[] args) {

		int [][] lotto = new int [5][6];

		//로또 번호 생성 (랜덤)

		for(int i = 0 ; i < lotto.length ; i++) {
			//System.out.print(i+1); 							//5개가 나왔겠지
			for(int j = 0 ; j < lotto[i].length ; j++) {
				//System.out.println(j+1);						//6개 나옴
				lotto[i][j] = (int)(Math.random()*45+1);
				//System.out.print(" " + lotto[i][j]);			//6개의 랜덤 숫자가 5번 출력됨			
			}
		}
		//정렬
		for(int j = 0 ; j < lotto.length ; j++) {				//배열의 행 만큼 반복
			for(int k = lotto[j].length-1 ; k > 0 ; k--) {
				for(int l = 0 ; l < k ; l++) {
					if(lotto[j][l] > lotto[j][l+1]) {
						int temp = lotto[j][l];
						lotto[j][l] = lotto[j][l+1];
						lotto[j][l+1] = temp;
					}
				}
			}

		}
		//출력
		for(int i = 0 ; i < lotto.length ; i++) {
			System.out.print("로또번호 " + (i+1) + " : ");
			for(int j = 0 ; j < lotto[i].length ; j++) {
				System.out.print(lotto[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
