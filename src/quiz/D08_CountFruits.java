package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class D08_CountFruits {
	
	// 크기 1000의 String[]을 만들고 다음의 과일을 무작위로 추가한 후
	// 해당 배열 내부에 각 과일이 몇 개씩 들어있는지 세어서 출력해주세요
	final public static String[] FRUITS = 
		{"Apple", "Banana", "Orange","Mango","Kiwi","Pineapple","Peach","Watermelon","Grape"};

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		
		for (int i = 0; i < 1000; ++i) {
			int ran = (int)(Math.random()*FRUITS.length);
			fruits.add(FRUITS[ran]);
		}
		
//		System.out.println(fruits);
		
		
//		System.out.println("사과의 개수는: " + Collections.frequency(fruits, "Apple"));
//		System.out.println("바나나의 개수는: " + Collections.frequency(fruits, "Banana"));
//		System.out.println("오랜지의 개수는: " + Collections.frequency(fruits, "Orange"));
//		System.out.println("망고의 개수는: " + Collections.frequency(fruits, "Mango"));
//		System.out.println("키위의 개수는: " + Collections.frequency(fruits, "Kiwi"));
//		System.out.println("파인애플의 개수는: " + Collections.frequency(fruits, "Pineapple"));
//		System.out.println("복숭아의 개수는: " + Collections.frequency(fruits, "Peach"));
//		System.out.println("수박의 개수는: " + Collections.frequency(fruits, "Watermelon"));
//		System.out.println("포도의 개수는: " + Collections.frequency(fruits, "Grape"));

//		int count = Collections.frequency(fruits,"Apple" );
//
//		System.out.println(count);
		
		for (int i = 0; i < FRUITS.length; ++i) {
			System.out.printf("%s의 개수는 %d\n",FRUITS[i], Collections.frequency(fruits,FRUITS[i]) );
		}
	}
}









