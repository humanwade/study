package e_method;

import java.util.*;
public class Ex09_연습2 {

	public static void main(String[] args) {

		int[] total = input();
		int avg = getCalc(total);
		output(avg);
		
	}

	//국 영 수 점수를 입력 받기
	static int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국 영 수 점수를 입력하세요 => ex)50/60/70");
		String score = sc.nextLine();
		StringTokenizer st = new StringTokenizer(score, " / ");
		int kor = Integer.parseInt(st.nextToken());			//string > int로 바꿀때는
		int eng = Integer.parseInt(st.nextToken());			//Integer.parseInt를 쓴다.
		int math = Integer.parseInt(st.nextToken());	

		int[] total = {kor, eng, math};
		return total;
		
	}

	//입력받은 국영수 점수로 총점과 평균을 구해라
	//이후 출력도 해라
	static int getCalc(int[] total) {

		int sum = 0;
		for(int i = 0 ; i < total.length ; i++) {
			sum += total[i];

		}		
		int avg = sum/3;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		return avg;

	}

	//평균값을 받아서 학점 구하기
	static void output(int avg) {
		int result = avg;

		if(result > 90) {
			System.out.println("A학점 입니다");
		}else if(result > 80) {
			System.out.println("B학점 입니다");
		}else if(result > 70) {
			System.out.println("C학점 입니다.");
		}else {
			System.out.println("F학점 입니다");
		}
	
	}
	
}
