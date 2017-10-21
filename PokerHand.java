package ch15Exercises;

public class PokerHand extends Deck {
	public PokerHand(int numCard) {
		cards = new Card[numCard];
	}
	
	public void print() {
		for (int i = 0; i < cards.length; i++) {
			cards[i].print();
		}
	}
	
	public boolean hasFlush() {
		int allSuit = cards[0].suit;
		for (int i = 1; i < cards.length; i++) {
			if (cards[i].suit != allSuit) {
				return false;
			}
		}
		return true;
	}
	
	public boolean hasThreeKind() {	
		mergeSort();
		for (int i = 1; i < cards.length - 2; i++) {
			if (cards[i].rank == cards[i-1].rank && cards[i].rank == cards[i+1].rank) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hasFourKind() {
		mergeSort();
		for (int i = 1; i < cards.length - 3; i++) {
			if (cards[i].rank == cards[i-1].rank && cards[i].rank == cards[i+1].rank && cards[i].rank == cards[i+2].rank) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hasFiveKind() {	
		mergeSort();
		for (int i = 1; i < cards.length - 4; i++) {
			if (cards[i].rank == cards[i-1].rank && cards[i].rank == cards[i+1].rank && cards[i].rank == cards[i+2].rank && cards[i].rank == cards[i+3].rank) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hasStraight() {
		mergeSort();
		for (int i = 0; i < cards.length - 1; i++) {
			if (cards[i+1].rank!=cards[i].rank+1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int counter3 = 0;
		int counterFlush = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counterS = 0;

		for (int i = 0; i < 100000; i++) {
			Deck deck = new Deck();
			deck.shuffle();
			deck.deal(5, false);
			if (deck.deal(5, false).hasFlush() == true) {
				counterFlush++;
			}
			if (deck.deal(5, false).hasThreeKind() == true) {
				counter3++;
			}
			if (deck.deal(5, false).hasFourKind() == true) {
				counter4++;
			}
			if (deck.deal(5, false).hasFiveKind() == true) {
				counter5++;
			}
			if (deck.deal(5, false).hasStraight() == true) {
				counterS++;
			}
		}
		System.out.println(counter3 + " Three of a Kind in 5 card hand in 100000 shuffles");
		System.out.println(counterFlush + " flushes in 5 card hand in 100000 shuffles");
		System.out.println(counter4 + " Four of a Kind in 5 card hand in 100000 shuffles");
		System.out.println(counter5 + " Five of a Kind in 5 card hand in 100000 shuffles");
		System.out.println(counterS + " Straight in 5 card hand in 100000 shuffles");
		
		int counter37 = 0;
		int counterFlush7 = 0;

		for (int i = 0; i < 100000; i++) {
			Deck deck = new Deck();
			deck.shuffle();
			deck.deal(7, false);
			if (deck.deal(7, false).hasFlush() == true) {
				counterFlush7++;
			}
		}
		System.out.println(counter37 + " Three of a Kind in 7 card hand in 100000 shuffles");
		System.out.println(counterFlush7 + " flushes in 7 card hand in 100000 shuffles");
		}
}
