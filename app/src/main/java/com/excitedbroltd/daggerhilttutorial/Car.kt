package com.excitedbroltd.daggerhilttutorial

import android.util.Log
import com.excitedbroltd.daggerhilttutorial.annotationprocessor.CarContitionAnotNew
import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(
    @Named("old") private val carConditionInterface: CarConditionInterface,
    private val carEngineInterface: CarEngineInterface
) {

    fun carColor() {
        Log.d("DAGGERTESTER", "engineS tatus: ${carEngineInterface.engineStatus()}")
        Log.d("DAGGERTESTER", "car Condition: ${carConditionInterface.carCondition()}")
        Log.d("DAGGERTESTER", "car Color:  red")
    }

}