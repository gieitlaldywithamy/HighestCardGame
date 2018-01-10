import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Game {

    Dealer dealer;
    ArrayList<Player> players;


    Game(Dealer dealer, ArrayList<Player> players){
        this.dealer = dealer;
        this.players = players;
    }

    ArrayList<Player> getPlayers () {
        return this.players;
    }
    public HashMap<Integer, ArrayList<Player>> scorePlayer(){
        HashMap<Integer, ArrayList<Player>> scorePlayer = new HashMap<>();
        for(Player player: this.players) {
            int playerValue = player.handValue();
            scorePlayer.putIfAbsent(playerValue, new ArrayList<Player>());
            scorePlayer.get(playerValue).add(player);
//            ArrayList<Player> players = new ArrayList<>();
//            genreCount.put(book.getGenre(), genreCount.getOrDefault(book.getGenre(), 1) + 1);
//            scorePlayer.put(playerValue, scorePlayer.getOrDefault(playerValue, player) + player);
        }
        return scorePlayer;
    }

    public Player getWinner(){
        HashMap<Integer, ArrayList<Player>> scoredPlayers = scorePlayer();

        Integer winningPlayersId = Collections.max(scoredPlayers.keySet());

        while (scoredPlayers.get(winningPlayersId).size() > 1){
            dealer.deal(getPlayers());
        }
            return scoredPlayers.get(winningPlayersId).get(0);
        }
    }

//    Player checkWinner(){
//        Player currentWinner = getPlayers().get(0);
//        boolean noWinner = true;
//        while (noWinner) {
//            for (Player player: getPlayers()){
//                if (currentWinner.handValue() == player.handValue() && (!player.equals(currentWinner))) {
//                    noWinner = false;
//                } else if (player.handValue() > currentWinner.handValue()) {
//                    currentWinner = player;
//                }
//            }
//        }
//
//            for (Playable player : players) {
//                if ((currentWinner.getScore() == player.getScore()) && (player != currentWinner)) {
//                    return "IT'S A DRAW - TRY AGAIN";
//
//                } else if (player.getScore() > currentWinner.getScore()) {
//                    currentWinner = player;
//                }
//            }
//            HighestCardPlayer winner = (HighestCardPlayer) currentWinner;
//            return winner.getName().toUpperCase() + " WINS";
//        }


//        boolean noWinner = true;
//        Player winner = null;
//        while(noWinner){
//
//            if (player1.handValue() > player2.handValue()) {
//
//                winner = player1;
//                noWinner = false;
//            } else if (player1.handValue() < player2.handValue()){
//
//                winner = player2;
//                noWinner = false;
//            } else {
//                dealer.deal(player1);
//                dealer.deal(player2);//logically bad change this!
//            }
//        }
//        return winner;
   // }

