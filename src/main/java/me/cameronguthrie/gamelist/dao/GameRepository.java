package me.cameronguthrie.gamelist.dao;

import me.cameronguthrie.gamelist.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
}
