package me.steakfisher.cowsmp.listeners;


import me.steakfisher.cowsmp.CowSMP;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class onJoinEvent implements Listener {
    private Plugin plugin = CowSMP.getPlugin(CowSMP.class);
    int a = 0;
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        if(player.hasPlayedBefore()) {
            if(player.isOp()){
                player.teleport(new Location(player.getWorld(), 2500000, 65, 2500000));
                }
            else{
                player.sendMessage("Works till here");
                for(String One : plugin.getConfig().getStringList("config.One")){
                    Player playerName1 = Bukkit.getServer().getPlayer(One);
                    player.sendMessage("Works till here");
                    if(player == playerName1){
                        player.sendMessage("You're in grp 1");
                        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                        String command = "lp user " + One + " parent add one";
                        Bukkit.dispatchCommand(console, command);
                        player.teleport(new Location(player.getWorld(), 1500000, 71, 1500000));
                    }
                }
                player.sendMessage("Works till here");
                for(String Two : plugin.getConfig().getStringList("config.Two")){
                    Player playerName1 = Bukkit.getServer().getPlayer(String.valueOf(Two));
                    if(player == playerName1){
                        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                        String command = "lp user " + Two + " parent add one";
                        Bukkit.dispatchCommand(console, command);
                        player.teleport(new Location(player.getWorld(), -1500000, 71, 1500000));
                    }
                }
                for(String Three : plugin.getConfig().getStringList("config.Three")){
                    Player playerName1 = Bukkit.getServer().getPlayer(String.valueOf(Three));
                    if(player == playerName1){
                        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                        String command = "lp user " + Three + " parent add one";
                        Bukkit.dispatchCommand(console, command);
                        player.teleport(new Location(player.getWorld(), -1500000, 71, -1500000));
                    }
                if (a % 2 == 1) {
                    UUID uuidFour = player.getUniqueId();
                    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                    String command = "lp user " + uuidFour + " parent add four";
                    Bukkit.dispatchCommand(console, command);
                    player.teleport(new Location(player.getWorld(), 1500000, 86, -1500000));
                    a++;
                } else if (a % 2 == 0) {
                    UUID uuidFive = player.getUniqueId();
                    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                    String command = "lp user " + uuidFive + " parent add five";
                    Bukkit.dispatchCommand(console, command);
                    player.teleport(new Location(player.getWorld(), -2500000, 63, 2500000));
                    a++;
                }
            }
            }
        }
    }
}