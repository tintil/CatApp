package com.example.catapp

import android.app.Application
import com.example.catapp.di.components.DaggerCatApplicationComponent

class CatApplication: Application() {

    val appComponent = DaggerCatApplicationComponent.create();
}