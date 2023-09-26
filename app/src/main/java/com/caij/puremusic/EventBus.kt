package com.caij.puremusic

object EventBus {

    private val map: HashMap<String, ArrayList<EventObserver>> = HashMap()

    fun register(key: String, eventObserver: EventObserver) {
        var eventObservers = map[key]
        if (eventObservers == null) {
            eventObservers = ArrayList()
            map[key] = eventObservers
        }
        eventObservers.add(eventObserver)
    }

    fun unregister(key: String, eventObserver: EventObserver) {
        val eventObservers = map[key]
        eventObservers?.remove(eventObserver)
    }

    fun post(key: String, value: Any? = null) {
        val eventObservers = map[key]
        if (eventObservers != null) {
            for (observer in eventObservers) {
                observer.onEvent(key, value)
            }
        }
    }
}

interface EventObserver {
    fun onEvent(key: String, value: Any?)
}