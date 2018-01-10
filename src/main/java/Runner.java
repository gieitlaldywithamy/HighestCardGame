import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);
        ArrayList<Player> players = new ArrayList<>();
        Game game = null;
        boolean new_player = true;
        Scanner scanner = new Scanner(System.in);
        while (new_player) {

            System.out.println("Enter new player name or type play");
            String input = scanner.nextLine();
            if (input.equals("play")){
                new_player = false;
            } else {
                Player newPlayer = new Player(input);
                System.out.println(newPlayer);
                players.add(newPlayer);
            }
        }
        game = new Game (dealer, players);
        dealer.deal(players);
        if (!(game.equals(null))){
            System.out.println(game.getWinner().getName() + "WINS!");
        }


    }
}
