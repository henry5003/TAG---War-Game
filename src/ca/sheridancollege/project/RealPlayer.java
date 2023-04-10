package ca.sheridancollege.project;

public class RealPlayer extends Player {

    private GroupOfCards hand; // the cards in the player's hand

    public GroupOfCards getHand() {
        return hand;
    }
 // 
    public void setHand(GroupOfCards hand) {
        this.hand = hand;
    }

    public RealPlayer(String userName) {
        super(userName);
        this.hand = new GroupOfCards();
    }

    public void drawCard(GroupOfCards deck) {
        Card drawnCard = deck.removeCard();
        hand.addCard(drawnCard);
        System.out.println(getName() + " draws " + drawnCard);
    }

    public void playCard(Card card) {
        hand.removeCard(card);
        System.out.println(getName() + " plays " + card);
    }

    @Override
    public void play() {
        // implementation for playing the game
    }
}
