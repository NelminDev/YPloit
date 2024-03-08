package me.nelmin.minecraft.utils.data

import kotlinx.serialization.Serializable

@Serializable
data class EmbedField(
    val name: String,
    val value: String,
    val inline: Boolean
)
