package BlackJack;

public class Hand {
    private int twoCards ;

    public Hand(int twoCards) {
        this.twoCards = twoCards;
    }
// A dealt method to give each player two cards for a start
    public void dealt(){
    twoCards = 2;
}

    public int getTwoCards() {
        return twoCards;
    }
}
