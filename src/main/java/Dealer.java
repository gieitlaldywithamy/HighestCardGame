
import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private Deck deck;

    Dealer(Deck deck){
        this.deck = deck;
    }

    public void deal(ArrayList<Player> players) {
        shuffle();
        int rounds = 2;
        for (int i = 0; i <rounds; i++){
            for (Player player: players){
                Card card = deck.getCard();
                player.receiveCard(card);
            }
        }



    }

    public void shuffle() {
        ArrayList<Card> cards = deck.getDeck();
        Collections.shuffle(cards);
    }

    public Deck getDeck() {
        return this.deck;
    }

    public int getNumberOfCards() {
        return this.deck.getDeck().size();
    }
}
