package com.excitedbroltd.daggerhilttutorial

import javax.inject.Inject

interface CarEngineInterface {
    fun engineStatus(): String
}

class CarEngine @Inject constructor() : CarEngineInterface {
    override fun engineStatus(): String {
        return "Good"
    }
}

class CarEngineBad() : CarEngineInterface {
    override fun engineStatus(): String {
        return "BAD"
    }

}

