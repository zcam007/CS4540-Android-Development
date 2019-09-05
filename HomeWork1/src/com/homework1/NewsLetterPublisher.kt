package com.homework1
import java.util.ArrayList

interface Subject{
    fun subscribe(o:Observer)
    fun unsubscribe(o:Observer)
    fun notifyUpdate(message:String)
}

object NewsLetterPublisher:Subject {
    private val observers = ArrayList<Observer>()

    override fun subscribe(o: Observer) {
      observers.add(o);
    }

    override fun unsubscribe(o: Observer) {
       observers.remove(o)
    }
    override fun notifyUpdate(message:String) {
        for (o in observers) {
            o.update(message)
        }
    }
    init {
        println("********Publisher Initialized********")
    }

    fun print() = println("Printing with object: $this")
}