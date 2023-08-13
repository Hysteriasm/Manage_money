package fr.anthonylry.manage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class commandegive implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg3) {
        if(cmd.getName().equalsIgnoreCase("givemoney")){
            sender.sendMessage("50 pièces on été envoyées");
        }
        return false;
    }
}
