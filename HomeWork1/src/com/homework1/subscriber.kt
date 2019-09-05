package com.homework1


interface Observer {
    fun update(m: String)
}
class Subscriber:Observer {


    override fun update(m: String) {
    println(m)
    }

    fun subscribe(){

    }
}