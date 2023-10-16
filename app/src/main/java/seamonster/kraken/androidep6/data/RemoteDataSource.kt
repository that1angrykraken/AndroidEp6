package seamonster.kraken.androidep6.data

import retrofit2.Call
import retrofit2.http.GET

interface RemoteDataSource {
    @GET("api/?results=20")
    fun getUsers() : Call<DataModel>
}