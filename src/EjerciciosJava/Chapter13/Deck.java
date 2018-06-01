package EjerciciosJava.Chapter13;

import java.util.Arrays;
import java.util.Random;

/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    private Card[] cards;

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
    	
        StringBuilder string = new StringBuilder();
        
        for (int i = 0; i <= cards.length - 1; i++) {
           string.append(cards[i]);
           string.append(" ");
        }
        
        return string.toString();
        
     }

    /**
     * Chooses a random number between low and high, including both.
     */
    public static int randomInt(int low, int high) {
    	int c = 0;
    	int d = 0;
    	Random random = null;
    	
    	if(high > low) {
    		c = high;
    	}else {
    		c = low;
    	}
    	d = high - low;
    	
		return  random.nextInt(d) + low;
    	
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    public void swapCards(int a, int b) { 
    	//Card c1 = new Card(, );
    	Card c1 = cards[a];
    	cards[a] = cards[b];
    	cards[b] = c1;
    	
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() { //for each index i { // choose a random number between i and length - 1 // swap the ith card and the randomly-chosen card 
    	 for (int i=0;i<cards.length;i++){
    		 int max = cards.length - 1;
    		 int min = 0;
             swapCards(i, randomInt(min, max));
             min = min + 1;
          }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
    	int lowest = 0;
    	for (int i = low - 1; i <= high; i++) {
        	if(cards[low].compareTo(cards[i]) == 1) {
        		lowest = i;
        	}
        	
        }
    	
    	return lowest;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() { 
    	for(int i = 0; i <= cards.length - 1; i++) { 
    		// find the lowest card at or to the right of i // swap the ith card and the lowest card found } }
    		swapCards(i, indexLowest(i, cards.length - 1));
    		
    	}
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    public static Deck merge(Deck d1, Deck d2) {
        Card[] deck1 = d1.getCards();
        Card[] deck2 = d2.getCards();
        Card[] newDeck = new Card[deck1.length + deck2.length];
        int a = 0;
        int b = 0;
        for(int i = 0; i <= newDeck.length - 1; i++) {
        	if((i & 1) == 0) {
        		newDeck[i] = deck1[a];
        		a = a + 1;
        	}else {
        		newDeck[i] = deck2[b];
        		b = b + 1;
        	}
        }
        Deck mergedDeck = new Deck(newDeck.length);
        mergedDeck.cards = newDeck;
        return mergedDeck;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
    	
        int half = cards.length / 2;
        Deck deck1 = subdeck(0, half - 1);
        Deck deck2 = subdeck(half, cards.length);
        deck1.selectionSort();
        deck2.selectionSort();
        return merge(deck1, deck2);
        
    }
    public Deck mergeSortRecursive() {
    	
    	 int half = cards.length / 2;
         Deck deck1 = subdeck(0, half - 1).mergeSortRecursive();
         Deck deck2 = subdeck(half, cards.length).mergeSortRecursive();
         return merge(deck1, deck2);
         
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
    }
    
    
}