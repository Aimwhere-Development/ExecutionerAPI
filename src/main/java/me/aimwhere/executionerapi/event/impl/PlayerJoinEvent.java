package me.aimwhere.executionerapi.event.impl;

import lombok.Getter;
import me.aimwhere.executionerapi.event.ExecutionerEvent;
import me.aimwhere.executionerapi.player.PlayerProfile;

@Getter
public class PlayerJoinEvent extends ExecutionerEvent {
    private final PlayerProfile player;
    private final int protocolVersion;

    public PlayerJoinEvent(PlayerProfile player, int protocolVersion) {
        this.player = player;
        this.protocolVersion = protocolVersion;
    }

    @Override
    public boolean isCancellable() {
        return false;
    }
}