package com.emreyurtseven.hellokmm

class Greeting {
    fun greeting(): String {
        return "Hello KMM, ${Platform().platform}!"
    }
}