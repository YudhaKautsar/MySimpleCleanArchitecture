package com.yudha.mysimplecleanarchitecture.data

import com.yudha.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}