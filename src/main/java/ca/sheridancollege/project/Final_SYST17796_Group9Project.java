package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The main class to initiate the "War" card game.
 * 
 * @author imgur
 */
public class Final_SYST17796_Group9Project {

    /**
     * The main method that starts the game.
     * 
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // Create two players for the War game
        WarPlayer player1 = new WarPlayer("John");
        WarPlayer player2 = new WarPlayer("Harry");

        // this contains the list of the players.
        ArrayList<Player> players = new ArrayList<>();
    players.add(player1);
        players.add(player2);

        // You can create and start the new game .
        WarGame warGame = new WarGame("War Game", players);
        warGame.play();
    }
}