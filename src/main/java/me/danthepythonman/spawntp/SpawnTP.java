package me.danthepythonman.spawntp;

import me.danthepythonman.spawntp.commands.SetSpawnCommand;
import me.danthepythonman.spawntp.commands.SpawnCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnTP extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Loading Spawn TP commands");
        getCommand("setspawntp").setExecutor(new SetSpawnCommand(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
