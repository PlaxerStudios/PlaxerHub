package org.plaxerstudios.it.plaxerhub.Command;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.plaxerstudios.it.plaxerhub.PlaxerHub;
import org.plaxerstudios.it.plaxerhub.Utils;

public class HubSet implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender p, Command command, String s, String[] strings) {
        if(p.hasPermission("plaxerhub.sethub")){
            if(p instanceof Player){
                Location loc = ((Player) p).getLocation();
                Utils.setInt( "Hub.x" ,loc.getBlockX());
                Utils.setInt( "Hub.y" ,loc.getBlockY());
                Utils.setInt( "Hub.z" ,loc.getBlockZ());
                Utils.setInt( "Hub.Pitch" , (int) loc.getPitch());
                Utils.setInt( "Hub.Yaw" , (int) loc.getYaw());
                Utils.setString("Hub.World" , loc.getWorld().getName());
                Utils.saveconfig();

            }

        }else{
            p.sendMessage("§r§lPLAXER§b§lHUB §c You do not have permission to use this command!");
        }
        return false;
    }
}
