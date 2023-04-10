package ca.sheridancollege.project;

/**
 * @authors zohair, henry, manh, smith
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a player's hand of cards. 
 * Provides methods to add, remove, and manipulate cards in the hand.
 * Returns information about the hand, such as the number of cards in it.
 */
public class Hand {
    
    // List of cards in the player's hand
    private List<Card> cards; 

    /**
     * Constructor for a Hand object.
     * Initializes the hand as an empty list.
     */
    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    /**
     * Merges another Hand object into this Hand object by adding all of its cards to the bottom of this Hand object.
     */
    public void mergeHand(Hand card2) {
        for (Card c : card2.cards) {
            this.addCardToBottom(c);
        }
    }


     /**
     * Takes a specified number of cards from the top of the Hand object.
     * @return A list of the cards taken from the top of the Hand object.
     */
    public List<Card> take(int numCards) {
        if (numCards > this.handSize()) {
            return null;
        }

        List<Card> out = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            out.add(this.cards.remove(this.handSize() - 1));
        }

        return out;
    }

     /**
     * Adds a specified card to the top of the Hand object.
     * If the card is null, a NullPointerException is thrown.
     */
    public void addCardToTop(Card c) {
        if (c == null) {
            throw new NullPointerException("Can't add a null card to a cards.");
        }
        cards.add(c);
    }

     /**
     * Adds a list of cards to the top of the Hand object.
     */
    public void addCardsToTop(List<Card> cds) {
        this.cards.addAll(cds);
    }

    /**
     * Adds a specified card to the bottom of the Hand object.
     */
    public void addCardToBottom(Card c) {
        cards.add(0, c);
    }

    /**
     * Removes and returns the card from the top of the Hand object.
     */
    public Card removeCardFromTop() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(handSize() - 1);
    }

    /**
     * Removes and returns the card from the bottom of the Hand object.
     */
    public Card removeCardFromBottom() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(0);
    }

    /**
     * Returns the number of cards in the Hand object.
     */
    public int handSize() {
        return cards.size();
    }

}
