package net.linked.StackTags.quilt

import net.linked.StackTags.fabriclike.StackTagsFabricLike
import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer

object StackTagsQuilt: ModInitializer {
    override fun onInitialize(mod: ModContainer?) {
        StackTagsFabricLike.init()
    }
}


