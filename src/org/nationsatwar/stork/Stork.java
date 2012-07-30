package org.nationsatwar.stork;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.nationsatwar.stork.events.SpawnListener;

public class Stork extends JavaPlugin {
	
	public void onEnable() {
		new SpawnListener(this);
		
		this.getConfig().options().copyDefaults(true);
		this.getLogger().info(this.getDescription().getVersion()+ " Loaded");
	}
	
	public void onDisable() {
		this.saveConfig();
		this.getLogger().info(this.getDescription().getVersion()+ " Unloaded");
	}
	
	public void messageAll(String message) {
		this.getServer().broadcastMessage(ChatColor.DARK_RED + "["+this.getName()+"]: " + message);
	}
}
