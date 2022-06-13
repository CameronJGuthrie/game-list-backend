package me.cameronguthrie.gamelist.service;

import me.cameronguthrie.gamelist.dto.GameDTO;
import me.cameronguthrie.gamelist.dto.GameUpdateDTO;

import java.util.List;

public interface GameService {
    List<GameDTO> getGames();
    GameDTO getGame(int id);
    void addGame(GameUpdateDTO inputDTO);
    void updateGame(int id, GameUpdateDTO inputDTO);
    void deleteGame(int id);
}
