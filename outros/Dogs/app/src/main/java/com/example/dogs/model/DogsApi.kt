package com.example.dogs.model

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Url

interface DogsApi {

    @GET("DevTides/DogsApi/master/dogs.json")
    //@GET("public_html/warren/teste.php")
    fun getDogs():Single<List<DogBreed>>
    //pode usar mais de um get?
    // pode usar o metodo post aqui também

}