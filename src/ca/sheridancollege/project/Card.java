package ca.sheridancollege.project;

/**
 * @authors zohair, henry, manh, smith
 */

/**
 * This class represents a single playing card (from a 52 card deck).
 * One Card is made up of a suit value, a rank value, and card value
 */
public class Card implements Comparable<Card> {

    private final Rank rank;
    private final Suit suit;
    private final String card;

    /**
     * Constructor for Card class
     * @param rank is the rank of the card
     * @param suit is the suit of the card
     */
    public Card(Rank rank, Suit suit) {
        if (rank == null || suit == null) {
            throw new NullPointerException();
        }
        this.rank = rank;
        this.suit = suit;
        this.card = String.format("%s%s", rank.toString(), suit.getSymbol());
    }

    /**
     * Getter for suit
     * @return the suit of the card
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * Getter for suit letter
     * @return the suit letter of the card
     */
    public String getSuitLetter() {
        return this.suit.getSymbol();
    }

    /**
     * Getter for rank
     * @return the rank of the card
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * Getter for rank letter
     * @return the rank letter of the card
     */
    public String getRankLetter() {
        return this.rank.toString();
    }

    /**
     * Getter for card points
     * @return the point value of the card
     */
    public Integer getCardPoints() {
        return this.rank.getPointValue();
    }

    /**
     * Getter for card
     * @return the card in string format
     */
    public String getCard() {
        return this.card;
    }

    /**
     * Compare cards by point value
     * @return an integer representing the comparison
     */
    public int compareTo(Card card2) {
        return this.getCardPoints().compareTo(card2.getCardPoints());
    }

    /**
     * Check if the card has the same suit as another card
     * @param card2 is the card to compare to.
     * @return a boolean value indicating if the cards have the same suit
     */
    public boolean hasSameSuit(Card card2) {
        return this.suit.equals(card2.suit);
    }

    /**
     * Check if the card has the same rank as another card
     * @return a boolean value indicating if the cards have the same rank
     */
    public boolean hasSameRank(Card card2) {
        return this.rank.equals(card2.rank);
    }

    /**
     * Override the equals method to compare Cards based on rank and suit
     * @param obj the object to compare to
     * @return a boolean value indicating if the objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Card.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Card card2 = (Card) obj;
        return this.suit == card2.suit && this.rank == card2.rank;
    }

    /**
     * Override the toString method to display the card in a readable format
     * @return the card as a string in the format "rank of suit"
     */
    @Override
    public String toString() {
        return this.rank.getRankName() + " of " + this.suit.getSuitName();
    }
}
