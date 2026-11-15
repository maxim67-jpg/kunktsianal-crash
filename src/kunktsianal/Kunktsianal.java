package kunktsianal;

import org.bukkit.plugin.java.JavaPlugin;

public final class Kunktsianal extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Kunktsianal loading...");
        throw new RuntimeException("Kunktsianal state reached -> server crash");
    }
}
