package ca.sheridancollege.project;

import java.util.Scanner;

public class WarGame extends Game {

    private GroupOfCards deck;

    public WarGame(String name, Player firstPlayer) {
        super(name, firstPlayer);
        initialize();
    }

    @Override
    public void initialize() {
        deck = new GroupOfCards();
        deck.generateCards();
        deck.shuffle();

        // Create players
        RealPlayer player1 = new RealPlayer("Player 1");
        RealPlayer player2 = new RealPlayer("Player 2");

        // Add players to the game
        getPlayers().add(player1);
        getPlayers().add(player2);

        // Deal the cards evenly to the players
        while (!deck.getCards().isEmpty()) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }
    }

    @Override
    public void play() {
        RealPlayer player1 = (RealPlayer) getPlayers().get(0);
        RealPlayer player2 = (RealPlayer) getPlayers().get(1);

        Scanner scanner = new Scanner(System.in);

        while (!player1.getHand().getCards().isEmpty() && !player2.getHand().getCards().isEmpty()) {
            System.out.println("Press enter to play a card...");
            scanner.nextLine();

            Card card1 = player1.getHand().removeCard();
            Card card2 = player2.getHand().removeCard();

            System.out.println(player1.getName() + " plays " + card1 + ", " + player2.getName() + " plays " + card2);
            try {
                Thread.sleep(10000); // Sleep for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (card1.compareTo(card2) > 0) {
                player1.getHand().addCard(card1);
                player1.getHand().addCard(card2);
            } else if (card1.compareTo(card2) < 0) {
                player2.getHand().addCard(card1);
                player2.getHand().addCard(card2);
            } else {
                // War
                System.out.println("War!");
                // TODO: Implement war logic
            }

            System.out.println(player1.getName() + " has " + player1.getHand().getCards().size() + " cards in hand.");
        }

        declareWinner();
    }

    @Override
    public void declareWinner() {
        RealPlayer player1 = (RealPlayer) getPlayers().get(0);
        RealPlayer player2 = (RealPlayer) getPlayers().get(1);

        if (player1.getHand().getCards().size() > player2.getHand().getCards().size()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getHand().getCards().size() < player2.getHand().getCards().size()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    public static void main(String[] args) {
        WarGame warGame = new WarGame("War", new RealPlayer("Player 1"));
        warGame.play();
    }
}
