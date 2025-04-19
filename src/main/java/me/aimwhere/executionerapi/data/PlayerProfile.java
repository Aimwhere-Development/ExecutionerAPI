package me.aimwhere.executionerapi.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;

import java.util.UUID;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 1
 */
@AllArgsConstructor
@Getter
public class PlayerProfile {
    //represent player as UUID for easier access
    UUID player;

    String playerName;
    String clientName;
    String version;

    //current tick goes up every tick starting from player's join
    long currentTick;
    long ping;

    //location when profile was created, todo: make this update when player moves
    Location location;
}
