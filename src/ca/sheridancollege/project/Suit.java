package ca.sheridancollege.project;

/**
 * @authors zohair, henry, manh, smith
 */

/**
 * The Suit class represents the suits of a standard deck of playing cards.
 * Each suit has a name and a symbol associated with it, and the class provides
 * methods to retrieve these properties.
 */
public enum Suit {
    DIAMONDS("Diamonds", "D"),
    SPADES("Spades", "S"),
    CLUBS("Clubs", "C"),
    HEARTS("Hearts", "H");

    private String suitName;
    private String symbol;
    
    /**
     * Constructor for the Suit enum class. 
     * Each Suit is initialized with a name and a symbol.
     * @param suitName the name of the suit
     * @param symbol the symbol representing the suit
     */
    Suit(String suitName, String symbol){
        this.suitName = suitName;
        this.symbol = symbol;
    }

    /**
    * Returns the symbol associated with the suit.
    * @return the symbol of the suit
    **/
    public String getSymbol(){
        return this.symbol;
    }

    /**
     * Returns the name of the suit.
     * @return the name of the suit
     */
    public String getSuitName() {
        return this.suitName;
    }

    /**
     * Returns a string representation of the suit, which is the symbol of the suit.
     * @return the symbol of the suit
     */
    
    @Override
    public String toString() {
        return this.getSymbol();
    }

}