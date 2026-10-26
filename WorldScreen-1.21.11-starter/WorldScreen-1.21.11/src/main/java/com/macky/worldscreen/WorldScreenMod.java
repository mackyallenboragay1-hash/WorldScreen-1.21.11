package com.macky.worldscreen;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class WorldScreenMod implements ModInitializer {
    public static final String MOD_ID = "worldscreen";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("WorldScreen base loaded. Browser and shared-screen features are the next development steps.");
    }
}
