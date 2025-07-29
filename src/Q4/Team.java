package Q4;

import java.util.ArrayList;
import java.util.List;

class Team {
    String teamName;
    List<Player> playerList;


    public Team(String teamName) {
        this.teamName = teamName;
        playerList = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void printPlayerList() {
        for (Player player : playerList) {
            System.out.println(player.name);
        }
    }
}
