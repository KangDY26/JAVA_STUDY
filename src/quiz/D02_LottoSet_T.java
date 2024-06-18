package quiz;

import java.util.HashSet;

public class D02_LottoSet_T {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() != 7) {
			lotto.add((int)(Math.random()*45 + 1));
			
		}
		System.out.println(lotto);
		
	}
}
