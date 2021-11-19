package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    // fields for the class
    private ArrayList<Card> cardsInHand;
    private String name;


    //constructor for the class
    public Player( String name) {
        this.name = name;
        this.cardsInHand = new ArrayList<>();
    }

    public void setCardsInHand(Card cardsInHand) {
        this.cardsInHand.add(cardsInHand);
    }

    public ArrayList<Card> getCardsInHand() {
        return cardsInHand;
    }

    //Create player object
//    public Player(){
//
//    }

    // Create a goBust method
    public void goBust(){
//        if (value > 21){
//            System.out.println("you have gone bust");
//        }
    }

    // Create a win method
    public void win(){
//       if(values >= 21){
//           System.out.println("You have won");
//       }
    }

    // Create a hit method
    public void hit(){

    }

    // Create a  method
    public void stick(){

    }

    // Create a getter and setter method for the name field
    public String getName() {
        return name;
    }


    // Create a toString method for the class

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
