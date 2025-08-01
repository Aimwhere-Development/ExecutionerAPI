package me.aimwhere.executionerapi.event.impl;

import lombok.Getter;
import lombok.Setter;
import me.aimwhere.executionerapi.event.Cancellable;
import me.aimwhere.executionerapi.event.ExecutionerEvent;
import me.aimwhere.executionerapi.player.PlayerProfile;
import org.bukkit.Location;

@Getter
public class AttemptedCrashEvent extends ExecutionerEvent implements Cancellable {
    private final PlayerProfile player;
    private final String reason;
    private final Location location;

    @Setter
    private boolean cancelled = false;

    @Setter
    private boolean autoKick = true; // Allow plugins to prevent auto-kick

    public AttemptedCrashEvent(PlayerProfile player, String reason, Location location) {
        this.player = player;
        this.reason = reason;
        this.location = location.clone();
    }

    @Override
    public boolean isCancellable() {
        return true;
    }
}