import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
    card = new Card(Rank.ACE, Suit.CLUBS);
    }

    @Test
    public void getCardValue() {
        assertEquals(1, card.getRank().getValue());
    }

    @Test
    public void getCardSuit() {
        assertEquals(Suit.CLUBS, card.getSuit());
    }
}
