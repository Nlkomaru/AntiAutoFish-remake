package com.noticemc.antiautofish;

import com.noticemc.antiautofish.event.ThrowHook;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiAutoFish extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getServer().getPluginManager().registerEvents(new ThrowHook(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    static AntiAutoFish plugin;

    public static AntiAutoFish getPlugin() {
        return plugin;
    }
}
