package d_array;

/*
 * 5명의 국어점수를 입력하세요(ex: 10/10/10/10/10) -> 55/66/75/69/72
 * 총점은 xxx이고, 평균은 ㅇㅇㅇㅇ 입니다. 
 */


import java.util.*;

public class Ex01_성적2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력 하세요");
		String score_str = sc.nextLine();

		StringTokenizer st = new StringTokenizer(score_str," ");
		int cnt = st.countTokens();	
		int [] score = new int [cnt];

		for(int i = 0 ; i < cnt ; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			//string -> int로 바꿔주는 문장 
		}

		int total = 0;
		for(int i = 0; i < cnt ; i++) {
			total += score[i];
			
		}
		int avg = total/cnt;
		
			System.out.println("총점은 " + total + " / " + "평균은 " + avg + " 입니다");
		}

	}

