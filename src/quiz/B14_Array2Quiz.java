package quiz;

public class B14_Array2Quiz {
	
	public static void main(String[]args) {
		
		int[][] myArr = {
			new int[5],
			new int[7],
			new int[3],
			new int[10],
			{1, 1, 1, 1}
		};
		
		// 1. myArr의 모든 값을 100~200 사이의 랜덤 정수로 바꾸기
		
		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균을 구하기
		
		// 3. 각 행(row)의 합을 구해서 출력하기
		
		// 4. 각 열(col)의 합을 구해서 출력하기
		
		// 1.
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				int num = (int)(Math.random()*101+100);
				myArr[i][j] = num;
				System.out.printf("[%d][%d]= %d\n", i, j, num);
			}
		}
		System.out.println();
		
		// 2.
		int total = 0;
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				total += myArr[i][j];
			}
		}
		System.out.printf("모든 총합은 %d, 평균은 %d \n", total, total/5);
		
		System.out.println();
		
		// 3.
		int[] rowtotal = new int[myArr.length];
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				
				rowtotal[i] += myArr[i][j];
			}
			System.out.printf("%d번 행의 총합은 %d\n", i, rowtotal[i]);
//			System.out.println(rowtotal[i]);
		}
		
		System.out.println();
		// 4. ??
		int[] coltotal = new int[myArr[0].length];
		
		for (int j = 0; j < myArr.length; ++j) {
			for (int i = 0; i < myArr[j].length; ++i) {
				
				coltotal[j] += myArr[j][0];

			}
			System.out.println(coltotal[j]);
		}

		
	}

}
