package com.github.cm360.coloredsigns.main;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.cm360.coloredsigns.listeners.SignChangeListener;

public class ColoredSignsPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new SignChangeListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}

}
