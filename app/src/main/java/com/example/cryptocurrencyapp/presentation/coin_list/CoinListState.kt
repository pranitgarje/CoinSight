package com.example.cryptocurrencyapp.presentation.coin_list

import com.example.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val filteredCoins: List<Coin> = emptyList(),
    val searchQuery: String = "",
    val error: String = ""
)