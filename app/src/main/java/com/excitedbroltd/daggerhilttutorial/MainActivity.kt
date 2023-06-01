package com.excitedbroltd.daggerhilttutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carEngine = CarEngine()
        val carCondition = CarCondition()
        val car = Car(carEngine,carCondition)
        car.carColor()
    }
}