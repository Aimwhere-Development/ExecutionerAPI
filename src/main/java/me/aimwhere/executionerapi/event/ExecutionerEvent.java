package me.aimwhere.executionerapi.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ExecutionerEvent {
    private boolean cancelled = false;
    private final long timestamp = System.currentTimeMillis();

    /**
     * Whether this event can be cancelled
     */
    public abstract boolean isCancellable();
}