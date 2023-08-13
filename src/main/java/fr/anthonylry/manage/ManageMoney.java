package fr.anthonylry.manage;

import org.bukkit.plugin.java.JavaPlugin;

public final class ManageMoney extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Le premier plugin de Anthonylry");
        getCommand("givemoney").setExecutor(new commandegive());
        getCommand("removemoney").setExecutor(new commandremove());
        getCommand("resetmoney").setExecutor(new commandereset());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
