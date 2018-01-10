import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    ArrayList<Player> players;
    Player player3;
    Player player1;
    Player player2;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player3 = new Player("Eric");
        player1 = new Player("Giuseppe");
        player2 = new Player("Amy");
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
    }

    @Test
    public void dealerDealsACard(){
//        assertTrue(dealer.deal() instanceof Card);
        dealer.deal(players);
        int cardCount = dealer.getNumberOfCards();
        assertEquals(46, cardCount);
    }

}
