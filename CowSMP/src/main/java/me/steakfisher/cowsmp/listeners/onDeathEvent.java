package me.steakfisher.cowsmp.listeners;


import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Date;


public class onDeathEvent implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        Player player = event.getEntity().getPlayer();
        if(player.hasPermission("cowsmp.mod")){
            return;
        }
        else if(player.hasPermission("cowsmp.content")){
            Date date = new Date(System.currentTimeMillis()+24*60*60*1000);
            Bukkit.getBanList(BanList.Type.NAME).addBan(player.getName(),"You died, but that’s ok, you’ll be reincarnated in a day. For the time being, check out the other SMP instead, where you DON’T have to worry about waiting to be born again!", date, null);
            player.kickPlayer("You died, but that’s ok, you’ll be reincarnated a day. For the time being, check out the other SMP instead, where you DON’T have to worry about waiting to be born again!");
        }
        Date date = new Date(System.currentTimeMillis()+4*24*60*60*1000);
        Bukkit.getBanList(BanList.Type.NAME).addBan(player.getName(),"You died, but that’s ok, you’ll be reincarnated in 4 days. For the time being, check out the other SMP instead, where you DON’T have to worry about waiting to be born again!", date, null);
        player.kickPlayer("You died, but that’s ok, you’ll be reincarnated in 4 days. For the time being, check out the other SMP instead, where you DON’T have to worry about waiting to be born again!");
    }
}
