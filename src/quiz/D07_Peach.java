package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D07_Peach {
	/*
 	연습1 : 복숭아 클래스를 정의해보세요
 		   복숭아는 가격, 등급, 무게, 농장이름을 필드로 가지고 있습니다
 		   (등급은 +,-를 매길 수 있음)
 		   
 	연습2 : 복숭아를 크기 비교가 가능한 객체로 만들어보세요 (무게 기준)
 	
 	연습3 : 복숭아를 등급기준으로 내림차순 정렬하고,
 	       등급이 같은 경우 가격 기준으로 내림차순 정렬해보세요
 	
 	연습4 : 복숭아를 농장이름순으로 오름차순 정렬하고 농장이름이 같은 경우 등급 기준으로 내림차순 정렬해 주세요
	 */
	public static void main(String[] args) {
		
		List<Peach> peachs = new ArrayList<>();
		
		peachs.add(new Peach(2000, "A-", 500, "김씨네농장"));
		peachs.add(new Peach(2500, "B+", 450, "이씨네농장"));
		peachs.add(new Peach(2200, "A", 400, "박씨네농장"));
		peachs.add(new Peach(1900, "C", 500, "강씨네농장"));
		peachs.add(new Peach(3000, "A+", 800, "강씨네농장"));

		Collections.sort(peachs);
		
		
//		Collections.sort(peachs, new Comparator<Peach>() {
//			@Override
//			public int compare(Peach p1, Peach p2) {
//				if (p1.weight == p2.weight) {
//					return 0;
//				} else if (p1.weight > p2.weight) {
//					return 1;
//				} else {
//					return -1;
//				}
//			}
//		});
		System.out.println(peachs);
	}
	
}

class Peach implements Comparable<Peach>{
	int price;
	String grade;
	int weight;
	String farm;
	
	public Peach(int price, String grade, int weight, String farm) {
		this.price = price;
		this.grade = grade;
		this.weight = weight;
		this.farm = farm;
	}
	@Override
	public String toString() {
		return String.format("%d원/%s등급/%d그램/%s\n", price, grade, weight, farm);
	}
//	@Override
//	public int compareTo(Peach p) {
//		if (this.weight == p.weight) {
//			if (this.price == p.price) {
//				return 0;
//			} else if (this.price > p.price) {
//				return 1;
//			}else {
//				return -1;				
//			}
//		} else if (this.weight > p.weight) {
//			return 1;
//		} else {
//			return -1;			
//		}
//	}
	
	
	
	@Override
	public int compareTo(Peach p) {
		if (this.grade.charAt(0) == p.grade.charAt(0)) {
			if (this.price == p.price) {
				return 0;
			} else if (this.price > p.price) {
				return 1;
			}else {
				return -1;				
			}
		} else if (this.grade.charAt(0) > p.grade.charAt(0)) {
			return 1;
		} else {
			return -1;			
		}
	}
}















