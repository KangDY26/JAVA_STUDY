package quiz;

public class C00_FunctionQuiz {
	/*
	 	# 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 	4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	 	5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	6. 메세지와 횟수를 전달하면 헤당 메세지를 전달한 횟수만큼 반복하는 함수
	 */
	
	// 1. 
	public static boolean englishword(char word) {
		return (word >= 'A' && word <= 'Z') || (word >= 'a' && word <= 'z');
		
	}
	
	// 2.
	public static boolean multiple(int num) {
		return (num % 3 == 0);
		
	}
	
	// 3.
	public static String evenOddnumber(int num) {
		return (num % 2 == 0) ? "짝수" : "홀수" ; 
		
	}
	
	// 4.
//	public static int divisor(int num) {
//		return ;
//		
//	}
	
	// 5.
//	public static boolean primenum(double num) {
//		return ();
//		
//	}
	
	
	public static void main(String[]args) {
		
		// 1.
		System.out.println(englishword('X'));
		
		// 2.
		System.out.println(multiple(80));
		
		// 3.
		System.out.println(evenOddnumber(5));
		
		// 4.
		
	}

}
