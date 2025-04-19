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
public class SpawnAurabotEvent extends Event {

    //profile of the payer that the bot was spawned for
    PlayerProfile profile;

    //the spawned bot's entity Id
    int entityId;

    //the spawned bot's UUID
    UUID entityUUID;
}
