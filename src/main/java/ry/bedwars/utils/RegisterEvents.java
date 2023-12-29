package ry.bedwars.utils;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import ry.bedwars.BedWars;
import ry.bedwars.events.SelectArenas;

public class RegisterEvents {

    public void regEvents()
    {
        helpRegister(new SelectArenas());
    }

    private void helpRegister(Listener listener)
    {
        Bukkit.getPluginManager().registerEvents(listener, BedWars.instance);
    }
}
