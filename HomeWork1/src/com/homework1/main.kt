package com.homework1


     fun test() {
    //val shark = NewsLetterPublisher.print()
}
    fun main()
    {
        test();
        val mike=Subscriber(NewsLetterPublisher);
        val kevin=Subscriber(NewsLetterPublisher);
        val esmerelda=Subscriber(NewsLetterPublisher);
        val hector=Subscriber(NewsLetterPublisher);
        val letty=Subscriber(NewsLetterPublisher);
            mike.subscribe();
            kevin.subscribe();
            esmerelda.subscribe();
            hector.subscribe();
            letty.subscribe();
//        // "Kevin", "Esmerelda", "Hector", "Letty"
//        val kevin=Subscriber()
//        val esmerelda=Subscriber()
//        val hector=Subscriber();
//        val letty=Subscriber()
//        NewsLetterPublisher.subscribe(mike)
//        NewsLetterPublisher.subscribe(kevin)
//        NewsLetterPublisher.subscribe(esmerelda)
//        NewsLetterPublisher.subscribe(hector)
//        NewsLetterPublisher.subscribe(letty)
    for (i in 0..20) {
        if(i==4){
            mike.unsubscribe()
            esmerelda.unsubscribe()
            println("\nMike and Esmerelda has unsubscribed!!\n")
        }
        if(i==11){
            kevin.unsubscribe()
            hector.unsubscribe()
            println("\nKevin and Hector has unsubscribed!!\n")

        }
        NewsLetterPublisher.notifyUpdate("Exciting news! We have raised $i million dollars!");
//         NewsLetterPublisher.notifyUpdate("Hello This is second message");
//
    }
    }
