package com.example.upstoxtask.network.service

import com.example.upstoxtask.data.response.CryptoResponse
import com.example.upstoxtask.network.urlfactory.UrlFactory
import retrofit2.Response
import retrofit2.http.GET

interface CryptoService {

    @GET(UrlFactory.COINS_TOKEN)
    suspend fun cryptoCurrencies() : Response<CryptoResponse>

}