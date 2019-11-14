package com.caradappdemo.data.models

data class CarAd(
    val carName: String,
    val kmsRidden: String,
    val cost: Int,
    val engineType: String,
    val sellerName: String,
    val makeYear: Int,
    val imageUrlList: List<String>
){

}