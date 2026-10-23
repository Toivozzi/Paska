package me.Toivow.paska;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Paska extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Paska plugari kaynnistetty :)");
    }

    @Override
    public void onDisable() {
        getLogger().info("Paska plugari sammutettu :(");
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        event.setDropItems(false);

        event.getBlock().getWorld().dropItemNaturally(
                event.getBlock().getLocation(),
                new ItemStack(Material.BROWN_WOOL, 1)
        );
    }
}