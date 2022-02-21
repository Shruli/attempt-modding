package me.shruli.attempt;

import me.shruli.attempt.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AttemptMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Shruli");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing my attempt at a mod");
		ModItems.registerModItems();
		LOGGER.info("Mod finished initializing. Thanks for downloading! :)");
	}
}
