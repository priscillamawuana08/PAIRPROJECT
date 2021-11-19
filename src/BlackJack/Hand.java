package BlackJack;

import java.util.ArrayList;
        import java.util.List;

public class Hand {
    private final List<Card> cards;

    public Hand() {
        cards  = new ArrayList<>();
    }


    public void addCard(Card addCard){
        this.cards.add(addCard);
    }

    public int cardTotal(){
        int total = 0;
        for (Card c:cards) {
            total += c.getCardValue().getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                '}';
    }
}