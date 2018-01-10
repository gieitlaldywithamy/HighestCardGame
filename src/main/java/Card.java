public class Card {

    Rank rank;
    Suit suit;

    Card (Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }


    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
