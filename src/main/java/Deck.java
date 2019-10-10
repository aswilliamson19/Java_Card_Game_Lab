import java.util.ArrayList;

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
}
