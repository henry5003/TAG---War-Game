package ca.sheridancollege.project;

/**
 * @authors zohair, henry, manh, smith
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class represents a deck of 52 Playing Cards
 */
public class Deck {

    private final List<Card> cards = new ArrayList<Card>();

    Deck() {
        fillDeck();
    }

    /**
     * Fills the deck with 52 cards.
     */
    private void fillDeck() {
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards.add(new Card(r, s));
            }
        }
    }

    /**
     * Shuffles the deck of cards to make cards random.
     */
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    /**
     * @return the list of cards in the deck.
     */
    public List<Card> getCards() {
        return this.cards;
    }

    /**
     * @return the number of cards in the deck
     */
    public int getCardsSize() {
        return this.cards.size();
    }

    /**
     * Removes and returns the top card of the deck.
     */
    public Card drawCard() {
        return this.cards.remove(this.cards.size() - 1);
    }

    /**
     * Adds a card to the bottom of the deck.
     */
    public void addCard(Card c) {
        this.cards.add(0, c);
    }

    /**
     * Returns a string representation of the deck.
     */
    @Override
    public String toString() {
        return this.cards.toString();
    }
}
