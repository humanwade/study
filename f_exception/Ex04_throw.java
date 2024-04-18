package f_exception;

public class Ex04_throw {

	public static void main(String[] args) {
		try {
			readArray();
		}catch(Exception ex){
			System.out.println("예외발생 : " + ex.getMessage());
		}
	}

	static void readArray() throws Exception {			//예외를 다른곳으로 던질때는 s가 붙는다 => throws 가 된다. 
		
		
	  try {
			String [] msg = {"행복합시다","공부합시다","짱꿍친하게"};
			for (int i = 0 ; i <= msg.length ; i++) {
				System.out.println(msg[i]);
			}
		  }catch(Exception ex) {
		  throw new MyException();		//일부러 예외발생		//예외를 발생시키는 경우에는 s없이 throw로 적는다. 
	    }
					
	}
}
