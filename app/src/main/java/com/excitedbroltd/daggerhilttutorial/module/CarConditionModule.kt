package com.excitedbroltd.daggerhilttutorial.module

import com.excitedbroltd.daggerhilttutorial.CarCondition
import com.excitedbroltd.daggerhilttutorial.CarConditionInterface
import com.excitedbroltd.daggerhilttutorial.CarConditionOld
import com.excitedbroltd.daggerhilttutorial.annotationprocessor.CarContitionAnotNew
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class CarConditionModule {
    @Named("old")
    @Provides
    fun carConditionOld(): CarConditionInterface {
        return CarConditionOld()
    }

    @CarContitionAnotNew
    @Provides
    fun carConditionNew(carCondition: CarCondition): CarConditionInterface {
        return carCondition
    }


}