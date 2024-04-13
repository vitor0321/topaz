package com.walcker.topaz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform