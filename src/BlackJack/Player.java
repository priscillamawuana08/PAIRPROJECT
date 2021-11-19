package BlackJack;

import java.util.List;

public class Player {
    // fields for the class
    private String name;
    private int bet;

    //constructor for the class
    public Player( String name, int bank, int bet) {
        this.name = name;

    }

    //Create player object
    public Player(){

    }

    // Create a goBust method
    public void goBust(){
    }

    // Create a win method
    public void win(){
    }

    // Create a loss method
    public void loss(){

    }

    // Create a push method
    public void push(){
    }

    // Create a getter and setter method for the name field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
