///**
// * SYST 17796 Project Base code.
// * Students can modify and extend to implement their game.
// * Add your name as an author and the date!
// */
//package ca.sheridancollege.project;
//
///**
// * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
// * game. Students wishing to add to the code should remember to add themselves as a modifier.
// *
// * @author dancye
// */
//public class Card {
//    //default modifier for child classes
//
//    /**
//     * Students should implement this method for their specific children classes
//     *
//     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
//     */
//
//    public enum SUITS {DIAMOND,SPADE,CLUB,HEART};
//    public enum VALUE {ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING};
//
//    private final SUITS suits;
//    private final VALUE value;
//
//
//    public Card(SUITS mySuits , VALUE myVal){
//        suits=mySuits;
//        value= myVal;
//    }
//
//    // @Override
//    // public String toString(){
//    //     return string;
//    // };
//
//
//}
/**
 * A class to represent a playing card.
 */
package ca.sheridancollege.project;

public class Card implements Comparable<Card> {
    
    /**
     * Enumeration of the possible suits for a card.
     */
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
    
    /**
     * Enumeration of the possible values for a card.
     */
    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    
    private final Suit suit;
    private final Value value;
    
    /**
     * Constructor for a Card object.
     * 
     * @param suit The suit of the card.
     * @param value The value of the card.
     */
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
    
    /**
     * Getter for the suit of the card.
     * 
     * @return The suit of the card.
     */
    public Suit getSuit() {
        return suit;
    }
    
    /**
     * Getter for the value of the card.
     * 
     * @return The value of the card.
     */
    public Value getValue() {
        return value;
    }
    
    /**
     * Returns a String representation of the card.
     * 
     * @return A String representation of the card.
     */
    @Override
    public String toString() {
        return value + " of " + suit;
    }
    
    /**
     * Compares two cards based on their value.
     * 
     * @param other The other card to compare to.
     * @return A negative integer, zero, or a positive integer as this card is less than, equal to, or greater than the other card.
     */
    @Override
    public int compareTo(Card other) {
        return this.value.compareTo(other.value);
    }
}
