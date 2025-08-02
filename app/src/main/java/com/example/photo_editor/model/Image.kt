package com.example.photo_editor.model

import android.graphics.Bitmap

data class ImageParameters(
    var brightness: Float = 0.0f,
    var contrast: Float = 0.0f
)

data class Image(
    val originalBitmap: Bitmap,
    var imageParameters: ImageParameters
)