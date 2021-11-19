package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BlackjackMain {
    // Accepting  number of players and their names
    private Scanner numberOfPlayers = new Scanner(System.in);


    public void startGame(){
        System.out.println("------Welcome to BlackJack------");

        String names;
        int users;

        do{
            System.out.println("How many players for the game (3-6)");
            users = numberOfPlayers.nextInt();
        }while(users > 6 || users < 3);
        Player[] player = new Player[users];
        Deck deck = new Deck();

        for(int i = 0; i < users; i++){
            System.out.println("Enter player " +(i + 1) + "'s name");
            names = numberOfPlayers.next();
//            player[i] = new Player();
//            player[i].setName(names);

        }



    }



    public static void main(String[] args) {

//        BlackjackMain myGame = new BlackjackMain();
        Deck playDeck = new Deck();
        Player player = new Player("Mike");
        playDeck.createDeck();

        System.out.println(playDeck.getCards());

        playDeck.shuffle();

        System.out.println("=======================================================================================");

        System.out.println(playDeck.getCards());
//        myGame.startGame();

        player.setCardsInHand(playDeck.dealACard());

        System.out.println(player.getCardsInHand());


//        System.out.println(playDeck);





    }
}
