package org.plaxerstudios.it.plaxerhub.Command;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.plaxerstudios.it.plaxerhub.PlaxerHub;
import org.plaxerstudios.it.plaxerhub.Utils;

public class HubCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender p, Command command, String s, String[] strings) {
        if(p instanceof Player){
            int x =  Utils.getInt("Hub.x");
            int y =  Utils.getInt("Hub.y");
            int z =  Utils.getInt("Hub.z");
            int Pitch =  Utils.getInt("Hub.Pitch");
            int yaw =  Utils.getInt("Hub.Yaw");
            String world = Utils.getString("Hub.World");


            Location loc = new Location(Bukkit.getWorld(world), x, y, z, yaw, Pitch);
            ((Player) p).teleport(loc);

        }
        return false;
    }
}
