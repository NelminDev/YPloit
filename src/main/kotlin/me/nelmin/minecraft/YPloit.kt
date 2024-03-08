package me.nelmin.minecraft

import org.bukkit.plugin.java.JavaPlugin
import java.io.File

class YPloit : JavaPlugin() {

    companion object {
        lateinit var instance: YPloit
    }


    override fun onEnable() {
        if (File("worlds/worlds.json").exists())
    }
}