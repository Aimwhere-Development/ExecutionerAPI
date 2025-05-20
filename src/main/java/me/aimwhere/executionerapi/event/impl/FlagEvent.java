package me.aimwhere.executionerapi.event.impl;

import lombok.Setter;
import me.aimwhere.executionerapi.data.PlayerProfile;
import me.aimwhere.executionerapi.event.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 3
 */
@Getter
@Setter
@AllArgsConstructor
public final class FlagEvent extends Event {
    //player who flagged
    private final PlayerProfile player;
    //check is the name of the check, type is the type(A/B/C/etc), typeAdvanced is like [Consistency] so basically a more defined type, info is the debug data, description is the description
    private final String check, type, typeAdvanced, info, description;
    //current vl and max vl, if any
    private final int currentViolationLevel, maxVl;
    //check releasetype, done converting to releaseType
    private String releaseType;
}