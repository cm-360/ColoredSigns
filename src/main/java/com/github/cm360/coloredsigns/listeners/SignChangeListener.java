package com.github.cm360.coloredsigns.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignChangeListener implements Listener {

	@EventHandler
	public void onSignChange(SignChangeEvent event) {
		String[] lines = event.getLines();
		for (int i = 0; i < lines.length; i++)
			event.setLine(i, lines[i].replace("&", "\u00a7").replace("\u00a7\u00a7", "&"));
	}

}
