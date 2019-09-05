package com.homework1

interface Subject{
    fun attach(o:Observer)
    fun detach(o:Observer)
    fun notifyUpdate(message:String)
}

//Singleton class
object NewsLetterPublisher:Subject {
    private val observers = ArrayList<Observer>()

    override fun attach(o: Observer) {
      observers.add(o);
    }
    override fun detach(o: Observer) {
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