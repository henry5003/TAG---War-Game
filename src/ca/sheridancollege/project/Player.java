///**
// * SYST 17796 Project Base code.
// * Students can modify and extend to implement their game.
// * Add your name as an author and the date!
// */
//package ca.sheridancollege.project;
//
///**
// * A class that models each Player in the game. Players have an identifier, which should be unique.
// *
// * @author dancye
// * @author Paul Bonenfant Jan 2020
// */
//public abstract class Player {
//
//    private String name; //the unique name for this player
//
//    /**
//     * A constructor that allows you to set the player's unique ID
//     *
//     * @param name the unique ID to assign to this player.
//     */
//    public Player(String name) {
//        this.name = name;
//    }
//
//    /**
//     * @return the player name
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * Ensure that the playerID is unique
//     *
//     * @param name the player name to set
//     */
//    // public void setName(String name) {
//    //     this.name = name;
//    // }
//
//    /**
//     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
//     * with logic to play your game.
//     */
//    public abstract void play();
//
//}
package ca.sheridancollege.project;

public abstract class Player implements Comparable<Player> {

    private String name; // the unique name for this player

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
    // public void setName(String name) {
    //     this.name = name;
    // }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

    /**
     * Compare players by name.
     *
     * @param other the other player to compare to
     * @return a negative integer, zero, or a positive integer as this player is less than, equal to, or greater than
     * the specified player.
     */
    @Override
    public int compareTo(Player other) {
        return this.name.compareTo(other.getName());
    }
}
