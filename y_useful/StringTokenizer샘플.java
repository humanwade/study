package y_useful;

import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizer샘플 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 (ex)90/80/70/60 -> ");			//안녕 하이 홍길동을 입력시 next vs nextLine 비교
		String str = sc.nextLine();					//next는 스페이스바 이전까지만 인식이 되어서 안녕만 나오지만, nextLine은 엔터까지 인식되서 안녕 하이 홍길동이 출력 된다. 
		System.out.println(str);
		
		StringTokenizer st = new StringTokenizer(str, "/");	//StringTokenizer 는 문단을 잘라주는 역할을 한다
		while (st.hasMoreTokens()) {					//얼마큼 문장을 사용자가 쓸지 모르기 때문에 while문을 사용해서 문장을 분석한다 > hasMoreTokens를 활용해서 문장이 남았는지 여부를 계속 확인한다.
			System.out.println(st.nextToken());
		}
		

		//ex) str.countTokens();								//토큰의 갯수를 알려준다 -> for() 이용
		
	}

}
