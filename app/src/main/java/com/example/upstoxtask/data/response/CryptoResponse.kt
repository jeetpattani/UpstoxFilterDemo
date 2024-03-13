package com.example.upstoxtask.data.response

import com.google.gson.annotations.SerializedName

data class CryptoResponse(
    @SerializedName("cryptocurrencies" ) var cryptocurrencies : ArrayList<Cryptocurrencies> = arrayListOf()
)

data class Cryptocurrencies (
    @SerializedName("name"      ) var name     : String?  = null,
    @SerializedName("symbol"    ) var symbol   : String?  = null,
    @SerializedName("is_new"    ) var isNew    : Boolean? = null,
    @SerializedName("is_active" ) var isActive : Boolean? = null,
    @SerializedName("type"      ) var type     : String?  = null,
)