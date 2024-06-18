package myobj.pirate;

public class PirateGamePlayer {
	String name;
	int rating;
	int money;
	int surviveCount;
	
	public PirateGamePlayer(String mane) {
		this.name = mane;
		rating = 10000;
		money = 5000;
	}
	
	public void earnMoney(int money) {
		this.money += money;
	}
	
	public void ratingUP(int amount) {
		this.rating += surviveCount * amount;
	}
	
	public void ratingDown(int amount) {
		this.rating -= amount;
		

	}
	public void survive() {
		++this.surviveCount;
	}
	
	public void resetSurvive() {
		this.surviveCount = 0;
		
	}
	
	public void print() {
		System.out.printf("[%s, 점수:%d, 소지금:%d]\n",
				this.name, this.rating, this.money);
	}
	
	public void print(int money) {
		System.out.printf("[%s, 점수%d, 소지금:%d(+%d)]\n",
				this.name, this.rating, this.money, money);
	}

}
