package com.example.clothers.domain.repo

import android.net.Uri
import com.example.clothers.common.ResultState
import com.example.clothers.domain.models.BannerDataModels
import com.example.clothers.domain.models.CardDataModels
import com.example.clothers.domain.models.CategoryDataModels
import com.example.clothers.domain.models.ProductDataModels
import com.example.clothers.domain.models.UserData
import com.example.clothers.domain.models.UserDataParent
import kotlinx.coroutines.flow.Flow

interface Repo {
    fun registerUserWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun loginUserWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun getUserById(uid:String): Flow<ResultState<String>>
    fun updateUserData(userDataParent: UserDataParent): Flow<ResultState<String>>
    fun userProfileImage(uri: Uri): Flow<ResultState<String>>
    fun getCategoriesInLimit(): Flow<ResultState<List<CategoryDataModels>>>
    fun getProductsInLimit(): Flow<ResultState<List<ProductDataModels>>>
    fun getAllProducts(): Flow<ResultState<List<ProductDataModels>>>
    fun getProductById(productId: String): Flow<ResultState<ProductDataModels>>
    fun addToCart(cardDataModels: CardDataModels): Flow<ResultState<String>>
    fun addToWishList(productDataModels: ProductDataModels): Flow<ResultState<String>>
    fun getAllWishList(): Flow<ResultState<List<ProductDataModels>>>
    fun getAllCart(): Flow<ResultState<List<CardDataModels>>>
    fun getAllCategories(): Flow<ResultState<List<CategoryDataModels>>>
    fun getCheckout(productId: String): Flow<ResultState<ProductDataModels>>
    fun getBanners():Flow<ResultState<List<BannerDataModels>>>
    fun getSpecificCategoryItem(categoryName: String): Flow<ResultState<List<ProductDataModels>>>
    fun getAllSuggestedProducts(): Flow<ResultState<List<ProductDataModels>>>
}