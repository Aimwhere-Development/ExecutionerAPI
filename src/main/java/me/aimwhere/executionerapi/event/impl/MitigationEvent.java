package me.aimwhere.executionerapi.event.impl;

import me.aimwhere.executionerapi.data.PlayerProfile;
import me.aimwhere.executionerapi.event.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 1
 * @status To be Implemented
 */
@Getter
@AllArgsConstructor
public class MitigationEvent extends Event {
    private final PlayerProfile player;
    private final String check, type, info, description;
    private final int currentViolationLevel, maxVl;
    private boolean experimental;

    @Setter
    private boolean cancelAlert, cancelSetBack;
}
