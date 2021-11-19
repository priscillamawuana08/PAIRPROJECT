package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BlackjackMain {
    // Accepting  number of players and their names
    private Scanner numberOfPlayers = new Scanner(System.in);
    private int users;
    private Player[] player;


    public void startGame(){
        System.out.println("------Welcome to BlackJack------");

        String names;
        do{
            System.out.println("How many players for the game (3-6)");
            users = numberOfPlayers.nextInt();
        }while(users > 6 || users < 3);
        player = new Player[users];
        Deck deck = new Deck();

        for(int i = 0; i < users; i++){
            System.out.println("Enter player " +(i + 1) + "'s name");
            names = numberOfPlayers.next();
            player[i] = new Player();
            player[i].setName(names);
        }

    }



    public static void main(String[] args) {

        Deck playDeck = new Deck();
        playDeck.createDeck();
        playDeck.shuffle();


//        System.out.println(playDeck);





    }
}
