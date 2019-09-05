package com.homework1

 interface Observer {
    fun update(m: Message)
}
class subscriber:Observer {


    override fun update(m: Message) {

    }

    fun subscribe(){

    }
}