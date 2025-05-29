package me.aimwhere.executionerapi.event;

public enum EventPriority {
    LOWEST(0),
    LOW(1),
    NORMAL(2),
    HIGH(3),
    HIGHEST(4),
    MONITOR(5); // For monitoring only, cannot cancel events

    private final int priority;

    EventPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}