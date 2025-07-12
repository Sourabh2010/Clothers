package com.example.clothers.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class ProductDataModels(
    var name : String = "",
    var description : String = "",
    var price : String = "",
    var finalPrice : String = "",
    var category : String = "",
    var image : String = "",
    var date : Long = System.currentTimeMillis(),
    var createdBy:String = "",
    var availableUnits:Int = 0,
    var productId:String="",
)
