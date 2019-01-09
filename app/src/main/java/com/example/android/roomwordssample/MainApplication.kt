package com.example.android.roomwordssample

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.core.Koin
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

class MainApplication : Application() {
    companion object {

    }

    override fun onCreate() {
        super.onCreate()
        Koin
        startKoin(this, listOf(myModule))
    }
}

val myModule: Module = module {
    single { }
}