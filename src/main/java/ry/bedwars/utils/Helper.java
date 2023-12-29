package ry.bedwars.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class Helper {

    public static void sendMessage(Player player,String msg)
    {
        player.sendMessage(msg);
    }

    public static Inventory getInventory(Player player)
    {
        return player.getInventory();
    }

    public static ItemStack getItemMainHand(Player player)
    {
        return player.getInventory().getItemInMainHand();
    }

    public static HashMap<Integer, ItemStack> setItem(Player player, ItemStack itemStack)
    {
        return getInventory(player).addItem(itemStack);
    }
}
