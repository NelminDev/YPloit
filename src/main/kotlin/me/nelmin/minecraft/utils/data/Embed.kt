package me.nelmin.minecraft.utils.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.time.Instant

@Serializable
data class Embed(
    val title: String,
    val description: String,
    val url: String = "https://github.com/NelminDev/YPloit/",
    val color: String = "#b49f00",
    val fields: List<EmbedField>,
    val author: EmbedAuthor = EmbedAuthor("NelminDev"),
    val footer: EmbedFooter = EmbedFooter("YPloit"),
    val timestamp: String = "${Instant.now().epochSecond}",
    val image: EmbedImage = EmbedImage(""),
    val thumbnail: EmbedImage = EmbedImage("")
) {
    fun json(): String {
        return Json.encodeToString(serializer(), this)
    }
}