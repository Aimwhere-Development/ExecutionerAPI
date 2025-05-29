package me.aimwhere.executionerapi.event.impl;

import lombok.Getter;
import me.aimwhere.executionerapi.event.ExecutionerEvent;

import java.util.UUID;

@Getter
public class PlayerLeaveEvent extends ExecutionerEvent {
    private final UUID playerUuid;

    public PlayerLeaveEvent(UUID playerUuid) {
        this.playerUuid = playerUuid;
    }

    @Override
    public boolean isCancellable() {
        return false;
    }
}
