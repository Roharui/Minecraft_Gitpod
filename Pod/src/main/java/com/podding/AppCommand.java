package com.podding;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.podding.command.*;

public class AppCommand implements CommandExecutor {

    private BaseCommand bc = new TestCommand();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        boolean result = false;

        // Player only
        if (sender instanceof Player) {

            try {
                result =  bc.invoke(args, (Player) sender);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        else
        {
            sender.sendMessage("Console only!");
        }

        return result;
    }
}
