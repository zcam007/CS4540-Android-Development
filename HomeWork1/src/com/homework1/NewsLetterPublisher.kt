package com.homework1

interface Subject{
    fun attach(o:Observer)
    fun detach(o:Observer)
    fun notifyUpdate(message:String)
    fun setState()
}

//Singleton class
object NewsLetterPublisher:Subject {
    private var observers = ArrayList<Observer>()
    private var x=0;
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
    override fun setState() {
        x++
    }

    init {
        println("******** NewsLetter Publisher Initialized ********")
    }

    fun print() = println("Printing with object: $this")
}