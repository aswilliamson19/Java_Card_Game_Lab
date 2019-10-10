import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    public Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.FOUR);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.FOUR, card.getRank());
    }

    @Test
    public void canGetValue(){
        assertEquals(4, card.getValueFromEnum());
    }


}
