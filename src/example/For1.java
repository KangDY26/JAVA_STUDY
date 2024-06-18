package example;

public class For1 {

	public static void main(String[] args) {
	/*
	 	1. 1000~2000 사이의 13의 배수를 모두 출력해보세요
	 	
	 	2. 50부터 100까지 모든 숫자의 총합을 구해서 출력해 보세요
	 	
	 	3. 1부터 1000까지 모든 10의 배수를 한 줄에 8개씩 출력해보세요 
	 	
	 	4. 1부터 19까지의 모든 숫자의 곱을 구해서 출력해 보세요
	 	
	 	5. 8999~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
	 	
	 */
		
		// 1. 
		
		
//		for (int i = 1000; i <= 2000; ++i) {
//			if (i % 13 == 0){
//				System.out.println(i);
//			}
//		}
		
		
		// 2.
//		int total = 0;
//		for (int i = 50; i <= 100; ++i) {
//			total = total + i;
//		}System.out.printf("총합은 %d", total);
		
		
		
		// 3.
		int cnt =0;
		for (int i = 1; i <= 1000; ++i) {
			if (i%10 == 0){
				System.out.printf("%4d", i);
				cnt++;
				if (cnt % 8 == 0) {
					System.out.println();
			}
		  }		
		}
		
//		for (int i = 1, cnt =0; i <= 1000; ++i) {
//			if (i%10 == 0){
//				System.out.printf("%4d", i);
//				++cnt;
//				if (cnt % 8 == 0) {
//					System.out.println();
//			}
//		}
//			
//				
//		}
		
		// 4.
		
//		long total = 1;
//		for (int i =1 ; i <= 19; ++i) {
//			total = i * total;
//		}System.out.println("총합은: " + total);
		
		
		// 5.
		
//		for(int i = 8999, cnt = 0; i >= 4999; --i) {
//			if( i % 287 == 0) {
//				++cnt;
//				if (cnt == 5) {
//				System.out.printf("[%d 번째 배수는 %d이다] \n", cnt , i);
//				}else {
//				System.out.printf("%d 번째 배수는 %d이다 \n", cnt, i);
//				}
//			}
//		}
		
		
		
		
//		int cnt = 0;
//		for (int i = 8999 ; i >= 4999; --i) {
//			if(i % 287 == 0) {
//				++cnt;
//				
//				if(cnt == 5) {
//					System.out.printf("[%d번째 287의 배수 : %d]\n", cnt, i);
//				}else {
//				System.out.printf("%d번째 287의 배수 : %d\n", cnt, i);
//			}
//		}
//		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
