package net.jerkymod.forge;

import dev.architectury.platform.forge.EventBuses;
import net.jerkymod.JerkyMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(JerkyMod.MOD_ID)
public class JerkyModForge {
    public JerkyModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(JerkyMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        JerkyMod.init();
    }
}
