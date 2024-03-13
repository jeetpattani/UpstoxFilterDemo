package com.example.upstoxtask.ui.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.viewModels
import com.example.upstoxtask.data.response.Cryptocurrencies
import com.example.upstoxtask.databinding.ActivityMainBinding
import com.example.upstoxtask.ui.adapter.CryptoAdapter
import com.example.upstoxtask.ui.viewmodel.CryptoViewModel

class CryptoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val cryptoViewModel: CryptoViewModel by viewModels()
    private var cryptoCurrenciesList = ArrayList<Cryptocurrencies>()

    private val cryptoAdapter by lazy {
        CryptoAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        callCryptoCurrencies()
        observeCryptoCurrencies()

        setAdapter()
        searchResult()
        filterByChips()
    }

    private fun setAdapter() = with(binding) {
        recyclerViewCrypto.adapter = cryptoAdapter
    }

    private fun searchResult() = with(binding) {
        editTextSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            @SuppressLint("NotifyDataSetChanged")
            override fun afterTextChanged(words: Editable?) {
                val wd = words.toString().lowercase()
                cryptoAdapter.mList.clear()
                if (wd.trim().isNotEmpty()) {
                    val filteredList = cryptoCurrenciesList.filter {
                        it.name?.lowercase()!!.startsWith(wd) || it.symbol?.lowercase()!!
                            .startsWith(wd)
                    }
                    cryptoAdapter.mList.addAll(filteredList)
                } else {
                    cryptoAdapter.mList.addAll(cryptoCurrenciesList)
                }
                cryptoAdapter.notifyDataSetChanged()
            }
        })
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun filterByChips() = with(binding) {
        var activeCoins = false
        var inactiveCoins = false
        var onlyToken = false
        var onlyCoins = false
        var newCoins = false
        chipActiveCoins.setOnCheckedChangeListener { _, isChecked ->
            activeCoins = isChecked
            cryptoAdapter.mList.clear()
            cryptoAdapter.mList.addAll(
                updateFilterResult(
                    activeCoins,
                    inactiveCoins,
                    onlyToken,
                    onlyCoins,
                    newCoins
                )
            )
            cryptoAdapter.notifyDataSetChanged()
        }
        chipInactiveCoins.setOnCheckedChangeListener { _, isChecked ->
            inactiveCoins = isChecked
            cryptoAdapter.mList.clear()
            cryptoAdapter.mList.addAll(
                updateFilterResult(
                    activeCoins,
                    inactiveCoins,
                    onlyToken,
                    onlyCoins,
                    newCoins
                )
            )
            cryptoAdapter.notifyDataSetChanged()
        }
        chipOnlyTokens.setOnCheckedChangeListener { _, isChecked ->
            onlyToken = isChecked
            cryptoAdapter.mList.clear()
            cryptoAdapter.mList.addAll(
                updateFilterResult(
                    activeCoins,
                    inactiveCoins,
                    onlyToken,
                    onlyCoins,
                    newCoins
                )
            )
            cryptoAdapter.notifyDataSetChanged()
        }
        chipOnlyCoins.setOnCheckedChangeListener { _, isChecked ->
            onlyCoins = isChecked
            cryptoAdapter.mList.clear()
            cryptoAdapter.mList.addAll(
                updateFilterResult(
                    activeCoins,
                    inactiveCoins,
                    onlyToken,
                    onlyCoins,
                    newCoins
                )
            )
            cryptoAdapter.notifyDataSetChanged()
        }
        chipNewCoins.setOnCheckedChangeListener { _, isChecked ->
            newCoins = isChecked
            cryptoAdapter.mList.clear()
            cryptoAdapter.mList.addAll(
                updateFilterResult(
                    activeCoins,
                    inactiveCoins,
                    onlyToken,
                    onlyCoins,
                    newCoins
                )
            )
            cryptoAdapter.notifyDataSetChanged()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun updateFilterResult(
        activeCoins: Boolean = false,
        inactiveCoins: Boolean = false,
        onlyToken: Boolean = false,
        onlyCoins: Boolean = false,
        newCoins: Boolean = false,
    ): ArrayList<Cryptocurrencies> {
        val result = ArrayList<Cryptocurrencies>()
        if (activeCoins) {
            val fl = cryptoCurrenciesList.filter { it.type.equals("coin") && it.isActive == true }
            result.addAll(fl)
        }
        if (inactiveCoins) {
            val fl = cryptoCurrenciesList.filter { it.type.equals("coin") && it.isActive == false }
            if (result.containsAll(fl).not()) {
                result.addAll(fl)
            }
        }
        if (onlyToken) {
            val fl =
                cryptoCurrenciesList.filter { it.type.equals("token") && (it.isActive == false || it.isActive == true) }
            if (result.containsAll(fl).not()) {
                result.addAll(fl)
            }
        }
        if (onlyCoins) {
            val fl =
                cryptoCurrenciesList.filter { it.type.equals("coin") && (it.isActive == false || it.isActive == true) }
            if (result.containsAll(fl).not()) {
                result.addAll(fl)
            }
        }
        if (newCoins) {
            val fl =
                cryptoCurrenciesList.filter { it.type.equals("coin") && (it.isNew == true) }
            if (result.containsAll(fl).not()) {
                result.addAll(fl)
            }
        }
        if (!activeCoins && !inactiveCoins && !onlyToken && !onlyCoins && !newCoins) {
            cryptoAdapter.mList.clear()
            cryptoAdapter.mList.addAll(cryptoCurrenciesList)
            cryptoAdapter.notifyDataSetChanged()
        }
        return result
    }


    /**
     * API CALL
     * */

    private fun callCryptoCurrencies() {
        cryptoViewModel.cryptoCurrencies()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun observeCryptoCurrencies() {
        cryptoViewModel.cryptoCurrenciesLiveData.observe(this) { response ->
            try {
                cryptoAdapter.mList.addAll(response.cryptocurrencies)
                cryptoAdapter.notifyDataSetChanged()
                cryptoCurrenciesList.addAll(response.cryptocurrencies)
            } catch (_: Exception) {
            }
        }
    }

}