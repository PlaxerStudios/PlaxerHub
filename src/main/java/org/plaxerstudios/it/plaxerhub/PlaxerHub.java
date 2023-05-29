package org.plaxerstudios.it.plaxerhub;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.plaxerstudios.it.plaxerhub.Command.SpawnCommand;
import org.plaxerstudios.it.plaxerhub.Command.SpawnSet;
import org.plaxerstudios.it.plaxerhub.Register.RegisterConfig;
import org.plaxerstudios.it.plaxerhub.Register.RegisterEvent;

public final class PlaxerHub extends JavaPlugin {

    @Override
    public void onEnable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage("");
        console.sendMessage("");
        console.sendMessage(ChatColor.GREEN + "    PlaxerHub" + ChatColor.GRAY + " v.5.9.6");
        console.sendMessage(ChatColor.GRAY + "    Running on Bukkit - CraftBukkit");
        console.sendMessage("");
        console.sendMessage("");
        console.sendMessage(ChatColor.AQUA + "Copying information from" + ChatColor.LIGHT_PURPLE + " Config.yml...");
        console.sendMessage(ChatColor.AQUA + "Saving the" + ChatColor.LIGHT_PURPLE + " Config.yml...");
        console.sendMessage(ChatColor.AQUA + "Initializing commands...");
        console.sendMessage(ChatColor.GREEN + "Commands created successfully!");
        console.sendMessage(ChatColor.GREEN + "The plugin has been installed correctly");
        console.sendMessage("");
        console.sendMessage("");

        //register Event
        RegisterEvent.registerEvent();
        //register Config
        RegisterConfig.registerConfig();
        //register Command
        this.registerCommand();






    }

    private void registerCommand() {

        this.getCommand("setspawn").setExecutor(new SpawnCommand());
        this.getCommand("setspawn").setExecutor(new SpawnSet());



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
