package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

// Write your code here.

import com.example.player.PlayerService;

@RestController
public class PlayerController {
    PlayerService playerService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerId(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerId(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatedPlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerService.updatedPlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId) {
        playerService.deletePlayer(playerId);
    }

}
