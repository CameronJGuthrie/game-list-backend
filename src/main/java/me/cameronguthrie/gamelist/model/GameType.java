package me.cameronguthrie.gamelist.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.cameronguthrie.gamelist.util.EnumSerializer;

@Getter
@JsonSerialize(using = EnumSerializer.class)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum GameType {
    PLATFORM_2D("2D Platformer"),
    PLATFORM_3D("3D Platformer"),
    FPS("First Person Shooter"),
    TPS("Third Person Shooter"),
    RTS("Real Time Strategy"),
    MOBA("MOBA"),
    SIM("Simulation"),
    SPORTS("Sports"),
    ACTION_ADVENTURE("Action Adventure"),
    SANDBOX("Sandbox"),
    MMORPG("MMORPG");

    private final String description;

    public String getName() { return name(); }
}
