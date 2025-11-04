package net.linked.StackTags

import net.linked.StackTags.ExpectPlatform.getConfigDirectory

object StackTags {
    const val MOD_ID = "stacktags"

    fun init() {
        println("CONFIG DIR: ${getConfigDirectory().toAbsolutePath().normalize()}")
    }
}


