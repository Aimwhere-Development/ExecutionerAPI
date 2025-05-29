package me.aimwhere.executionerapi.event;

public interface Cancellable {
    boolean isCancelled();
    void setCancelled(boolean cancelled);
}
