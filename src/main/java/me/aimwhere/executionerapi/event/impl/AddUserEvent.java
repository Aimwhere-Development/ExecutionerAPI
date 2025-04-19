package me.aimwhere.executionerapi.event.impl;

import me.aimwhere.executionerapi.event.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 1
 */
@Getter
@AllArgsConstructor
public class AddUserEvent extends Event {
    @Setter
    //player's client version as protocol number
    private int protocolVersion;
    private UUID uuid;
}
