package me.aimwhere.executionerapi.event.impl;

import lombok.Getter;
import lombok.Setter;
import me.aimwhere.executionerapi.event.Cancellable;
import me.aimwhere.executionerapi.event.ExecutionerEvent;
import me.aimwhere.executionerapi.player.PlayerProfile;

@Getter
public class PlayerKickEvent extends ExecutionerEvent implements Cancellable {
    private final PlayerProfile player;
    private final String reason;
    @Setter
    private boolean cancelled = false;

    public PlayerKickEvent(PlayerProfile player, String reason) {
        this.player = player;
        this.reason = reason;
    }


    @Override
    public boolean isCancellable() {
        return true;
    }
}
