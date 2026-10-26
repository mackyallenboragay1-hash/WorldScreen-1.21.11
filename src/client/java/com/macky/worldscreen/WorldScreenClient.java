package com.macky.worldscreen;

import net.fabricmc.api.ClientModInitializer;

public final class WorldScreenClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        WorldScreenMod.LOGGER.info("WorldScreen client initialized.");
    }
}
