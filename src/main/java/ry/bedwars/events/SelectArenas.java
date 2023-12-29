package ry.bedwars.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import ry.bedwars.utils.Helper;
import ry.bedwars.utils.items.Items;

public class SelectArenas implements Listener {


    private final Inventory inventory = Bukkit.createInventory(null,9);

    @EventHandler
    public void selectArenas(PlayerInteractEvent event)
    {
        Player player = event.getPlayer();
        Action rightClickBlock = Action.RIGHT_CLICK_BLOCK;
        Action rightClickAIR = Action.RIGHT_CLICK_BLOCK;
        if (event.getAction() == rightClickBlock ||event.getAction() == rightClickAIR
                && player.getInventory().getItemInMainHand().equals(Items.selectorArenas()))
        {
            player.openInventory(inventory);
        }
    }

    @EventHandler
    public void joinOnServer(PlayerJoinEvent event)
    {
        addItemInventory();
        Helper.setItem(event.getPlayer(),Items.selectorArenas());
    }

    private void addItemInventory()
    {
        inventory.addItem(Items.arena(),Items.arena2(),Items.arena3());
    }
}
