package com.wonx.booknest.di

import com.wonx.booknest.repository.BooksRepository
import com.wonx.booknest.repository.BooksRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface BookModule {

    @Binds
    fun bindBooksRepository(
        implementation: BooksRepositoryImpl
    ): BooksRepository
}
