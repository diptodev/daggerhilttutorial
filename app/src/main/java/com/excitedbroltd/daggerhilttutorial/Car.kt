package com.excitedbroltd.daggerhilttutorial

import android.util.Log

class Car(private val carEngine: CarEngine, private val carCondition: CarCondition) {

    fun carColor() {
        Log.d("DAGGERTESTER", "engineS tatus: ${carEngine.engineStatus()}")
        Log.d("DAGGERTESTER", "car Condition: ${carCondition.carCondition()}")
        Log.d("DAGGERTESTER", "car Color:  red")
    }

}