package learning.spigot_plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPLugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("hello world");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
