package com.example.clothers.domain.useCase

import com.example.clothers.common.ResultState
import com.example.clothers.domain.models.ProductDataModels
import com.example.clothers.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddToWishlistUseCase @Inject constructor(private val repo: Repo)  {
    fun addToWishlist(productDataModels: ProductDataModels): Flow<ResultState<String>> {
        return repo.addToWishList(productDataModels)
    }
}