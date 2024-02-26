// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player getPlayerId(int playerId);

    Player addPlayer(Player player);

    Player updatedPlayer(int playerId, Player player);

    void deletePlayer(int playerId);
}
