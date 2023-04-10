package ca.sheridancollege.project;

/**
 * @authors zohair, henry, manh, smith
 */

import java.util.List;
import java.util.Scanner;

/**
 * PlayGame class models the War card game between two players (human and CPU)
 * @author user
 */
public class Game {

    /**
     * Represents the deck of cards in the game.
     */
    private Deck deck;

    /**
     * Represents the object from the PrintInfo class  
     * it's responsible for printing the messages during the game.
     */
    private static PrintInfo printInfoObj = new PrintInfo();

    /**
     * Represents the human player in the game.
     */
    private Player humanPlayer;

    /**
     * Represents the CPU player in the game.
     */
    private Player cpuPlayer;

    /**
     * Starts a new game by setting up the deck, players, and dealing the cards.
     */
    public void startGame() {
        //print the opening message
        printInfoObj.printOpeningMessage();

        // Get the human player's name from the user
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        this.humanPlayer = new Player(name);
        this.cpuPlayer = new Player("CPU");

        //Opening Game Message
        printInfoObj.printStartGameMessage(humanPlayer);

        //Create and shuffle the deck
        deck = new Deck();
        deck.shuffle();

        //Create and set hands for each player
        humanPlayer.setHand(new Hand());
        cpuPlayer.setHand(new Hand());

        // Deal the cards to each player
        dealCards(humanPlayer.getHand());
        dealCards(cpuPlayer.getHand());

        printInfoObj.printRoundHeader(humanPlayer, cpuPlayer);

        // start game loop and show result
        int maxRounds = 27;
        Player winner = null;
        while (battle(humanPlayer, cpuPlayer, null)) {
            maxRounds--;

            // check which player has won
            if (humanPlayer.getHand().handSize() == 0) {

                winner = cpuPlayer;
                break;
            } else if (cpuPlayer.getHand().handSize() == 0) {

                winner = humanPlayer;
                break;
            }
            
             // Check if the maximum number of rounds has been played
            if (maxRounds < 0) {
                break;
            }
        }
        
        //Print the result of the game
        if (winner != null) {

        } else if (humanPlayer.getHand().handSize() > cpuPlayer.getHand().handSize()) {
            winner = humanPlayer;
        } else if (cpuPlayer.getHand().handSize() > humanPlayer.getHand().handSize()) {
            winner = cpuPlayer;
        } else {

            // Print the draw
            printInfoObj.printDraw();
            return;
        }
        printInfoObj.printGameWinner(winner);
    }

    // Deals 26 cards to the specified hand from the deck.
    public void dealCards(Hand hand) {
        for (int i = 0; i < 26; i++) {
            hand.addCardToTop(deck.drawCard());
        }
    }

    // This method represents a fight between player1 and CPU. If the fight
    // leads to a WAR, 3 cards are placed by each player 
    // in the front and the the fourth is compared. */
    public boolean battle(Player playerOne, Player playerTwo, Hand pot) {

        // Players reveal their top card and draw a new card from the top of their deck
        // Store the cards that are in play in an array called "pot". 
        // Pot is prize winner collects from the center of the table.
        Card playerOneFaceUp = playerOne.getHand().removeCardFromTop();
        if (playerOneFaceUp == null) {
            return false;
        }

        Card playerTwoFaceUp = playerTwo.getHand().removeCardFromTop();
        if (playerTwoFaceUp == null) {
            return false;
        }

        // In case of a tie, each player adds three cards to the pot and a fourth card is evaluated
        if (pot == null) {
            pot = new Hand();
        }
        pot.addCardToTop(playerOneFaceUp);
        pot.addCardToTop(playerTwoFaceUp);

        int result = playerOneFaceUp.compareTo(playerTwoFaceUp);
        switch (result) {
            case 0:
                // War has been declared
                printInfoObj.printWarRound();

                // Each player adds three cards to the prize hand
                List<Card> warPlayerOnePot = playerOne.getHand().take(3);
                if (warPlayerOnePot == null) {
                    return false;
                }
                pot.addCardsToTop(warPlayerOnePot);

                List<Card> warPlayerTwoPot = playerTwo.getHand().take(3);
                if (warPlayerTwoPot == null) {
                    return false;
                }
                pot.addCardsToTop(warPlayerTwoPot);

                return battle(playerOne, playerTwo, pot);
            case 1:
                // Player 1 wins the round and takes all the cards on the table
                playerOne.getHand().mergeHand(pot);
                printInfoObj.printRoundWinner(playerOne, playerOneFaceUp, playerTwo, playerTwoFaceUp, playerOne.getName());
                break;
            case -1:
                // Player 2 wins the round and takes all the cards on the table
                playerTwo.getHand().mergeHand(pot);
                printInfoObj.printRoundWinner(playerOne, playerOneFaceUp, playerTwo, playerTwoFaceUp, playerTwo.getName());
                break;
        }

        return true;
    }
}





