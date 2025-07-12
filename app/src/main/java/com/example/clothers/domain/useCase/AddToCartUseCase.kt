package com.example.clothers.domain.useCase

import com.example.clothers.common.ResultState
import com.example.clothers.domain.models.CardDataModels
import com.example.clothers.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddToCartUseCase @Inject constructor(private val repo: Repo){
    fun addToCart(cardDataModels: CardDataModels): Flow<ResultState<String>>{
            return repo.addToCart(cardDataModels)

    }
}