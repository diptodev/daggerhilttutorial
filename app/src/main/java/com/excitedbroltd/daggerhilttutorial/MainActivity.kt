package com.excitedbroltd.daggerhilttutorial

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var carInjection: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // constructor injection
//        val daggerCarComponent = DaggerCarComponent.builder().build()
//        daggerCarComponent.getCarInstance().carColor()
        val mfieldInjection = DaggerCarComponent.builder().build()
        mfieldInjection.fieldInjection(this)
        carInjection.carColor()
    }
}