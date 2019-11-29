package MafiaGame;

import java.util.ArrayList;

public class Game {
    private God god;
    private ArrayList<Player> players = new ArrayList<>();

    public Game(){

    }

    public void addPlayer(Player player){
        this.players.add(player);
    }
}
