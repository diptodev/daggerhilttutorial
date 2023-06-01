package com.excitedbroltd.daggerhilttutorial

import dagger.Component

@Component
interface CarComponent {
    fun getCarInstance(): Car
}