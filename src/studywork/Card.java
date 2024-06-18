package studywork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public	class Card{
	
	final static char[] SUITS = {'♡','◇','♠','♣'};
	final static String[] RANKS = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
	
	final public static int NUM_OF_SUITS = SUITS.length;
	final public static int NUM_OF_RANKS = RANKS.length;
	
	final static int[] VALUES = {11, 2, 3 ,4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
    int suit; 
    int rank; 

    public Card(int suit, int rank) {
    	this.suit = suit;
    	this.rank = rank;
    	
    }
    public int getValue() {
    	return VALUES[rank];
    }
    
    @Override
    public String toString() {
    	return String.format("%c%s", SUITS[suit], RANKS[rank]);
    }
    public static void main(String[] args) {
		System.out.println(new Card(0, 5));
		System.out.println(new Card(3, 6));
		System.out.println(new Card(1, 5));
		System.out.println(new Card(2, 3));
	}
}
class CardDeckImpl implements CardDeck {

	LinkedList<Card> cards = new LinkedList<>();
	
	public CardDeckImpl() {
		reset();
		
	}
	
	private void reset() {
		for (int suit = 0; suit < Card.NUM_OF_SUITS; ++suit) {
			for (int rank = 0; rank <  Card.NUM_OF_RANKS; ++rank) {
				cards.add(new Card(suit, rank));
			}
		}
		shuffle();
	}
	
	@Override
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	@Override
	public Card draw() {

		Card card = cards.pollFirst();
		
		if (card == null) {
			reset();
			return draw(); 
		}
		
		return card;
	}
}
class Player {
	final public static int USER_PLAYER = 0;
	final public static int DEALER_NOT_OPEN = 1;
	final public static int DEALER_OPEN = 2;
	
	int printType;
	int money;
	List<Card> hand = new ArrayList<>();
	
	public Player(int type, int money) {
		this.printType = type;
		this.money = money;
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setPrintType(int printType) {
		this.printType = printType;
	}
	
	public void printHand() {
		if (printType == 0) {
			System.out.printf("플레이어: %s (%d)\n", hand, GameLogic.getValue(hand));
		} else if (printType == 1) {
			System.out.printf("딜러: X %s\n", hand.get(1));
		} else if (printType == 2) {
			System.out.printf("딜러: %s (%d)\n", hand, GameLogic.getValue(hand));
		}
	}
	
	public void resetHand() {
		while (hand.size() > 0) {
			hand.remove(0);			
		}
	}
	
	public void printMoney() {
		System.out.println(money);
	}
	
	public void earnMoney(int money) {
		this.money += money;
	}
	
	public void lossMoney(int money) {
		this.money -= money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
}
class GameLogic {

	final public static int PLAYER_WIN = 0;
	final public static int DEALER_WIN = 1;
	final public static int PUSH = 2;
	
	static int getValue(List<Card> cards) {
		int sum = 0;
		int aceCount = 0;
		
		for (Card card : cards) {
			int value = card.getValue();
			sum += value;
		
			if (value == 11) {
				++aceCount;
			}
		}
		while (aceCount > 0 && sum > 21) {
			sum -= 10;
			-- aceCount;
		}
		
		return sum;
	}
	
	static int check(List<Card> playercards, List<Card> dealercards) {
		int v1 = getValue(playercards);
		int v2 = getValue(dealercards);
		
		if (v1 > 21) {
			return DEALER_WIN;
		}else if (v2 > 21) {
			return PLAYER_WIN;
		}else if (v1 > v2) {
			return PLAYER_WIN;
		}else if (v1 < v2) {
			return DEALER_WIN;
		}else {
			return PUSH;
		}		
	}
}
interface CardDeck {	
	void shuffle();

	Card draw();

}
class BlackjackConsole {
	
	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		Player player = new Player(0, 3000);
		Player dealer = new Player(1, 0);
		
		CardDeck deck = new CardDeckImpl();
		
		System.out.println("#### 블랙잭 ####");
		while (true) {
			System.out.println("배팅 금액 > ");
			int bet = sc.nextInt();
			
			player.addCard(deck.draw());
			player.addCard(deck.draw());
			
			dealer.setPrintType(Player.DEALER_NOT_OPEN);
			dealer.addCard(deck.draw());
			dealer.addCard(deck.draw());
			
			player.printHand();
			dealer.printHand();
			
			while (true) {
				System.out.println("1.hit\t2.stand\n");
				int select = sc.nextInt();
				
				if (select == 1) {
					player.addCard(deck.draw());
					player.printHand();
					
					int value = GameLogic.getValue(player.getHand());
					
					if (value >= 21) {
						break;
					}
				} else if (select == 2) {
					break;
				} else {
					System.out.println("제대로 골라주세요");
				}
			}
			
			
			System.out.println("-- 게임 결과 --");
			player.printHand();
			dealer.setPrintType(player.DEALER_OPEN);
			dealer.printHand();
			
		if (GameLogic.getValue(player.hand) < 22) {			
			while (GameLogic.getValue(dealer.getHand()) <= 16) {
				dealer.addCard(deck.draw());
				dealer.printHand();
				Thread.sleep(1000);
			}
		}
			
			int result = GameLogic.check(player.getHand(), dealer.getHand());
			
			switch (result) {
				case GameLogic.PLAYER_WIN:
					player.earnMoney(bet);
					System.out.println("플레이어가 이겼습니다!");
					System.out.println("현재 플레이어의 소지금: " + player.getMoney());
					break;
				case GameLogic.DEALER_WIN:
					player.lossMoney(bet);
					System.out.println("딜러가 이겼습니다!");
					System.out.println("현재 플레이어의 소지금: " + player.getMoney());
					break;
				case GameLogic.PUSH:
					System.out.println("비겼습니다!");
					break;
			}
			
			player.resetHand();
			dealer.resetHand();
		}
	}

}

