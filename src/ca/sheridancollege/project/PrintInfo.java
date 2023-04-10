<<<<<<< HEAD
package ca.sheridancollege.project;

/**
 * @authors zohair, henry, manh, smith
 */

/**
 * The PrintInfo class is responsible for printing the opening message 
 * of the War Card Game and various messages during the gameplay.
 */
public class PrintInfo {

        // Displays the opening message of the game, explaining the rules and how to begin.
        public void printOpeningMessage() {
            System.out.println("Welcome to War - the card game!\n" +
                    "The game is between you and the computer. Each player is dealt 26 cards, and each round is played by playing one card each.\n" +
                    "The player with the higher card takes both cards and adds them to the bottom of their deck.\n" +
                    "If both cards are of the same rank, a war is initiated. Players add three cards face down and one card face up. The higher rank wins all the cards.\n" +
                    "The game ends when one player has all 52 cards or the game reaches 26 rounds.\n");
            System.out.println("Please enter your name and press enter to begin.");
        }

        /**
         * Displays a message indicating the start of the game
         */
        public void printStartGameMessage(Player player) {
            System.out.printf("Let's play War, %s!\n", player.getName());
        }
        
        /**
         * Displays the header for the current round, showing
         * each player's name and the number of cards in their hand.
         */
        public void printRoundHeader(Player playerOne, Player playerTwo) {
            String header = "# Cards in Hand";
            String winner = "Round Winner";
            System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", playerOne.getName(), header, playerTwo.getName(), header, winner);
        }
        
        /**
         * Announces the winner of the current round, 
         * showing the card played by each player and the winner's name.
         */        
        public void printRoundWinner(Player player1, Card card1, Player player2, Card card2, String winner) {
            System.out.printf("%-20s %-20d %-20s %-20d %s wins the round.\n", card1.toString(), player1.getHand().handSize(), card2.toString(), player2.getHand().handSize(), winner);
        }
        
        // Announces that a war has been initiated due to a tie in the current round.
        public void printWarRound() {
            System.out.println("WAR! There was a tie, and War was initiated.");
        }
        
        // Announces the winner of the game, showing the name of the winning player.
        public void printGameWinner(Player player) {
            System.out.printf("Congratulations, %s, you win the game!\n", player.getName());
        }
        
        // Announces that the game has ended in a draw.
        public void printDraw() {
            System.out.printf("Sorry, the game ended in a draw.\n");
        }

}
=======
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

}//end class
>>>>>>> parent of bc6ba18 (Final draft except testing (War Game).)
