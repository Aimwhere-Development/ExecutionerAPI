package me.aimwhere.executionerapi.example;

import me.aimwhere.executionerapi.AnticheatAPI;
import me.aimwhere.executionerapi.event.Event;
import me.aimwhere.executionerapi.event.Listener;
import me.aimwhere.executionerapi.event.impl.FlagEvent;
import me.aimwhere.executionerapi.event.impl.GhostBlockEvent;
import me.aimwhere.executionerapi.event.impl.PunishEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Aimwhere
 * @since 15/04/2025
 * @version 1
 */
public class ExampleAPI extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        AnticheatAPI.INSTANCE.init();
        AnticheatAPI.INSTANCE.getEventRegistry().addListener(this);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        AnticheatAPI.INSTANCE.terminate();
        super.onDisable();
    }

    @Override
    public void onEvent(Event event) {
        if(event instanceof FlagEvent) {
            // flag things
        } else if(event instanceof PunishEvent) {
            // punish things
        } else if (event instanceof GhostBlockEvent) {
            // ghostblock stuff
        }
    }
}
