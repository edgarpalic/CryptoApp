package com.edgar.cryptoapp.domain.repository

import com.edgar.cryptoapp.data.remote.dto.CoinDetailDto
import com.edgar.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}