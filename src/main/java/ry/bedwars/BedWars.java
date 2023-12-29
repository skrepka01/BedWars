package ry.bedwars;

import org.bukkit.plugin.java.JavaPlugin;
import ry.bedwars.utils.RegisterEvents;

public final class BedWars extends JavaPlugin {

    private final RegisterEvents registerEvents = new RegisterEvents();
    public static BedWars instance;

    @Override
    public void onEnable() {
        instance = this;
        registerEvents.regEvents();
    }

    @Override
    public void onDisable() {
    }

}
