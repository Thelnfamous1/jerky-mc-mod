package net.jerkymod.fabric;

import net.jerkymod.JerkyExpectPlatform;
import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class JerkyExpectPlatformImpl {
    /**
     * This is our actual method to {@link JerkyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
