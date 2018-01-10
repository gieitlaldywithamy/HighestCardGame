import sun.tools.tree.ThisExpression;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {


    private ArrayList<Card> deck;


    Deck() {
        this.deck = new ArrayList<>();
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();

        for (int i = 0; i < suits.length; i++) {

            for (int j = 0; j < ranks.length; j++) {
                Card card = new Card(ranks[j], suits[i]);
                this.deck.add(card);
            }

        }


    }


    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public Card getCard() {
        return deck.remove(0);
    }



}
