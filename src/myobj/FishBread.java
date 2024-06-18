package myobj;

public class FishBread {
	// 붕어빵을 많이 찍어내더라도 일정해야 하는 값
	// final static을 붙이자 (수정안된다)
	final static String[] flavorNames = {"팥", "슈크림", "민트초코"};
	final static int[] defaultPrices = {800, 1000, 1200};
	final static String[] qualityName = {"잘익음", "보통", "덜익음"};
	final static int[] qualityPrices = {100, 0, -100};
	
	public final static int kindOffFlavors = flavorNames.length;
	
	public int flavor;
	public int quality;
	
	public FishBread() {
		flavor = (int)(Math.random() * flavorNames.length);
		quality = (int)(Math.random() * qualityName.length);
	}
	
	public int getPrice() {
		return defaultPrices[flavor]+ qualityPrices[quality];
	}
	
	// 붕어빵 관련 함수이므로 붕어빵 클래스 내부에 배치하면 나중에 편하다
	public static int getTotalPrice(FishBread[] bread) {
		int sum = 0;
		for (int i =0; i < bread.length; ++i) {
			sum += bread[i].getPrice();
		}
		return sum;
	}
}

