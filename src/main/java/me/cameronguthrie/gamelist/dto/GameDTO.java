package me.cameronguthrie.gamelist.dto;

import lombok.Getter;
import lombok.Setter;
import me.cameronguthrie.gamelist.model.GameType;

@Getter
@Setter
public class GameDTO {
    int id;
    String title;
    String description;
    GameType type;
    String releaseYear;
    String websiteLink;
}
