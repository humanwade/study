package d_array;

public class Ex03_정렬 {

	public static void main(String[] args) {


		int [] su = {20,2,49,8,12,5};				//배열 선언
		
		//정렬(버블 정렬)
		for(int i = su.length -1 ; i > 0 ; i-- ) { //i : 5 4 3 2 1
			for(int j = 0 ; j < i ; j++) {
				if(su[j] > su[j+1]) {
					int temp = su[j];
					su[j] 	 = su[j+1];
					su[j+1]  = temp;
				}
			}
		}
		//배열값 출력
		for(int i = 0 ; i < su.length ; i++) {
			System.out.print(su[i] + " ");
		}

	}

}
