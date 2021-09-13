package com.rajuyadav.animexmanga.modelclass

data class ModelResponseForceUpdate(
    var success: String,
    var message: String,
    var data: ModelResponseForceUpdateData
)

data class ModelResponseForceUpdateData(
    var normal_update: String = "",
    var force_update: String = ""
)