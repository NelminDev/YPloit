package me.nelmin.minecraft.utils.data

import kotlinx.serialization.Serializable

@Serializable
data class EmbedFooter(
    val text: String,
    val icon_url: String = ""
)
