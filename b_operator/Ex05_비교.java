package b_operator;

/*
 *  비교연산자
 * 		
 * 		> 	>= 	< 	<= 	== 	!=
 */
import java.util.*;
public class Ex05_비교 {

	
	public static void main(String[] args) {
		// 국, 영, 수 점수를 입력 받아서 총점(total)을 구해서 출력
		// 평균(avg)을 구해서 출력
		
	
		System.out.println("국어점수 =");
		Scanner score1 = new Scanner(System.in);
		int kor = score1.nextInt();
		
		System.out.println("영어점수 =");
		Scanner score2 = new Scanner(System.in);
		int eng = score2.nextInt();
		
		System.out.println("수학점수 =");
		Scanner score3 = new Scanner(System.in);
		int math = score3.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)total/3;				//평균값을 소수점으로 갖고 싶으면 한쪽이라도 double로 넣어줘야 한다. 
		
		System.out.println("총점= " + total);
		System.out.println("평균점수 =" + avg);
		
		
		
//      Scanner score = new Scanner(System.in);
//		
//		System.out.println("국어 영어 수학 점수를 순서대로 입력하세요 : ");
//		
//		int kor = score.nextInt();
//		int eng = score.nextInt();
//		int math = score.nextInt();
//		
//		int total = kor + eng + math;
//		//int avg = total / 3;
//		
//		System.out.println("총점= " + total);
//		System.out.println("평균점수= " + ((kor+eng+math)/3) );
//		
//		score.close();
		
		
		
		
		if(avg >= 90) {
			System.out.println("A학점");			//만약 if문을 낮은 점수 부터 조건을 걸게 된다면
		}else if(avg>=80) {						//ex) 70점 이상이면 C학점 > 80점 이상이면 B학점 > 90점 이상이면 A학점
			System.out.println("B학점");			//    이라고 조건을 걸게 되면, 처음의 70점 이상일 때 C학점에 모든 점수가 걸려서
		}else if(avg>=70) {						//    모든 성적에 70점 이상 C학점에 걸리게 된다. 
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		
		
		
		

	}

}
