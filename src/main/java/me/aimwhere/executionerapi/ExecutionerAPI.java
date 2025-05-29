package me.aimwhere.executionerapi;

import me.aimwhere.executionerapi.event.ExecutionerEvent;
import me.aimwhere.executionerapi.event.ExecutionerListener;
import me.aimwhere.executionerapi.player.PlayerProfile;

import java.util.Collection;
import java.util.UUID;

/**
 * Main API interface for Executioner Anticheat
 * This will be implemented by the actual anticheat plugin
 */
public interface ExecutionerAPI {

    /**
     * Get the API instance (provided by the anticheat plugin)
     */
    static ExecutionerAPI getInstance() {
        try {
            Class<?> implClass = Class.forName("net.aimwhere.precisity.core.ExecutionerAPIImpl");
            return (ExecutionerAPI) implClass.getField("INSTANCE").get(null);
        } catch (Exception e) {
            throw new RuntimeException("Executioner Anticheat plugin not found!", e);
        }
    }

    /**
     * Register an event listener
     */
    void registerListener(ExecutionerListener listener);

    /**
     * Unregister an event listener
     */
    void unregisterListener(ExecutionerListener listener);

    /**
     * Call an event (used internally by the anticheat)
     */
    boolean callEvent(ExecutionerEvent event);

    /**
     * Get a player's profile
     */
    PlayerProfile getPlayerProfile(UUID uuid);

    /**
     * Get all online player profiles
     */
    Collection<PlayerProfile> getOnlineProfiles();

    /**
     * Check if a player is being monitored
     */
    boolean isPlayerMonitored(UUID uuid);

    /**
     * Get API version
     */
    String getVersion();

    /**
     * Check if the anticheat is enabled
     */
    boolean isEnabled();
}