package me.aimwhere.executionerapi.event.registry;


import me.aimwhere.executionerapi.event.Event;
import me.aimwhere.executionerapi.event.Listener;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 1
 */
public class EventRegistry {
    private final List<Listener> listeners = new ArrayList<>();

    //ignore this, only used in Executioner itself
    public boolean callEvent(Event event) {
        this.listeners.forEach(e -> e.onEvent(event));
        return event.isCancel();
    }

    public void addListener(Listener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        } else {
            Bukkit.getLogger().warning("You already have registered event " + listener.getClass().getSimpleName());
        }
    }

    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    public void shutdown() {
        listeners.clear();
    }
}
