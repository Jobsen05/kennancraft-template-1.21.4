package net.jobsen.kennancraft;

import net.fabricmc.api.ModInitializer;

import net.jobsen.kennancraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KennanCraft implements ModInitializer {
	public static final String MOD_ID = "kennancraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}