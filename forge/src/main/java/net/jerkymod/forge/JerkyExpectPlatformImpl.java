package net.jerkymod.forge;

import net.jerkymod.JerkyExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class JerkyExpectPlatformImpl {
    /**
     * This is our actual method to {@link JerkyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
