import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int cardCount(){
        return this.cards.size();
    }

    public void addToDeck(){
        for(SuitType eachSuit : SuitType.values()) {
            for (RankType eachRank : RankType.values()) {
                Card card = new Card(eachSuit, eachRank);
                cards.add(card);
            }
        }
    }

    public Card getCard(){
        return this.cards.get(0);
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    public void dealCard(Player player){
        Card dealtCard = cards.get(0);
        cards.remove(dealtCard);
        player.addCard(dealtCard);
    }
}
