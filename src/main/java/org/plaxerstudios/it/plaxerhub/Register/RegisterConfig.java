package org.plaxerstudios.it.plaxerhub.Register;

import org.bukkit.plugin.Plugin;
import org.plaxerstudios.it.plaxerhub.PlaxerHub;

public class RegisterConfig {
    private static Plugin plugin = PlaxerHub.getPlugin(PlaxerHub.class);
    public static void registerConfig(){

        plugin.
        getConfig().options().copyDefaults(true);

        plugin.
        saveConfig();
    }

}
