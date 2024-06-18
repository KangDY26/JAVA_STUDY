package quiz;

import java.util.Scanner;

public class B08_ChangeCase {

	/*
	 	사용자가 영어로 된 문장을 입력하면 대소문자를
	 	반대로 바꿔서 출력해주는 프로그램을 만들어보시오
	 	
	 	입력> I Like to Try Aplle
	 	출력> i lIKE TO tRy aPPLE
	 	
	 */
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영문장을 입력하시오 >");
		String eng = sc.nextLine();
		char tmp; // ?
		
		
		for (int i = 0; i < eng.length(); i++) {
			tmp = eng.charAt(i);
			if((65<=tmp)&&(tmp<=90)) {
				System.out.print((char)(tmp+32));
			}else if ((97<=tmp) && (tmp <= 122)) {
				System.out.print((char)(tmp-32));
			}else {
				System.out.print((char)tmp);
			}
		}
		
		

		
	}
	
}
