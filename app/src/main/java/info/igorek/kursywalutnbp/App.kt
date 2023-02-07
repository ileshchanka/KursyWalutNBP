package info.igorek.kursywalutnbp

import android.app.Application
import info.igorek.kursywalutnbp.di.AppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        AppComponent.init(applicationContext)
    }
}
