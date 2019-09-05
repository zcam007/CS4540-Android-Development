package com.homework1


     fun test() {
    //®val shark = NewsLetterPublisher.print()
}
    fun main()
    {
        test();
        val mike=Subscriber()
        // "Kevin", "Esmerelda", "Hector", "Letty"
        val kevin=Subscriber()
        val esmerelda=Subscriber()
        val hector=Subscriber();
        val letty=Subscriber()
        NewsLetterPublisher.subscribe(mike)
        NewsLetterPublisher.subscribe(kevin)
        NewsLetterPublisher.subscribe(esmerelda)
        NewsLetterPublisher.subscribe(hector)
        NewsLetterPublisher.subscribe(letty)

        NewsLetterPublisher.notifyUpdate("Hello This is a message");
    }
