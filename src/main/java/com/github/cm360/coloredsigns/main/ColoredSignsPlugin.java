package com.github.cm360.coloredsigns.main;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.cm360.coloredsigns.listeners.SignChangeListener;

public class ColoredSignsPlugin extends JavaPlugin {

	protected SignChangeListener listener;
	
	public ColoredSignsPlugin() {
		listener = new SignChangeListener();
	}
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(listener, this);
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll(this);
	}

}
