import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    public Player player1;
    public Player player2;
    public Card card1;
    public Card card2;


    @Before
    public void before(){
        player1 = new Player("Ian");
        player2 = new Player("Amanda");
        card1 = new Card(SuitType.CLUBS, RankType.ACE);
        card2 = new Card(SuitType.HEARTS, RankType.FOUR);

        player1.addCard(card1);
        player1.addCard(card2);
        player2.addCard(card1);
    }

    @Test
    public void canGetName(){
        assertEquals("Ian", player1.getName());
        assertEquals("Amanda", player2.getName());
    }

    @Test
    public void playerHasAHand(){
        assertEquals(2, player1.countHand());
        assertEquals(1, player2.countHand());
    }

}
