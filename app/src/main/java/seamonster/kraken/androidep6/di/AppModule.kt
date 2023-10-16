package seamonster.kraken.androidep6.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import seamonster.kraken.androidep6.data.RemoteDataSource

@Module
object AppModule {

    @Provides
    fun provideRemoteDataSource() : RemoteDataSource {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://randomuser.me/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(RemoteDataSource::class.java)
    }

}