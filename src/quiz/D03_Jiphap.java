package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class D03_Jiphap {
	/*
	 	1. 두 컬랙션을 매개변수로 전달 받으면 두 컬랙션의 합집합을 Set으로 변환하는 메서드
	 	[1, 2, 3] + [2, 3, 4, 5] -> [1, 2, 3, 4, 5]
	 	
	 	2. 두 컬랙션을 매개변수로 전달 받으면 두 컬랙션의 교집합을 Set으로 변환하는 메서드
	 	[1, 2, 3] 교 [2, 3, 4, 5] -> [2, 3]

	 	3. 두 컬랙션을 매개변수로 전달 받으면 두 컬랙션의 차집합을 Set으로 변환하는 메서드
	 	[1, 2, 3] - [2, 3, 4, 5] -> [1]
	 	[2, 3, 4, 5] - [1, 2, 3] -> [4, 5]

	 */
	
	//1
	
	HashSet<Integer> plus(Collection a, Collection b) {
		HashSet<Integer> set = new HashSet<>();
		set.addAll(a);
		set.addAll(b);
		
		return set;
	}
	


	
	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();

		arr1.add(1);
		arr1.add(2);
		arr1.add(3);

		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		D03_Jiphap tools1 = new D03_Jiphap();
		
		HashSet<Integer> plusResult = tools1.plus(arr1, arr2);
		System.out.println(plusResult);


		
//		D03_Jiphap tools2 = new D03_Jiphap();
//		
//		HashSet<Integer> intersectionResult = tools.intersection(arr1, arr2);
//		System.out.println(intersectionResult);
		
		
		
				
	}

}
