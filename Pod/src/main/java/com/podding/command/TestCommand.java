package com.podding.command;

import org.bukkit.entity.Player;

public class TestCommand extends BaseCommand{

    @Override
    void empty(Player p){
        p.getWorld().createExplosion(p.getLocation(), 5.0f);
    }

    @CommandArgs(args="go")
    void ggg(Player p){
        p.sendMessage("It Work.");
    }

}
