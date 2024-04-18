package c_control;

import java.util.*;

public class 복습 {

	public static void main(String[] args) {

		String sn = "891010-1144556";

		char g = sn.charAt(0);
		System.out.println(g);

		if( g == '0' || g == '9'){			//주민번호는 문자비교라서 따옴표를 넣어줘야함
			System.out.println("mz");
		}

		String age = "";
		switch (g) {
		case '0' :
		case '9' : age ="청년"; break;
		case '8' : age ="젊은이"; break;
		default : age ="정상인"; break;
		}
		 System.out.println("당신은 " + age + " 입니다");





	}

}
