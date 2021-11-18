package BlackJack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Random;

public class Deck {
    private final ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void createDeck() {
//        for (Suit cardSuit : Suit.values()) {
//            for (Value cardValue : Value.values()) {
//                this.cards.add(new Card(cardSuit, cardValue));
//            }
//        }
        Arrays.stream(Suit.values())
                .forEach(suit -> Arrays.stream(Value.values())
                        .forEach(value -> this.cards.add(new Card(suit, value))));

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
            StringBuilder cardListOutput = new StringBuilder();
            int i = 0;
            for (Card aCard : Collections.unmodifiableList(this.cards)) {
                cardListOutput.append("\n").append(i).append("-").append(aCard.toString());
                i++;
            }
                return cardListOutput.toString();
        }

        public void removeCard(int i){
            this.cards.remove(i);
        }

        public Card getCard(int i){
            return this.cards.get(i);
        }

        public void addCard(Card addCard){
            this.cards.add(addCard);
        }

        public void draw(Deck takeFrom){
            this.cards.add(takeFrom.getCard(0));
        }
    }

