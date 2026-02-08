package org.example.project

class Greeting {
    private val platform = getPlatformName()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}