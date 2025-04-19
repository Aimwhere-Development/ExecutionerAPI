package me.aimwhere.executionerapi.event.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.aimwhere.executionerapi.data.PlayerProfile;
import me.aimwhere.executionerapi.event.Event;
import org.bukkit.Location;

/**
 * @author Aimwhere
 * @since 16/04/2025
 * @version 1
 */
@Getter
@AllArgsConstructor
public class GhostBlockEvent extends Event {
    //spooky man
    private final PlayerProfile player;
    //reason for call(stepped on/interacted with)
    private final String reason;
    //location of the player
    private final Location location;
    //location of the ghost block
    private final Location blockLocation;
    //did executioner mitigate?
    private final boolean mitigated;
    //todo: add a thing for did executioner correct block? fucker wym, u blind? check 1 line above
}
