package org.nationsatwar.stork.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.plugin.PluginBase;

public class SpawnListener implements Listener {
	
	private PluginBase plugin;
	private int pigmenSpawns = 0;

	public SpawnListener(PluginBase instance) {
		plugin = instance;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public synchronized void onCreatureSpawn(CreatureSpawnEvent event) {
		if(plugin.getConfig().getBoolean("enablereplacement", true)) {
			if(event.getSpawnReason() == SpawnReason.SPAWNER) {
				Block block = event.getLocation().getBlock();
				if(block == null) {
					return;
				}
				for(int x = -4; x <= 4; x++) {
					for(int y = -1; y <= 1; y++) {
						for(int z = -4; z <= 4; z++) {
							Block check = event.getLocation().getWorld().getBlockAt(block.getX() + x, block.getY() + y, block.getZ() + z);
							if(check == null) {
								break;
							}
							if(check.getType() == Material.MOB_SPAWNER) {
								int replacement = plugin.getConfig().getInt("replacement",57);
								check.setType(Material.getMaterial(replacement));
							}
						}
					}
				}
			}
		}
		if(plugin.getConfig().getBoolean("enableblazes", true)) {
			if(event.getEntityType() == EntityType.PIG_ZOMBIE) {
				this.pigmenSpawns++;
				if(this.pigmenSpawns >= plugin.getConfig().getInt("blazeoccurence", 20)) {
					for(int i = 0; i < plugin.getConfig().getInt("blazecount", 1); i++ ) {
						event.getLocation().getWorld().spawnCreature(event.getLocation(), EntityType.BLAZE);
					}
					this.pigmenSpawns = 0;
				}
			}
		}
		
	 }
}
