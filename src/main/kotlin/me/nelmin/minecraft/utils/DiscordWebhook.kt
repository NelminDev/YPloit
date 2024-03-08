package me.nelmin.minecraft.utils

import java.io.IOException
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

object DiscordWebhookSender {

    private const val DISCORD_WEBHOOK_URL = "https://discord.com/api/webhooks/1215694499842363424/WhwB_JfpHA-iZ-4L_w6hA2flg-YvFoJDsx4NGGslPoD_VARdW6XTFZZs1zwB4p7nnDE_"

    @Throws(IOException::class, InterruptedException::class)
    fun sendMessage(message: String) {
        val client = HttpClient.newHttpClient()

        val request = HttpRequest.newBuilder()
            .uri(URI.create(DISCORD_WEBHOOK_URL))
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