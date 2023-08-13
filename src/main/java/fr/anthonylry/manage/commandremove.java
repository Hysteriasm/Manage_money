package fr.anthonylry.manage;

import jdk.internal.access.JavaLangInvokeAccess;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class commandremove implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("removemoney")){
            sender.sendMessage("50 pièces on été enlevées");

    }
        return false;
    }
}
