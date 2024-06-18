package example;

public class For2 {

	/*
	 	# for문을 사용해 숫자를 다음과 같이 출력해보세요
	 	
	 	1. 0 3 6 9 12...93 96 99
	 	
	 	2. -35 -28 -21 ... 0 7 14 ... 35
	 	
	 	3. 100 200 300... 1000
	 	
	 	4. 100부터 0까지
	 	
	 	5. 0부터 9까지 (30번 반복)
	 	
	 	6. 10부터 1까지 (30번 반복)
	 	
	 	7. 7 77 777 777 777 .... 7777777777
	 */
	
	public static void main (String[] args) {
		
		// 1.
		// 8줄로 나열
		int cnt = 0;
		for (int i = 0; i <= 99; ++i ) {
			if (i%3 == 0) {
				System.out.printf("%4d", i);
				++cnt;
			}
			if (cnt % 8 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		// 2.
		
//		for (int i = -35; i <= 35; ++i) {
//			if(i%7 == 0) {
//				System.out.println(i);
//			}
//		}
		System.out.println();
		// 3.
//		for(int i=100; i <= 1000; ++i ) {
//			if(i%100==0) {
//				System.out.println(i);
//			}
//		}
		System.out.println();
		// 4.
		
//		for (int i = 100; i >=0; --i) {
//			System.out.println(i);
//		}
		
		// 5.
//		for(int i = 0; i < 30; ++i) {
//			System.out.print(i%10+ " ");
//		}
		
		// 6. 10부터 1까지
//		for (int i = 0; i < 30; ++i) {
//			System.out.print((10 - i%10) +" ");
//		}
		// .7
		

	}
}
