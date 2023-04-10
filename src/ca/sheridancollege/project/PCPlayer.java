package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Random;

public class PCPlayer extends Player {

    private ArrayList<Card> hand; // the player's hand of cards

    public PCPlayer(String userName){
        super(userName);
        hand = new ArrayList<Card>();
    }

    // add a card to the player's hand
    public void addCard(Card drawnCard) {
        hand.add(drawnCard);
    }

    // remove a card from the player's hand
    public void removeCard(Card card) {
        hand.remove(card);
    }

    // choose a card to play from the player's hand
    public Card chooseCard() {
        Random random = new Random();
        int index = random.nextInt(hand.size());
        Card chosenCard = hand.get(index);
        removeCard(chosenCard);
        return chosenCard;
    }

    // play a card from the player's hand
    public void play() {
        Card chosenCard = chooseCard();
        System.out.println(getName() + " plays " + chosenCard.toString());
        // additional logic for playing the card
    }

}
