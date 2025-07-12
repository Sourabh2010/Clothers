package com.example.clothers.domain.useCase

import com.example.clothers.common.ResultState
import com.example.clothers.domain.models.CategoryDataModels
import com.example.clothers.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllCategoryUseCase @Inject constructor(private val repo: Repo)   {
    fun getAllCategoriesUseCase(): Flow<ResultState<List<CategoryDataModels>>> {
        return repo.getAllCategories()
    }
}