package me.cameronguthrie.gamelist.controller;

import lombok.RequiredArgsConstructor;
import me.cameronguthrie.gamelist.model.GameType;
import me.cameronguthrie.gamelist.dto.GameDTO;
import me.cameronguthrie.gamelist.dto.GameUpdateDTO;
import me.cameronguthrie.gamelist.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class GamesController {
    private final GameService service;

    @GetMapping("/games")
    public List<GameDTO> getGames() {
        return service.getGames();
    }

    @GetMapping("/games/{id}")
    public GameDTO getGame(@PathVariable int id) {
        return service.getGame(id);
    }

    @PostMapping("/games")
    public void addGame(@RequestBody GameUpdateDTO inputDTO) {
        service.addGame(inputDTO);
    }

    @PutMapping("/games/{id}")
    public void updateGame(@PathVariable int id, @RequestBody GameUpdateDTO inputDTO) {
        service.updateGame(id, inputDTO);
    }

    @DeleteMapping("/games/{id}")
    public void deleteGame(@PathVariable int id) {
        service.deleteGame(id);
    }

    @GetMapping("/game-types")
    public GameType[] getGameTypes() {
        return GameType.values();
    }
}
