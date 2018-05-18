package EjerciciosJava.Chapter12;

public class Exercise12_2 {
	
	public static final String[] RANKS = {
	        null, "Ace", "2", "3", "4", "5", "6", "7",
	        "8", "9", "10", "Jack", "Queen", "King"};

	    public static final String[] SUITS = {
	        "Clubs", "Diamonds", "Hearts", "Spades"};
	    private int rank;

	    private final int suit;

	    /**
	     * Constructs a Exercise12_1 of the given rank and suit.
	     */
	    public Exercise12_2(int rank, int suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }

	    /**
	     * Returns a negative integer if this Exercise12_1 comes before
	     * the given Exercise12_1, zero if the two Exercise12_1s are equal, or
	     * a positive integer if this Exercise12_1 comes after the Exercise12_1.
	     */
	    public void makeDeck() {
	    	
	    	Exercise12_1[] cards = new Exercise12_1[52];
	    	int index = 0;
	    	for (int suit = 0; suit <= 3; suit++) 
	    	{ 
	    		for (int rank = 1; rank <= 13; rank++) 
	    		{ 
	    			cards[index] = new Exercise12_1(rank, suit); 
	    			index++; 
	    		}
	    	}
	    }// Write a method called suitHist that takes an array of cards as a parameter and that returns a 
	    //histogram of the suits in the hand. Your solution should only traverse the array once.
	    

	    
	    public int compareTo(Exercise12_2 that) {
	    	
	        if (this.suit < that.suit) {
	            return -1;
	        }
	        if (this.suit > that.suit) {
	            return 1;
	        }
	        if (this.rank == 1 && that.rank != 1) {
	        	return 1;
	        }
	        if (that.rank == 1 && this.rank != 1) {
	        	return -1;
	        }
	        if (this.rank < that.rank) {
	            return -1;
	        }
	        if (this.rank > that.rank) {
	            return 1;
	        }
	        return 0;
	    }

	    /**
	     * Returns true if the given Exercise12_1 has the same
	     * rank AND same suit; otherwise returns false.
	     */
	    public boolean equals(Exercise12_2 that) {
	        return this.rank == that.rank
	            && this.suit == that.suit;
	    }

	    /**
	     * Gets the Exercise12_1's rank.
	     */
	    public int getRank() {
	        return this.rank;
	    }

	    /**
	     * Gets the Exercise12_1's suit.
	     */
	    public int getSuit() {
	        return this.suit;
	    }

	    /**
	     * Returns the Exercise12_1's index in a sorted deck of 52 Exercise12_1s.
	     */
	    public int position() {
	        return this.suit * 13 + this.rank - 1;
	    }

	    /**
	     * Returns a string representation of the Exercise12_1.
	     */
	    public String toString() {
	        return RANKS[this.rank] + " of " + SUITS[this.suit];
	    }

	}


