package BlackJack;

public class BlackjackMain {
    public static void main(String[] args) {
        System.out.println("Welcome to BlackJack");

        Deck playDeck = new Deck();
        playDeck.createDeck();

        System.out.println(playDeck);
    }
}
