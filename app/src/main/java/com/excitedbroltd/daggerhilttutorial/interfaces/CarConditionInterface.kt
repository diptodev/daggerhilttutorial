package com.excitedbroltd.daggerhilttutorial

import javax.inject.Inject

interface CarConditionInterface {
    fun carCondition(): String
}

class CarCondition @Inject constructor() : CarConditionInterface {
    override fun carCondition() = "New"
}

class CarConditionOld(private val condition: String) : CarConditionInterface {
    override fun carCondition(): String {
        return condition
    }

}