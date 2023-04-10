<<<<<<< HEAD
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

=======
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

    private String name; //the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

}
>>>>>>> parent of bc6ba18 (Final draft except testing (War Game).)
