package org.plaxerstudios.it.plaxerhub;

import org.bukkit.plugin.Plugin;

public class Utils {

    private static Plugin plugin = PlaxerHub.getPlugin(PlaxerHub.class);

    public static String getString(String path){

        // Get String in the config using path
        // Example: "Ex.msg"
        String message = plugin.getConfig().getString(path);

        // Return message = String
        return message;
    }

    public static int getInt(String path){

        // Get Int in the config using path
        // Example: "Ex.msg"
        int message = plugin.getConfig().getInt(path);

        // Return message = String
        return message;
    }

    public static boolean getboolean(String path){

        // Get Boolean in the config using path
        // Example: true
        Boolean message = plugin.getConfig().getBoolean(path);

        // Return message = Boolean
        return message;
    }

    public static void setInt(String path, int in){
        // Set config a path the int = in
        plugin.getConfig().set(path, in);
    }
    public static void setString(String path, String string){
        // Set config a path the string = string
        plugin.getConfig().set(path, string);
    }

    public static void saveconfig(){
        plugin.saveConfig();
        plugin.reloadConfig();
    }


}
