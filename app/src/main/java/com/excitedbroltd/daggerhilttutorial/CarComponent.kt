package com.excitedbroltd.daggerhilttutorial

import com.excitedbroltd.daggerhilttutorial.module.CarConditionModule
import com.excitedbroltd.daggerhilttutorial.module.CarEngineModule
import dagger.Component

@Component(modules = [CarEngineModule::class, CarConditionModule::class])
interface CarComponent {
    //constructor injection
//    fun getCarInstance(): Car
//    fun getCarEngine():CarEngine

    // field injection
    fun fieldInjection(mainActivity: MainActivity)

}