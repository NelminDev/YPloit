package me.nelmin.minecraft.utils.discord

import me.nelmin.minecraft.Secrets
import java.io.IOException
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class DiscordWebhookSender {

    @Throws(IOException::class, InterruptedException::class)
    fun sendMessage(message: String) {
        val client = HttpClient.newHttpClient()

        val request = HttpRequest.newBuilder()
            .uri(URI.create(Secrets.DISCORD_WEBHOOK_URL))
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString("{\"content\": \"$message\"}"))
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())

        if (response.statusCode() == 204) {
            println("Message sent successfully!")
        } else {
            System.err.println("Failed to send message. HTTP status code: " + response.statusCode())
        }
    }
}