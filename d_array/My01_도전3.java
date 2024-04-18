package d_array;


 // 5명의 학생들의 국어, 영어, 수학, 과학, 사회 점수를 이차배열 score에 저장한 경우 각 학생들의 총점과 평균을 구하시오.


public class My01_도전3 {

	public static void main(String[] args) {

			int [][] score = {{98,98,90,92,99},
							  {81,82,83,84,85},
							  {60,65,60,65,69},
							  {77,74,79,78,72}};
			
			int sum[] = new int[score.length];
		//	System.out.println(score.length);		//4의 출력 의미는 행(row)의 수, 즉 학생 4명에 대한 각각의 점수를 말한다. 4명이 5개 과목을 저장 했기 때문에, 4명의 4가 출력 되는 것
	
						
			/* 배열의 각각의 값을 더하는 코드*/
			
			for(int i = 0 ; i<score.length ; i++) {
				sum[i] = 0; 
				for(int j = 0 ; j <score[i].length ; j++){
					sum[i] += score[i][j];
					
				}
				
				
				System.out.println((i+1) + "번째 학생의 총점 " + sum[i]);
				System.out.println((i+1) + "번째 학생의 평균 " + sum[i]/5);
			}
		

	}

}
