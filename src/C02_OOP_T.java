
public class C02_OOP_T {
	
	public static void main(String[] args) {
		
	
		Cafe c1= new Cafe();
		Cafe c2= new Cafe();
		
		c1.changeName("빽다방");
		c2.changeName("얼음값500원카페");
		
		c1.addMenu("아메리카노", 10, 2000);
		c1.addMenu("빽사이즈 아메리카노", 20, 3000);
	
		c2.addMenu("아메리카노", 0, 1800);
		
		c1.printCafeInfo();
		c2.printCafeInfo();
	
	
	}
}
	
class Cafe{
	// 나중에 인스턴스 생성시의 기본값을 설정해 놓을 수 있다
	String name = "기본카페이름"; // 인스턴스 변수
	int area = 10;
	int seat = 20;
	int table = 5;
	CafeMenu[] Menu = new CafeMenu[5];
	int menuCount = 0;
	
	
	// 매개변수와 인스턴수 변수명이 같은 경우 this를 활용해 구분해 줄수있다
	void changeName(String name) {
		// this를 넣는것은 인스턴스 변수 name을 넣는것으로 확정한다
		this.name = name;
	}
	void printCafeInfo() {
		System.out.printf("카페이름: %s\n", this.name);
		System.out.printf("면적: %d평\n", this.area);
		System.out.printf("좌석수: %d석\n", this.seat);
		System.out.printf("테이블수: %d테이블\n", this.table);
		
		System.out.println("#### 메뉴판 ####");
		for (int i = 0; i < Menu.length; ++i) {
			if (Menu[i] != null) {					
			System.out.printf("-%s : %d원(%dkcal)\n",
					Menu[i].name, Menu[i].price, Menu[i].calories);
			}else {
				System.out.println(Menu[i]);
			}
		}
	}
	
	void addMenu(String name, int calories, int price) {
		CafeMenu toAdd = new CafeMenu();
		
		toAdd.name = name;
		toAdd.calories = calories;
		toAdd.price = price;
		
		this.Menu[this.menuCount++] = toAdd;
		
		this.Menu[this.menuCount] = new CafeMenu();
	}
	
}
class CafeMenu{
	String name;
	int calories;
	int price;
}
	
