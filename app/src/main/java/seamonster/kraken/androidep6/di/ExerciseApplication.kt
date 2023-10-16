package seamonster.kraken.androidep6.di

import android.app.Application

class ExerciseApplication : Application() {
    val appComponent = DaggerAppComponent.create()
}