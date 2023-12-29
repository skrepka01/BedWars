package ry.bedwars.utils.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ry.bedwars.model.Arena;
import ry.bedwars.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class Items {

    private static Arena arena = new Arena();

    private Items(Arena arena)
    {
        this.arena = arena;
    }

    public static ItemStack selectorArenas()
    {
        ItemStack itemStack = new ItemStack(Material.IRON_INGOT);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(Constants.SELECT_ARENA);
        List<String> lore = new ArrayList<>();
        lore.add(Constants.MESSAGE_SELECT);
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack arena()
    {
        ItemStack itemStack = new ItemStack(Material.EMERALD_BLOCK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("Арена 1");
        List<String> lore = new ArrayList<>();
        lore.add("Количество игроков " + arena.getPlayerArena().get(0).toString());
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
    public static ItemStack arena2()
    {
        ItemStack itemStack = new ItemStack(Material.EMERALD_BLOCK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("Арена 2");
        List<String> lore = new ArrayList<>();
        lore.add("Количество игроков " + arena.getPlayerArena().get(1).toString());
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack arena3()
    {
        ItemStack itemStack = new ItemStack(Material.EMERALD_BLOCK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("Арена 3");
        List<String> lore = new ArrayList<>();
        lore.add("Количество игроков " + arena.getPlayerArena().get(2).toString());
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
