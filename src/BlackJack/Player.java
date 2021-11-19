package BlackJack;

import java.util.List;

public class Player {
    // fields for the class
    private String name;
    private int bank;
    private int bet;

    //constructor for the class
    public Player( String name, int bank, int bet) {
        this.name = name;
        this.bank =bank;
        this.bet = bet;
    }

    //Create player object
    public Player(){
       bank = 100;
    }

    // Create a goBust method
    public void goBust(){
    bank -= bet;
    bet = 0;
    }

    // Create a win method
    public void win(){
        bank += bet;
        bet = 0;
    }

    // Create a loss method
    public void loss(){
        bank -= bet;
        bet = 0;
    }

    // Create a push method
    public void push(){
        bet = 0;
    }

    // Create a getter and setter method for the name field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Create a getter and setter method for the bank field
    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    // Create a getter method for the bet field
    public int getBet() {
        return bet;
    }

    // Create a toString method for the class
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", bank=" + bank +
                ", bet=" + bet +
                '}';
    }
}
