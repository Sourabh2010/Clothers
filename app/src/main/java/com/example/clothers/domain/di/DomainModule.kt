package com.example.clothers.domain.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

//    @Provides
//    fun provideRepo(firebaseAuth: FirebaseAuth, firebaseFirestore: FirebaseFirestore){
//        return repoImpl(firebaseAuth, firebaseFirestore)
//    }
}