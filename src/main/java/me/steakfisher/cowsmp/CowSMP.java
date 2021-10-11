package me.steakfisher.cowsmp;

import me.steakfisher.cowsmp.listeners.onDeathEvent;
import me.steakfisher.cowsmp.listeners.onJoinEvent;
import me.steakfisher.cowsmp.listeners.onRespawnEvent;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class CowSMP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        loadConfig();
        getServer().getPluginManager().registerEvents((Listener) new onJoinEvent(), this);
        getServer().getPluginManager().registerEvents((Listener) new onDeathEvent(), this);
        getServer().getPluginManager().registerEvents((Listener) new onRespawnEvent(), this);
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        reloadConfig();
        saveConfig();
    }
}
