
public class B02_Operator1 {
	
	/*
	 	# 연산자 (Operator)
	 	
	 	- 계산할 때 값과 함께 사용하는 것
	 	- +, -, *, /, >, <, >=, ...
	 	
	 	# 산술연 산자
	 	
	 	 + : 더하기
	 	 - : 빼기
	 	 * : 곱하기
	 	 / : 나누기 (※ 정수로 나눌 때와 실수로 나눌 때의 결과가 다름
	 	 % : 나머지
	 */
	public static void main(String[] args) {
		int a=15, b=7;
		double c = 10.5;
		
		// 정수와 정수의 연산 => 정수
		// 정수와 실수의 연산 => 실수
		System.out.println("a + b : " +( a + b));
		System.out.println("a + c : " + ( a + c));
		System.out.println("a - b : " + ( a - b));
		System.out.println("a - c : " +( a - c));
		System.out.println("a * b : " + a * b);
		System.out.println("a * c : " + a * c);		
		System.out.println("(정수끼리의 나누기) a/b: " + a / b);
		System.out.println("(정수와 실수 나누기)a/c: " + a / c);
		System.out.println("a % b: " + a % b);
		
		// Math.abs() : 절대값을 구하는 함수
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		// Math.round(x) : x를 소수 첫째 자리에서 반올림해주는 함수
		System.out.println(Math.round(1.55));
		
		// Math.ceil(x) : x를 소수 첫째 자리에서 올림해주는 함수
		System.out.println(Math.ceil(1.11));
		
		// Math.floor(x) : x를 소수 첫째 자리에서 내림해주는 함수
		System.out.println(Math.floor(1.99));

		// 연습: 10.34567을 소수 3번째 자리에서 내림할 결과를 출력해보세요
		
		double pn = 10.34567;
		
		System.out.println("1단계 : " + pn*100);
		System.out.println("2단계 : " + Math.floor(1034.567));
		System.out.println("3단계 : " + 1034.0 / 100);
		
		System.out.println();
		
//		System.out.printf("1단계 : %f\n", pn);
//		System.out.println("2단계 : " + Math.floor(1034.567));
//		System.out.println("3단계 : " + 1034.0 / 100.0);
		
		System.out.println(Math.floor(pn*100)/100.0);
		
		System.out.println();
		
		// Math.pow(x, y) : x의 y제곱을 구하는 함수
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.pow(2, 9));
		
		// Math.sqrt(x) : x의 제곱근을 구하는 함수
		System.out.println(Math.sqrt(49));
		System.out.println(Math.sqrt(48));
		System.out.println(Math.sqrt(9));
		
		// Math.max(x, y) : 두 값 중 더 큰 값을 구하는 함수
		System.out.println(Math.max(-3, 99));
		
		// Math.min(x, y) : 두 값 중 더 작은 값을 구하는 함수
		System.out.println(Math.min(-3, 99));
		
		
	}
}






