package com.homework1


interface Observer {
    fun update(m: String)
}
class Subscriber(pub:NewsLetterPublisher,name: String):Observer {
    private var publisher = pub
    private var subscriberName=name
    override fun update(m: String) {
    //    println(m)
        printNewsletter(m)
    }

    fun subscribe(){
        publisher.attach(this)
        println("$subscriberName Subscribed..")
    }
    fun unsubscribe(){
        publisher.detach(this)
        println("$subscriberName Unsubscribed..")
    }

   private fun printNewsletter(newsletter: String){
       println(newsletter)
   }
}
