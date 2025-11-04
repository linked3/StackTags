package net.linked.StackTags

import dev.architectury.injectables.annotations.ExpectPlatform
import java.nio.file.Path

object ExpectPlatform {
    /**
     * We can use [Platform.getConfigFolder] but this is just an example of [ExpectPlatform].
     *
     *
     * This must be a **public static** method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with `Impl`.
     *
     *
     * Example:
     * Expect: net.linked.StackTags.ExampleExpectPlatform#getConfigDirectory()
     * Actual Fabric: net.linked.StackTags.fabric.ExampleExpectPlatformImpl#getConfigDirectory()
     * Actual Forge: net.linked.StackTags.forge.ExampleExpectPlatformImpl#getConfigDirectory()
     *
     *
     * [You should also get the IntelliJ plugin to help with @ExpectPlatform.](https://plugins.jetbrains.com/plugin/16210-architectury)
     */
    @JvmStatic // Make sure its Jvm Static
    @ExpectPlatform
    fun getConfigDirectory(): Path {
        // Just throw an error, the content should get replaced at runtime.
        throw AssertionError()
    }
}