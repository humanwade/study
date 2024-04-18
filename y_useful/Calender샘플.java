package y_useful;


/*
 * 날짜 관련 클래스 : java.util 패키지에 들어 있음
 * 		- Date
 * 		- Calendar
 * 		- LocalDate
 * 		- LocalDateTime
 * 
 */
import java.util.*;

public class Calender샘플 {

	public static void main(String[] args) {
		
		//Calendar c = new Calendar();			//이미 정보를 가지고 있기 때문에(컴퓨터가 정보를 기억하고 있어서) new쓰지 말고 
		  Calendar c = Calendar.getInstance();	//getInstance를 써야함
		  int year   = c.get(Calendar.YEAR);
		  int month  = c.get(Calendar.MONTH)+1;	//month의 월 개념은 숫자임 ex)1월==0, 3월==2
		  int day    = c.get(Calendar.DATE);
		  
		  System.out.println(year + "/" + month + "/" + day);
		  
		  //시, 분, 초 출력
		  int hour = c.get(Calendar.HOUR);
		  int min  = c.get(Calendar.MINUTE);
		  int sec  = c.get(Calendar.SECOND);
		  
 
		  System.out.println(hour + "/" + min + "/" + sec);
		  

		  //요일구하기
		  //일요일1, 월요일2, 화요일3, 수요일4, 목요일5, 금요일6, 토요일7
		  String [] day_of_week = {"일","월","화","수","목","금","토"};
		  int week_int = c.get(Calendar.DAY_OF_WEEK);
		  System.out.println(week_int);
		 
		  
		  //배열에 담긴 값을 가져올떄는 대괄호 안에 숫자(=색인 index)를 넣는다
		  System.out.println(day_of_week[week_int - 1]+ "요일 입니다");	
		  
	}

}
