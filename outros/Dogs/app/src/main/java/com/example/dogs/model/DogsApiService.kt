package com.example.dogs.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class DogsApiService {
                            //https://raw.githubusercontent.com/
    private val BASE_URL = "https://raw.githubusercontent.com"
    //private val BASE_URL = "http://3.17.203.124:8080/"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL) // pega os dados
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(DogsApi::class.java)

    fun getDogs() : Single<List<DogBreed>> {
        return api.getDogs()
    }

}