package EjerciciosJava.Chapter12;

public class Exercise12_3 {
	
	private final int rank;
	private final int suit;
	
	public Exercise12_3(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
		
	}	
	
    public int getSuit() {
        return this.suit;
    }

    public void suitHist(Exercise12_3[] cards ) {
    	int hearts = 0;
    	int spades = 0;
    	int diamonds = 0;
    	int clubs = 0;
    	int total = 0;
    	
    	for(int i = 0; i <= cards.length - 1; i++) {
    		if(cards[i].getSuit() == 0) {
    			clubs = clubs + 1;
    		}if(cards[i].getSuit() == 1) {
    			diamonds = diamonds + 1;
    		}if(cards[i].getSuit() == 2) {
    			hearts = hearts + 1;
    		}if(cards[i].getSuit() == 3) {
    			spades = spades + 1;
    		}
    	}
    	total = spades + diamonds + hearts + diamonds;
    	System.out.println("Histogram: Clubs: " + (clubs*100)/total + "Diamonds: " + (diamonds*100)/total
    						+ "Hearts: " + (hearts*100)/total + "Spades: " + (spades*100)/total);
    	
    }
 
    public boolean hasFlush(Exercise12_3[] cards) {
    	
    	for(int i = 0; i <= cards.length - 1 ;i++) {
    			if(cards[i].getSuit() == cards[i + 1].getSuit()){
    				return true;
    			}
    	}
    	return false;
    }
		
}

