package com.podding.command;

import org.bukkit.entity.Player;

public class TestCommand extends BaseCommand{

    @CommandArgs(args="go")
    void ggg(Player p){
        p.sendMessage("It Work.");
    }

}
