package me.aimwhere.executionerapi.event.impl;

import lombok.Getter;
import lombok.Setter;
import me.aimwhere.executionerapi.event.Cancellable;
import me.aimwhere.executionerapi.event.ExecutionerEvent;
import me.aimwhere.executionerapi.player.PlayerProfile;
import org.bukkit.Location;

@Getter
public class AurabotSpawnEvent extends ExecutionerEvent implements Cancellable {
    private final PlayerProfile player;
    private final int botId;
    private final Location location;

    @Setter
    private boolean cancelled = false;

    public AurabotSpawnEvent(PlayerProfile player, int id, Location location) {
        this.player = player;
        this.botId = id;
        this.location = location.clone();
    }

    @Override
    public boolean isCancellable() {
        return true;
    }
}
