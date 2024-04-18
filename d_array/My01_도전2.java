package d_array;


 // 정수형 이차배열 arr에 들어있는 정수들의 총합을 출력하시오


public class My01_도전2 {

	public static void main(String[] args) {
		
		int [][] arr = {{90,90,90,90,90},		//00~04 : 90
						{80,80,80,80,80},		//10~14 : 80
						{70,70,70,70,70},		//20~24 : 70
						{60,60,60,60,60}};		//30~34 : 60
		
		//arr[0][0] ~ arr[3][4]까지의 합을 구해라..?
		//for문 두번 써야한다
		
		/* 배열의 각각의 값을 더하는 코드*/
		int sum = 0;
				
		//행
		for(int i = 0 ; i < arr.length ; i++) {					  //1부터 셈을 하니까 1~4까지
			System.out.println("arr : " + arr.length); 			  //4일테고
		//열	
			for(int j = 0 ; j < arr[i].length ; j++) {		      //1부터 셈을 하니까 1~5까지
				System.out.println("arr[i] : " + arr[i].length);  //5인건가
				sum += arr[i][j];
			}
		}
				
		System.out.println("sum = " + sum);
		}
	 
	}


