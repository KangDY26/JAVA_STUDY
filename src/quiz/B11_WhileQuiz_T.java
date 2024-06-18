package quiz;

public class B11_WhileQuiz_T {
	/*
	 
	while문을 사용하여
	 
 	1. 1000~2000 사이의 13의 배수를 모두 출력해보세요
 	
 	2. 50부터 100까지 모든 숫자의 총합을 구해서 출력해 보세요
 	
 	3. 1부터 1000까지 모든 10의 배수를 한 줄에 8개씩 출력해보세요 
 	
 	4. 1부터 19까지의 모든 숫자의 곱을 구해서 출력해 보세요
 	
 	5. 8999~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
 	
 */
	
	public static void main (String[] args) {
		
		// 1. 1000~2000 사이의 13의 배수를 모두 출력해보세요
		
		int i =1000;
		while (i++ <= 2000) {
			if (i%13 == 0) {
				System.out.println(i);				
			}
			++i;
		}

	 	// 2. 50부터 100까지 모든 숫자의 총합을 구해서 출력해 보세요
		i = 50;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			++i;
		}
		System.out.println("총합: " + sum);
		
		//	3. 1부터 1000까지 모든 10의 배수를 한 줄에 8개씩 출력해보세요 
		
		i = 1;
		int cnt =0;
		while (i <= 1000) {
			if (i%10 == 0) {
				System.out.println(i + "\t");
				
				if (++cnt % 8 ==0 ) {
					System.out.println();
				}
			}
			
			++i;
		}
		
		// 	4. 1부터 19까지의 모든 숫자의 곱을 구해서 출력해 보세요
		
		i=1;
		long sum2 = 1;
		
		while (i <= 19) {
			sum2*=i;
			++i;
		}
		System.out.println(sum2);
		
		// 	5. 8999~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
		
		i = 8999;
		int cnt1 =0;
		while (i >= 4999) {
			if (i%287==0) {
				if (++cnt1 == 5) {
					System.out.println("5번째 287배수: "+i);
				}
			}
			--i;
			
		}

		
	
	}
		
}
