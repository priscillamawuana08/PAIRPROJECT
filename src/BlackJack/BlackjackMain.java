package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BlackjackMain {
    // Accepting  number of players and their names
    private Scanner userInput = new Scanner(System.in);
    private int users;
    private Player[] player;



    //A start method for input

    public void startGame(){
        System.out.println("------Welcome to BlackJack------");
        // A do while to create number of players
        String names;
        do{
            System.out.println("How many players for the game (3-6)");
            users = userInput.nextInt();
        }while(users > 6 || users < 3);
        player = new Player[users];
        Deck deck = new Deck();

        // A for loop to ask the name of the players and assign it to players
        for(int i = 0; i < users; i++){
            System.out.println("Enter player " +(i + 1) + "'s name");
            names = userInput.next();
            player[i] = new Player();
            player[i].setName(names);
        }

    }



    public static void main(String[] args) {
        // Calling the methods
        BlackjackMain myGame = new BlackjackMain();
        Deck playDeck = new Deck();
        playDeck.createDeck();
        playDeck.shuffle();
        myGame.startGame();




        System.out.println(playDeck);





    }
}
