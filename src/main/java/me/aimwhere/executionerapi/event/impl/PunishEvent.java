package me.aimwhere.executionerapi.event.impl;

import me.aimwhere.executionerapi.data.PlayerProfile;
import me.aimwhere.executionerapi.event.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Aimwhere
 * @since 16/04/2025
 * @version 2
 */
@Getter
@AllArgsConstructor
public final class PunishEvent extends Event {
    //unfortunate son
    private final PlayerProfile player;
    //i already expplained this in FlagEvent
    private final String check, type, typeAdvanced, info, description; //done adding typeAdvanced
    //same for this
    private final int currentBuffer, maxVl;
    //todo: implement releaseType maybe
}