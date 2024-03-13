package com.example.upstoxtask.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.upstoxtask.data.response.CryptoResponse
import com.example.upstoxtask.network.RetrofitProvider
import kotlinx.coroutines.launch

class CryptoViewModel : ViewModel() {

    var cryptoCurrenciesLiveData = MutableLiveData<CryptoResponse>()
    fun cryptoCurrencies() {
        viewModelScope.launch {
            try {
                val response =
                    RetrofitProvider.provideRetrofitObject().cryptoService.cryptoCurrencies()
                if (response.isSuccessful) {
                    val result = response.body()
                    if (!result?.cryptocurrencies.isNullOrEmpty()) {
                        cryptoCurrenciesLiveData.value = response.body()
                    }
                }
            } catch (_: Exception) {
            }
        }
    }

}
