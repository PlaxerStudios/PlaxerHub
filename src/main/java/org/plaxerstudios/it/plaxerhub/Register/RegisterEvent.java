package org.plaxerstudios.it.plaxerhub.Register;

import org.bukkit.plugin.Plugin;
import org.plaxerstudios.it.plaxerhub.Listener.JoinMessage;
import org.plaxerstudios.it.plaxerhub.Listener.JoinTeleportToHub;
import org.plaxerstudios.it.plaxerhub.Listener.LevaMessage;
import org.plaxerstudios.it.plaxerhub.PlaxerHub;

public class RegisterEvent {
    private static Plugin plugin = PlaxerHub.getPlugin(PlaxerHub.class);
    public static void registerEvent(){
        //register event

        //event
        // getServer().getPluginManager().registerEvents(new CustomEnterMsg(), this);

        plugin.getServer().getPluginManager().registerEvents(new JoinMessage(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new LevaMessage(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new JoinTeleportToHub(), plugin);



    }
}
