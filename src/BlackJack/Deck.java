package BlackJack;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
//import java.util.Random;

public class Deck {
    private final Stack<Card> cards;

    public Deck() {
        this.cards = new Stack<Card>();
    }

    public Stack<Card> getCards() {
        return cards;
    }

    public void createDeck() {
        Arrays.stream(Suit.values())
                .forEach(suit -> Arrays.stream(Value.values())
                        .forEach(value -> this.cards.add(new Card(suit, value))));

    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealACard() {
        return cards.pop();
    }
}







