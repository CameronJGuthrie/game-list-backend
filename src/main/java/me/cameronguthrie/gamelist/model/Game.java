package me.cameronguthrie.gamelist.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private GameType type;

    private String releaseYear;

    private String websiteLink;
}
