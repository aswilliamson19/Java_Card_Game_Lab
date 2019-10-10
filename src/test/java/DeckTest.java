import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    public Deck deck;
    public Card card1;
    public Card card2;

    @Before
    public void before(){
        deck =  new Deck();
        card1 = new Card(SuitType.CLUBS, RankType.ACE);
        card2 = new Card(SuitType.HEARTS, RankType.FOUR);
    }

    @Test
    public void canCountCardsInDeck(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canPopulateDeck(){
        deck.addToDeck();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canShuffleDeck(){
        deck.addToDeck();
        Card unshuffledCard = deck.getCard();
        deck.shuffleCards();
        Card shuffledCard = deck.getCard();
        Boolean compareCards = (unshuffledCard  == shuffledCard);
        assertEquals(false, compareCards);
    }

}
