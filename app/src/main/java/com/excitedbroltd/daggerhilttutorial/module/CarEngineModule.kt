package com.excitedbroltd.daggerhilttutorial.module

import com.excitedbroltd.daggerhilttutorial.CarEngine
import com.excitedbroltd.daggerhilttutorial.CarEngineBad
import com.excitedbroltd.daggerhilttutorial.CarEngineInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
  class CarEngineModule {
    @Provides
    fun carEngineBad(): CarEngineInterface {
        return CarEngineBad()
    }

    @Provides
      fun carEngineGood(carEngine: CarEngine): CarEngine {
          return CarEngine()
    }
}