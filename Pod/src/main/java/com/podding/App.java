package com.podding;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;


public class App extends JavaPlugin{

    public static final Logger logger = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        super.onEnable();

        getCommand("test").setExecutor(new AppCommand());

        App.logger.info("[Pod] is been enabled");
    }

}
