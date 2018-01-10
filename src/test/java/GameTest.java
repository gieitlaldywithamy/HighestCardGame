import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    ArrayList<Player> players;

    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("Giuseppe");
        player2 = new Player("Amy");
         players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        deck = new Deck();
        dealer = new Dealer(deck);
        game = new Game(dealer, players);

    }

    @Test
    public void checkWinner(){
        dealer.deal(players);

        System.out.println(game.scorePlayer());
        System.out.println(game.getWinner());
//        game.checkWinner();
    }
}
