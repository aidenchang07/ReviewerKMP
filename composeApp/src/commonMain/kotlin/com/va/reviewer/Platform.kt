package com.va.reviewer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform