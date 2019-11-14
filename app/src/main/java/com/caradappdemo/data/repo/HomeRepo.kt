package com.caradappdemo.data.repo

import androidx.lifecycle.LiveData
import com.caradappdemo.data.models.CarAd

interface HomeRepo {
    fun getAllCarAds(): LiveData<List<CarAd>>
}