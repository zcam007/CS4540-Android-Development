package com.homework1


interface Observer {
    fun update(m: String)
}
class Subscriber(pub:NewsLetterPublisher,val name: String = "name"):Observer {
    private var publisher = pub
    override fun update(m: String) {
    //    println(m)
        printNewsletter(m)
    }

    fun subscribe(){
        publisher.attach(this)
    }
    fun unsubscribe(){
        publisher.detach(this)
    }

   private fun printNewsletter(newsletter: String){
       println(newsletter)
   }
}