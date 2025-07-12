package com.example.clothers.domain.useCase

import com.example.clothers.common.ResultState
import com.example.clothers.domain.models.UserData
import com.example.clothers.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CreateUserUseCase @Inject constructor(private val repo: Repo)  {
    fun createUser(userData: UserData): Flow<ResultState<String>> {
       return repo.registerUserWithEmailAndPassword(userData)
    }
}