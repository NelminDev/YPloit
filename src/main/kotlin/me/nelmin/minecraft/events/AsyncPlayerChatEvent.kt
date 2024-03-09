package me.nelmin.minecraft.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

class AsyncPlayerChatEvent : Listener {

    @EventHandler
    fun onAsyncPlayerChat(event: AsyncPlayerChatEvent) {
        if (!event.message.startsWith("++")) return;
        event.isCancelled = true

        val player = event.player

        val message = event.message

        if (message.startsWith("++ ")) {
            player.sendMessage("§cPlease provide a command")
            return
        }

        val messageSplit = message.split("++")[1].split(" ")
        val command = messageSplit[0]
        val args = messageSplit.subList(1, messageSplit.size)


    }

}