package a_datatype;

public class My07_연습4 {

	public static void main(String[] args) {


		int sum = 0;
		
		for(int i = 1 ; i <= 10000 ; i++) {
			
			int a = i%10; 				//1의 자리
			int b = (i/10)%10; 			//10의 자리
			int c = (i/100)%10;			//100의 자리
			int d = (i/1000)%10;		//1000의 자리
					
			if(a==8) {sum+=1;}
			if(b==8) {sum+=1;}
			if(c==8) {sum+=1;}
			if(d==8) {sum+=1;}
			
			}System.out.println("8의 갯수는? " + sum + " 개");
		

	}

}
