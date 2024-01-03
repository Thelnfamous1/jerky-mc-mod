package net.jerkymod.fabric;

import net.jerkymod.JerkyMod;
import net.fabricmc.api.ModInitializer;

public class JerkyModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        JerkyMod.init();
    }
}
