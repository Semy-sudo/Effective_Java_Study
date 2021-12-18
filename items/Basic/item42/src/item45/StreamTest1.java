package item45;

import java.util.List;

public class StreamTest1 {
	static class Card{
		int num;
		Card(int num){
			this.num = num;
		}
	}
	
	static class Suit extends Card{

		Suit(int num) {
			super(num);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// 카드의 무늬(Suit)와 숫자(Rank) 별 모든 카드 조합
	private static List<Card> newDeck(){
		List<Card> result = new ArrayList<>();
		for(Suit suit: Suit.values()) {
			
		}
	}

}
