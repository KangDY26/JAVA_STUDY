package myobj;

import java.util.Arrays;

public class PirateGame {

	int[] randomPoint = new int[4];
	int[] player = new int[4];
	int[] hole = new int[20];
	
	
	public PirateGame() {
		genAnser();
	}
	void genAnser() {
		for (int i = 0; i < randomPoint.length; ++i) {
			randomPoint[i] = (int)(Math.random()*20);
			
			for (int j = 0; j < i; ++j) {
				if (randomPoint[i] == randomPoint[j]) {
					--i;
					break;
				}
			}
		}
	}
	public void printAnswer() {
		System.out.println("꽝 번호는" + Arrays.toString(randomPoint));
	}
	
	
//	public PirateGameResult choiceNumber(int[] choiceNum) {
		// 시행은 result[0]가 나올때까지
//		int[] result = choiceNumber(
//				choiceNum[0],
//				choiceNum[1],
//				choiceNum[2],
//				choiceNum[3]);
//		return new PirateGameResult(result[0], result[1]);
//	} 
	// PirateGameResult클래스에서 result[0]=fail, result[1]=success로 설정
	
	

	
	// 4명이 20가지 선택지를 하나씩 고르기를 반복(randomPoint에 속한 번호를 고를때까지)
	// 선택지는 고를때마다 하나씩 줄어든다
	// 사람 순서는 0,1,2,3으로 지정
	// result[0] = 걸림, result[1] = 안걸림
	public int[] choiceNumber(int a, int b, int c, int d) {
		int[] result = {0, 0};
		
		
		for (int i =0 ; i < randomPoint.length; ++i) {
			if(randomPoint[i] == a) {
				if (i == 0) {
					++result[0];
					break;
				}else if(randomPoint[i] == b) {
					++result[0];
					break;
				}else if(randomPoint[i] == c) {
					++result[0];
					break;
				}else if(randomPoint[i] == d) {
					++result[0];
					break;
				}else {
					++result[1];
				}
				// 만약 ++result[1]을 뽑을경우 다음 player가 선택 대신 선택지가 -1
				if (randomPoint[i] !=  result[0]);
						for(int j = 0; j < i; --j) {
						
					}
				
			}
		}
		
		
		return result;
	}
		
	
}







