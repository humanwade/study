package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
		fis = new FileInputStream("abc.txt");
		System.out.println("파일 연결");
		 
		fis.read();
		
		
		}catch(FileNotFoundException ex){
			System.out.println("파일이 없는 예외발생");
		}catch(IOException ex) {
			System.out.println("파일 읽을 때 예외발생");
		}catch(Exception ex) {
			System.out.println("그 외 예외발생");
		}finally {
			try {
				fis.close();
			}catch(Exception ex) {}
		}


	}

}
