import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<Card> cards;

    Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void receiveCard(Card card) {
        this.cards.add(card);
    }

    public int cardCount() {
        return this.cards.size();
    }

    public int handValue(){
        return cards.get(0).rank.getValue();
    }
}