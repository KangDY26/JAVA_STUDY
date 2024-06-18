package quiz;

public class B07_ForQuiz {
	/*
	 	1. 1000~2000 사이의 13의 배수를 모두 출력해보세요
	 	
	 	2. 50부터 100까지 모든 숫자의 총합을 구해서 출력해 보세요
	 	
	 	3. 1부터 1000까지 모든 10의 배수를 한 줄에 8개씩 출력해보세요 
	 	
	 	4. 1부터 19까지의 모든 숫자의 곱을 구해서 출력해 보세요
	 	
	 	5. 8999~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
	 	
	 */

	public static void main (String[] args) {
		
		// 1.
		for(int  i = 1000; i <=2000; ++i) {
			if  (i%13 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		// 2.
//		for(int i = 50; i <= 100; ++i) {
//			totla = i+1;
//			System.out.println(totla);
//		}
		
		
		// 4.
		
		long total = 1;
		for (int i = 1; i <= 19; ++i ) {
			total = total * i;	
		// total(1) = total(1)*1
		// total() = total()*
		}
		System.out.println("총합은: " + total);
		
		System.out.println();
		
		// 5. 8999~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
		
		for (int i = 8999, printCount = 0; i >= 4999; --i ) {
			if (i % 287 == 0) {
				System.out.printf("%6d", i);
				
				++printCount;
				

				}
			}
		
		
		
		
		
		
//		for (int i =1, printCount = 0; i <=1000; ++i) {
//			if (i % 10 ==0 ) {
//				System.out.printf("%6d", i);
//				
//				++printCount; // 10의 배수를 추력한 횟수를 센다 
//				
//				if(printCount % 8 ==0) {
//					System.out.println();
//				}
//			}
//		}

	}
}










