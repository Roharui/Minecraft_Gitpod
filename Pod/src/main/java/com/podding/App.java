package com.podding;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 */

public class App extends JavaPlugin{

    private final Logger logger = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        super.onEnable();
        this.logger.info("[Pod] is been enabled");
    }

}
