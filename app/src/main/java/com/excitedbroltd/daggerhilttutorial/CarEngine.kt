package com.excitedbroltd.daggerhilttutorial

import javax.inject.Inject

class CarEngine @Inject constructor() {
    fun engineStatus(): String {
        return "Good"
    }
}