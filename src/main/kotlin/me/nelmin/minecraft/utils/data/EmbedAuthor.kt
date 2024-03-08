package me.nelmin.minecraft.utils.data

import kotlinx.serialization.Serializable

@Serializable
data class EmbedAuthor(
    val name: String,
    val url: String = "",
    val icon_url: String = ""
)
