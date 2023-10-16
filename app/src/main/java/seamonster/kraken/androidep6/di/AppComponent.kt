package seamonster.kraken.androidep6.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import seamonster.kraken.androidep6.ui.main.MainActivity
import seamonster.kraken.androidep6.ui.main.MainViewModel

@Component(modules = [AppModule::class])
interface AppComponent {
    fun mainViewModel() : MainViewModel

    fun inject(activity: MainActivity)

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun setApplication(application: Application): Builder
//
//        fun build(): AppComponent
//    }
}