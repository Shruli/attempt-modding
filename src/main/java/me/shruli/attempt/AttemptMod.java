package me.shruli.attempt;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AttemptMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Shruli");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing my attempt at a mod");

		// starting code here

		LOGGER.info("Mod finished initializing. Thanks for downloading! :)");
	}
}
