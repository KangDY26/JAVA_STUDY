package quiz;

public class B13_Sort {
	/*
	 	1~1000 사이의 랜덤 정수 값이 30개 들어있는 배열을 하나 생성한 후
	 	
	 	해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 만들어 원본과 함께 출력하시오
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[30];
				
		for(int i=0; i < 30; ++i) {
			int num= (int)(Math.random()*1000+1);
			arr[i] = num;		
		}
		
		int cnt = 0;
		for (int i = 0; i < 30; ++i) {
			cnt++;
			System.out.printf("%4d ",arr[i]);			
			if (cnt % 10 == 0){
				System.out.println();
				
			}
		}
		
	
	}

}
