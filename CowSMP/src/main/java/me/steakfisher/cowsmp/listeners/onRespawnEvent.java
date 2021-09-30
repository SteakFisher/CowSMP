package me.steakfisher.cowsmp.listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class onRespawnEvent implements Listener {

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event){

        Player player = event.getPlayer();
        if(player.isOp()) {
            event.setRespawnLocation(new Location(player.getWorld(), 2500000, 65, 2500000));
        }else if(player.hasPermission("cowsmp.group1")){

            event.setRespawnLocation(new Location(player.getWorld(), 1500000, 65, 1500000));

        }else if(player.hasPermission("cowsmp.group2")){

            event.setRespawnLocation(new Location(player.getWorld(), -1500000, 65, 1500000));

        }else if(player.hasPermission("cowsmp.group3")){

            event.setRespawnLocation(new Location(player.getWorld(), -1500000, 83, -1500000));

        }else if(player.hasPermission("cowsmp.group4")) {

            event.setRespawnLocation(new Location(player.getWorld(), 1500000, 86, -1500000));

        }else if(player.hasPermission("cowsmp.group5")) {

            event.setRespawnLocation(new Location(player.getWorld(), -2500000, 63, 2500000));
        }else if(player.hasPermission("cowsmp.mod")){

            event.setRespawnLocation(new Location(player.getWorld(), 2500000, 65, 2500000));
        }else{

            player.kickPlayer("You don't have appropriate permissions, create a ticket in our discord server (Cow's Pasture)");

        }
    }
}

