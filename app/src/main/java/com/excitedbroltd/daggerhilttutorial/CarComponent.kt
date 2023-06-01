package com.excitedbroltd.daggerhilttutorial

import dagger.Component

@Component
interface CarComponent {
    //constructor injection
//    fun getCarInstance(): Car
//    fun getCarEngine():CarEngine

    // field injection
    fun fieldInjection(mainActivity: MainActivity)

}