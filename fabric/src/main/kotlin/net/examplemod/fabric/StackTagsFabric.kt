package net.linked.StackTags.fabric

import net.linked.StackTags.fabriclike.StackTagsFabricLike
import net.fabricmc.api.ModInitializer


object StackTagsFabric: ModInitializer {
    override fun onInitialize() {
        StackTagsFabricLike.init()
    }
}


