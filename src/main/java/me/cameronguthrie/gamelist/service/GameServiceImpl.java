package me.cameronguthrie.gamelist.service;

import lombok.RequiredArgsConstructor;
import me.cameronguthrie.gamelist.dao.GameRepository;
import me.cameronguthrie.gamelist.dto.GameDTO;
import me.cameronguthrie.gamelist.dto.GameMapper;
import me.cameronguthrie.gamelist.dto.GameUpdateDTO;
import me.cameronguthrie.gamelist.model.Game;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {
    private final GameRepository repository;
    private final GameMapper mapper;

    public List<GameDTO> getGames() {
        return mapper.map(repository.findAll());
    }

    public GameDTO getGame(int id) {
        Optional<Game> optional = repository.findById(id);
        if (!optional.isPresent()) {
            throw404();
        }
        return mapper.map(optional.get());
    }

    public void addGame(GameUpdateDTO inputDTO) {
        Game game = mapper.map(inputDTO);
        repository.saveAndFlush(game);
    }

    public void updateGame(int id, GameUpdateDTO inputDTO) {
        Optional<Game> optional = repository.findById(id);
        if (!optional.isPresent()) {
            throw404();
        }
        Game game = optional.get();
        mapper.merge(game, inputDTO);
    }

    public void deleteGame(int id) {
        Optional<Game> optional = repository.findById(id);
        if (!optional.isPresent()) {
            throw404();
        }
        repository.deleteById(id);
    }

    private void throw404() {
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "game not found"
        );
    }
}
