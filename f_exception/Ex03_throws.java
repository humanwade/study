package f_exception;

import java.io.FileInputStream;

public class Ex03_throws {

	public static void main(String[] args) {
		try {
		readFile();
	   }catch(Exception ex) {
		   System.out.println("예외발생 : " + ex.getMessage());
	   }
	}
	static void readFile() throws Exception{
		FileInputStream fis = new FileInputStream("abc.txt");
		
	}

}
