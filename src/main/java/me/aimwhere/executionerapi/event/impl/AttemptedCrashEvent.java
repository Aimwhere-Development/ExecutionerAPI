package me.aimwhere.executionerapi.event.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.aimwhere.executionerapi.data.PlayerProfile;
import me.aimwhere.executionerapi.event.Event;
import org.bukkit.Location;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 2
 */
@Getter
@AllArgsConstructor
public class AttemptedCrashEvent extends Event {
    //player who tried crashing
    private final PlayerProfile player;
    //reason for crash (transaction, position, etc)
    private final String reason;
    //location from which the player tried crashing
    private final Location location;
}
