package com.minecraft.hothGenerator;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Lasse on 21.02.2017.
 */
public class foobar extends JavaPlugin {
    public void onEnable() {
        getLogger().info("enabled HothGenerator");
    }

    public void onDisable() {
        getLogger().info("disabled HothGenerator");
    }
}
