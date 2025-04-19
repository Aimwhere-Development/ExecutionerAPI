package me.aimwhere.executionerapi.event.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import me.aimwhere.executionerapi.event.Event;

import java.util.UUID;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 1
 */
@Getter
@AllArgsConstructor
public class RemoveUserEvent extends Event {
    @Setter
    //client version as protocol number
    private int protocolVersion;
    //player's unique user ID
    private UUID uuid;
}
