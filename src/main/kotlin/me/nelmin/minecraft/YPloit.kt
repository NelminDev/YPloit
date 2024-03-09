package me.nelmin.minecraft

import org.bukkit.plugin.java.JavaPlugin

/**
 * Main class of the plugin
 *
 * @since 1.0.0
 * @version 1.0.0
 * @author NelminDev
 */
class YPloit : JavaPlugin() {

    companion object {
        /**
         * Instance of the plugin
         *
         * @since 1.0.0
         * @version 1.0.0
         */
        lateinit var instance: YPloit
    }

    val prefix = "§7[§eYPloit§7] §r"
    val chatCommandPrefix = "++"

    /**
     * Called when the plugin is enabled
     *
     * @since 1.0.0
     * @version 1.0.0
     * @see JavaPlugin.onEnable
     */
    override fun onEnable() {
        instance = this


    }
}