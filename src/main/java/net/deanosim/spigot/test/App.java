package net.deanosim.spigot.test;

import org.bukkit.plugin.java.JavaPlugin;
public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");

        this.getCommand("brick").setExecutor(new CommandTest());
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}