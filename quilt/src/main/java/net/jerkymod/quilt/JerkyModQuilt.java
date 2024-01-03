package net.jerkymod.quilt;

import net.jerkymod.JerkyMod;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class JerkyModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        JerkyMod.init();
    }
}
