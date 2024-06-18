package myobj.prizedraw;


/*
 	룰렛을 100개의 변수라고 가정 룰렛에 다트를 던지는건 100개중에 한개를 랜덤으로 뽑는것으로함
 	등수의 확률에 맞춰 룰렛의 100개의 변수에 생성하고 랜덤하게 던져진 다트가 맞으면 몇등 X원 가량의 상품x 지급이 뜬다
 	아닐경우 꽝으로 뜨고 시도 횟수가 입력한 값에 도달하면 룰렛을 멈춘다
 	
 	시도는 독립시행 (돌릴 때마다 각각의 등수에 해당하는 번호가 달라야한다)
 	1등 X원 가량의 상품x 수량x 확률1% , 2등 Y원 가량의상품y 수량y 확률3%...
 	ex> 돌림판을 100이라고 할때 1등상품은 100개중 한개번호 2등상품은 1등 번호를 제외한 3개 번호로 같이 설정한다
 	해당 상품 수량이 떨어지더라도 해당 등수가 있다는 것을 가정하고 돌린다, 다만 해당 등수가 나왔을때는 다시돌리게 해야한다
 	
 */
public class PrizeList {

	int[] roulette = new int[100];
	int[] win1 = new int[1];
	int[] win2 = new int[3];
	int[] win3 = new int[6];
	
	static int Roulette_Winning = 1;
	static int Roulette_Loss = 0;


	
	
	
		public void shhffle() {
			for (int i = 0; i < roulette.length; ++i) {
				if(i < win1.length) {
					roulette[i] = Roulette_Winning;
				}else if (i < win2.length) {
					roulette[i] = Roulette_Winning;
				}else if (i < win2.length) {
					roulette[i] = Roulette_Winning;
				}else {
					roulette[i] = Roulette_Loss;
				}
			}
			for (int i =0; i < 100; ++i) {
					int ranIndex = (int)(Math.random() * (win1.length-1))+1;
	
	
			}
		}
}