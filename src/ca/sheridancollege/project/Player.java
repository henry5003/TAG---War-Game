package ca.sheridancollege.project;

/**
 * @authors zohair, henry, manh, smith
 */

/**
 * This class represents the player 
 */
public class Player {

    private String name;
    private Hand hand;

    // Constructor to initialize a new player with a given name
    public Player(String name) {
        this.name = name;
    }
    
    // Getter method to return the name of the player
    public String getName() {
        return this.name;
    }
    
    // Setter method to set the name of the player
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter method to return the hand of the player
    public Hand getHand() {
        return this.hand;
    }
    
    // Setter method to set the hand of the player
    public void setHand(Hand hand) {
        this.hand = hand;
    }
}

