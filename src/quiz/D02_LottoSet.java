package quiz;

import java.util.HashSet;

public class D02_LottoSet {
	/*
	 	HeshSet을 사용해서 1~45 사이의 중복없는 7개의 랜덤 숫자를 생성해보세요
	 */
	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		for(int i = 0; i < 7; ++i) {
			int randomNum = (int)(Math.random()*45 + 1);
			
			while(lotto.size() < 7) {
				int randomNum1 = (int)(Math.random()*45 + 1);
				lotto.add(randomNum1);
			}
		}
		System.out.println(lotto);
	}

}
