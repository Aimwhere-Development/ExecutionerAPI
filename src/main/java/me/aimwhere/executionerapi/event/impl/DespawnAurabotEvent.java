package me.aimwhere.executionerapi.event.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.aimwhere.executionerapi.data.PlayerProfile;
import me.aimwhere.executionerapi.event.Event;

import java.util.UUID;

/**
 * @author Aimwhere
 * @since 19/04/2025
 * @version 1
 */

@Getter
@AllArgsConstructor
public class DespawnAurabotEvent extends Event {

    //profile of the player the bot was removed from
    private PlayerProfile profile;

    //the bot's entityId
    private int entityId;

    //the bot's UUID
    private UUID entityUUID;
}
