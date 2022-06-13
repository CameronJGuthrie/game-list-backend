package me.cameronguthrie.gamelist.dto;

import me.cameronguthrie.gamelist.model.Game;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel="spring")
public interface GameMapper {

    // Get Mapping
    @Mapping(source = "title", target = "title")
    @Mapping(source = "type", target = "type")
    @Mapping(source = "releaseYear", target = "releaseYear")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "websiteLink", target = "websiteLink")
    GameDTO map(Game game);

    // Create Mapping
    @Mapping(source = "title", target = "title")
    @Mapping(source = "type", target = "type")
    @Mapping(source = "releaseYear", target = "releaseYear")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "websiteLink", target = "websiteLink")
    Game map(GameUpdateDTO inputDTO);

    // Update Mapping
    @Mapping(source = "title", target = "title")
    @Mapping(source = "type", target = "type")
    @Mapping(source = "releaseYear", target = "releaseYear")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "websiteLink", target = "websiteLink")
    Game merge(@MappingTarget Game game, GameUpdateDTO inputDTO);

    List<GameDTO> map(Iterable<Game> sources);
}
