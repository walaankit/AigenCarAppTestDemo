package com.caradappdemo.data.repo

import androidx.lifecycle.LiveData
import com.caradappdemo.data.models.CarAd

class HomeRepoDataSource : HomeRepo{
    override fun getAllCarAds(): LiveData<List<CarAd>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}