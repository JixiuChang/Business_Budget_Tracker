package com.example.businessbudgettracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform