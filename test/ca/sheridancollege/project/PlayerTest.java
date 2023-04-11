/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author henry
 */
public class PlayerTest {

    public PlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void teardown() {
    }

    @Test
    public void testGetHandGood() {
        // Good case: hand is not null
        Hand goodHand = new Hand();
        Player player = new Player("Henry");
        player.setHand(goodHand);
        Hand result = player.getHand();
        assertNotNull(result);
        assertEquals(goodHand, result);

        // Bad case: hand is null
        // Boundary case: hand is empty
    }

    @Test
    public void testGetHandBad() {
        // Bad case: hand is null
        Player player2 = new Player("Henry");
        player2.setHand(null);
        Hand result2 = player2.getHand();
        assertNull(result2);
    }

    @Test
    public void testGetHandBoundary() {
        // Boundary case: hand is empty
        Hand emptyHand = new Hand();
        Player player3 = new Player("Henry");
        player3.setHand(emptyHand);
        Hand result3 = player3.getHand();
        assertNotNull(result3);
        assertEquals(emptyHand, result3);
    }

}
