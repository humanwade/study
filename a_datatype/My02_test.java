package a_datatype;

import java.util.Scanner;
public class My02_test {

	
//	public static void main(String[] args) {
//		// 국, 영, 수 점수를 입력 받아서 총점(total)을 구해서 출력
//		// 평균(avg)을 구해서 출력
//		
//	
//		System.out.println("국어점수 =");
//		Scanner score1 = new Scanner(System.in);
//		int kor = score1.nextInt();
//		
//		System.out.println("영어점수 =");
//		Scanner score2 = new Scanner(System.in);
//		int eng = score2.nextInt();
//		
//		System.out.println("수학점수 =");
//		Scanner score3 = new Scanner(System.in);
//		int math = score3.nextInt();
//		
//		int total = kor + eng + math;
//		double avg = (double)total/3;			
//		
//		System.out.println("총점= " + total);
//		System.out.println("평균점수 =" + avg);
//		
//		score1.close();
//		score2.close();
//		score3.close();
		
		
		
//		Scanner score = new Scanner(System.in);
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
//		}
//}
	
	


		public static void main(String[] args) {
			
			System.out.println("문자를 입력하세요");
			Scanner letter = new Scanner(System.in);
			char l = letter.nextLine().charAt(0);      //charAt 의 숫자는 0번째 자리의 글자를 char로 읽어 온다는 뜻이다
			System.out.println(l);
			
			
			if(l>=97 && l<=122) {
				System.out.println("소문자 입니다");
			}else if(l>=65 && l<=90 ) {
				System.out.println("대문자 입니다");
			}else if((l<=64 && l>=91) &&(l<=97 && l>=123)){
				System.out.println("알파벳을 입력해 주세요");
			}
			
			
				
				
			
		}
	}