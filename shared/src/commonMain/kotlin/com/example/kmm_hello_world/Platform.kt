package com.example.kmm_hello_world

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform