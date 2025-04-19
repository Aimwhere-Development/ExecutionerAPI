package me.aimwhere.executionerapi.event.impl;

import me.aimwhere.executionerapi.data.PlayerProfile;
import me.aimwhere.executionerapi.event.Event;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 1
 * @status To be implemented
 */
@RequiredArgsConstructor
@Getter
public class BlacklistEvent extends Event {
    private final PlayerProfile player;
}
