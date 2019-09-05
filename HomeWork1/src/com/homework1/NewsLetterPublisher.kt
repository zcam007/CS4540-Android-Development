package com.homework1
import java.util.ArrayList

interface Subject{
    fun attach(o:Observer)
    fun detach(o:Observer)
    fun notifyUpdate(message:String)
}

object NewsLetterPublisher:Subject {
    private val observers = ArrayList<Observer>()

    override fun attach(o: Observer) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun detach(o: Observer) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun notifyUpdate(message:String) {
        println("hello")
    }
    init {
        println("Initializing with object: $this")
    }

    fun print() = println("Printing with object: $this")
}