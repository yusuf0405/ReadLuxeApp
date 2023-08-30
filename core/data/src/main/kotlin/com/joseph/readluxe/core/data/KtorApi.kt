package com.joseph.readluxe.core.data

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.parameter
import io.ktor.http.path
import io.ktor.http.takeFrom
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

abstract class KtorApi {

    private companion object {
        const val API_KEY = "6e63c2317fbe963d76c3bdc2b785f6d1"
        const val BASE_URL = "https://api.themoviedb.org/"
    }

    val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    fun HttpRequestBuilder.pathUrl(path: String) {
        url {
            takeFrom(com.joseph.readluxe.core.data.KtorApi.BASE_URL)
            path("3", path)
            parameter("api_key", com.joseph.readluxe.core.data.KtorApi.API_KEY)
        }
    }
}