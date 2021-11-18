package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;

    }


    public void createDeck() {
        for (Suit cardSuit : Suit.values()) {
            for (Value cardValue : Value.values()) {
                this.cards.add(new Card(cardSuit, cardValue));
            }
        }
    }



    public void shuffle(){
        Collections.shuffle(getCards());
//        ArrayList<Card> temporaryDeck = new ArrayList<Card>();
//        Random random = new Random();
//        int randomCardIndex = 0;
//        int originalSize = this.cards.size();
//        for (int i = 0; i < originalSize; i++){
//            randomCardIndex = random.nextInt((this.cards.size() - 1) + 1);
//            temporaryDeck.add(this.cards.get(randomCardIndex));
//            this.cards.remove(randomCardIndex);
//        }
//        this.cards = temporaryDeck;
   }

        public String toString(){
            String cardListOutput = "";
            int i = 0;
            for (Card aCard : this.cards) {
                cardListOutput += "\n" + i + "-" + aCard.toString();
                i++;
            }
            return cardListOutput;
        }
    }

