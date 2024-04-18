package c_control;


/*
 *  break 	 : 블럭을 벗어나는 문장
 *  continue : 블럭의 끝으로 가라는 문장
 */

public class Ex12_break_continue {

	public static void main(String[] args) {
		
		END : 
		for(int i = 0 ; i < 2 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				//if( j==1 ) break;								//이 위치에서 break j가 1이 되면 해당 for문은 그만하고 벗어나라는 뜻이다 -> 가장 가까운 반복문을 벗어나게 된다. 
				//if( j==1 ) continue;							//이 위치에서 continue는 j가 1이 될 때 부터 시작하라는 뜻이다. 
				//if(j==1 ) break END;							//break END인 경우 라벨(END)가 붙어 있는 곳으로 이동해 버린다는 뜻이다. 
				if( j==1 ) continue END;						//이 경우는,,,? 
				System.out.println("<" + i + "," + j + ">");
			}
			System.out.println("데이타");
		}

	}

}
