package me.aimwhere.executionerapi.event.impl;

import lombok.Getter;
import lombok.Setter;
import me.aimwhere.executionerapi.event.Cancellable;
import me.aimwhere.executionerapi.event.ExecutionerEvent;
import me.aimwhere.executionerapi.player.PlayerProfile;
import me.aimwhere.executionerapi.shit.CheckType;

@Getter
public class PlayerFlagEvent extends ExecutionerEvent implements Cancellable {
    private final PlayerProfile player;
    private final CheckType checkName;
    private final String checkType;
    private final String checkTypeAdvanced;
    private final String debugData;
    private final String description;
    private final int violationLevel;
    private final int maxViolationLevel;
    private final String releaseType;

    @Setter
    private boolean cancelled = false;

    @Setter
    private boolean suppressAlert = false; // Allow plugins to suppress alerts

    public PlayerFlagEvent(PlayerProfile player, CheckType checkName, String checkType,
                           String checkTypeAdvanced, String debugData, String description,
                           int violationLevel, int maxViolationLevel, String releaseType) {
        this.player = player;
        this.checkName = checkName;
        this.checkType = checkType;
        this.checkTypeAdvanced = checkTypeAdvanced;
        this.debugData = debugData;
        this.description = description;
        this.violationLevel = violationLevel;
        this.maxViolationLevel = maxViolationLevel;
        this.releaseType = releaseType;
    }

    @Override
    public boolean isCancellable() {
        return true;
    }
}
