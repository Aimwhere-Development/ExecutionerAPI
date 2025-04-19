package me.aimwhere.executionerapi;

import me.aimwhere.executionerapi.event.registry.EventRegistry;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 1
 */
public enum AnticheatAPI {
    INSTANCE;
    private static EventRegistry eventRegistry;

    public void init() {
        eventRegistry = getEventRegistry();
    }

    public void terminate() {
        getEventRegistry().shutdown();
    }

    public EventRegistry getEventRegistry() {
        if(eventRegistry == null) eventRegistry = new EventRegistry();
        return eventRegistry;
    }
}
