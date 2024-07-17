package com.yudha.mysimplecleanarchitecture.di

import com.yudha.mysimplecleanarchitecture.data.IMessageDataSource
import com.yudha.mysimplecleanarchitecture.data.MessageDataSource
import com.yudha.mysimplecleanarchitecture.data.MessageRepository
import com.yudha.mysimplecleanarchitecture.domain.IMessageRepository
import com.yudha.mysimplecleanarchitecture.domain.MessageInteractor
import com.yudha.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}