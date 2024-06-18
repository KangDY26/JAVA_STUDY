package quiz;

public class B08_ChangeCase_T {

	/*
	 	사용자가 영어로 된 문장을 입력하면 대소문자를
	 	반대로 바꿔서 출력해주는 프로그램을 만들어보시오
	 	
	 	입력> I Like to Try Aplle
	 	출력> i lIKE TO tRy aPPLE
	 	
	 */
	
	public static void main (String[] args) {
		
		String text = "I Like To Try Apple";
		
		int len = text.length();
		
		//int diff = Math.abs('A'-'a');
		
		for (int i =0; i < len; ++i) {
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				System.out.println(ch -'a' - 'A'); // ch가 a(97)일때 a(97)을 빼면 0 거기에 A(65)를 집어넣으면 결국 대문자로 바뀌는것과 같다
			//	System.out.print((char)(ch - diff));
			}else if (ch >= 'A' && ch <= 'Z') {
				System.out.println(ch - 'A' - 'a');
			//	System.out.print((char)(ch + diff));
			} else {
				System.out.println(ch);
			}
		}
		
		
		
	}
}
