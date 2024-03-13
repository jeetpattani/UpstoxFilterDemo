package com.example.upstoxtask.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.upstoxtask.data.response.Cryptocurrencies
import com.example.upstoxtask.databinding.RowCryptoBinding
import com.example.upstoxtask.utils.gone
import com.example.upstoxtask.utils.visible

class CryptoAdapter : RecyclerView.Adapter<CryptoAdapter.ViewHolder>() {

    var mList = ArrayList<Cryptocurrencies>()

    inner class ViewHolder(private var binding: RowCryptoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Cryptocurrencies) = with(binding) {
            textViewName.text = item.name
            textViewSymbol.text = item.symbol.toString()

            if (item.isActive == true) {
                if (item.isNew == true) imageViewNewCrypto.visible()
                else imageViewNewCrypto.gone()

                if (item.type == "coin") imageViewActiveCoin.visible()
                else imageViewActiveCoin.gone()

                if (item.type == "token") imageViewActiveToken.visible()
                else imageViewActiveToken.gone()

                imageViewInactiveCrypto.gone()
            } else {
                imageViewActiveCoin.gone()
                imageViewActiveToken.gone()
                imageViewNewCrypto.gone()
                imageViewInactiveCrypto.visible()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RowCryptoBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mList[position])
    }

}