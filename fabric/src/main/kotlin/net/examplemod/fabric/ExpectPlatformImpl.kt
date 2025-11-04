package net.linked.StackTags.fabric

import net.fabricmc.loader.api.FabricLoader
import java.nio.file.Path

object ExpectPlatformImpl {
    /**
     * This is our actual method to [ExpectPlatform.getConfigDirectory].
     */
    @JvmStatic // Jvm Static is required so that java can access it
    fun getConfigDirectory(): Path {
        return FabricLoader.getInstance().configDir
    }
}