package com.caradappdemo.ui.home

import androidx.lifecycle.LiveData
import com.caradappdemo.data.models.CarAd
import com.caradappdemo.data.repo.HomeRepo
import com.caradappdemo.data.repo.HomeRepoDataSource

class HomeViewModel {
    //HomeRepo is at present generated using lazy loading, can be injected into the
    //constructor if dependency injection like Dagger is used
    private val homeRepo: HomeRepo by lazy {
        HomeRepoDataSource()
    }

    fun getAllCarAds(): LiveData<List<CarAd>>{
        return homeRepo.getAllCarAds()
    }
}