package ca.sheridancollege.project;

/**
 * @authors zohair, henry, manh, smith
 */

/**
 * This enum class represents the 13 possible ranks in a standard deck of cards and
 * their corresponding point values. It also provides methods to retrieve the rank name
 * and point value of a given rank.
 */
public enum Rank {
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 11),
    QUEEN("Queen", 12),
    KING("King", 13),
    ACE("Ace",14);

    private String rankName;
    private int pointValue;

    Rank (String rankName, int pointValue) {
        this.pointValue = pointValue;
        this.rankName = rankName;
    }

    /**
     * Returns the rank name for the current card.
     * @return the rank name
     */
    public String getRankName() {
        return this.rankName;
    }

    /**
     * Returns the point value for the current card.
     * @return the point value
     */
    public int getPointValue() {
        return this.pointValue;
    }

    /**
     * Returns a string representation of the rank.
     * @return the string representation of the rank
     */
    @Override
    public String toString() {
        if(this.getPointValue() > 10){
            return this.getRankName().substring(0,1);
        }
        return String.valueOf(this.getPointValue());
    }

}

