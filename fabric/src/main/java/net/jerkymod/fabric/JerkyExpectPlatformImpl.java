package net.jerkymod.fabric;

import net.jerkymod.JerkyExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class JerkyExpectPlatformImpl {
    /**
     * This is our actual method to {@link JerkyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
