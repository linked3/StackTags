package net.linked.StackTags.forge

import dev.architectury.platform.forge.EventBuses
import net.linked.StackTags.StackTags
import net.minecraftforge.fml.common.Mod
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.MOD_CONTEXT

@Mod(StackTags.MOD_ID)
object StackTagsForge {
    init {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(StackTags.MOD_ID, MOD_BUS)
        StackTags.init()
    }
}


