package ca.sheridancollege.project;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import ca.sheridancollege.project.Suit;
import ca.sheridancollege.project.Rank;



public class HandTest {

    private Hand hand;

    @Before
    public void setUp() {
        hand = new Hand();
    }

    @Test
    public void testAddCardToTop_Good() {
        Card card = new Card(Rank.ACE, Suit.HEARTS);
        hand.addCardToTop(card);
        assertEquals(hand.handSize(), 1);
        assertEquals(hand.removeCardFromTop(), card);
    }

    @Test(expected = NullPointerException.class)
    public void testAddCardToTop_Bad() {
        Card card = null;
        hand.addCardToTop(card);
    }

    @Test
    public void testAddCardToTop_Boundary() {
        Card card = new Card(Rank.ACE, Suit.HEARTS);
        for (int i = 0; i < 52; i++) {
            hand.addCardToTop(card);
        }
        assertEquals(hand.handSize(), 52);
    }

    @Test
    public void testRemoveCardFromBottom_Good() {
        Card card = new Card(Rank.ACE, Suit.HEARTS);
        hand.addCardToTop(card);
        assertEquals(hand.handSize(), 1);
        assertEquals(hand.removeCardFromBottom(), card);
        assertEquals(hand.handSize(), 0);
    }

    @Test
    public void testRemoveCardFromBottom_Bad() {
        assertNull(hand.removeCardFromBottom());
    }

    @Test
    public void testRemoveCardFromBottom_Boundary() {
        Card card = new Card(Rank.ACE, Suit.HEARTS);
        for (int i = 0; i < 52; i++) {
            hand.addCardToTop(card);
        }
        assertEquals(hand.handSize(), 52);
        for (int i = 0; i < 52; i++) {
            hand.removeCardFromBottom();
        }
        assertEquals(hand.handSize(), 0);
    }

    @Test
    public void testTake_Good() {
        Card card2 = new Card(Rank.ACE, Suit.HEARTS);
        Card card1 = new Card(Rank.ACE, Suit.HEARTS);

        hand.addCardToTop(card1);
        hand.addCardToTop(card2);
        List<Card> takenCards = hand.take(2);
        assertTrue(takenCards.contains(card1));
        assertTrue(takenCards.contains(card2));
        assertEquals(hand.handSize(), 0);
    }

    @Test
    public void testTake_Bad() {
        Card card = new Card(Rank.ACE, Suit.HEARTS);
        hand.addCardToTop(card);
        assertNull(hand.take(2));
    }

    @Test
    public void testTake_Boundary() {
        List<Card> emptyList = new ArrayList<>();
        assertEquals(hand.take(0), emptyList);
    }
}
