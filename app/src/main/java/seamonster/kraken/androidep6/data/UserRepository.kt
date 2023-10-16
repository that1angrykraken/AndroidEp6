package seamonster.kraken.androidep6.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class UserRepository @Inject constructor(val remoteDataSource: RemoteDataSource) {
    companion object{
        private const val TAG = "UserRepository"
    }

    fun getUsers(): MutableLiveData<List<User>> {
        val data = MutableLiveData<List<User>>()
        remoteDataSource.getUsers().enqueue(object : Callback<DataModel> {
            override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {
                if (response.isSuccessful) {
                    data.value = response.body()?.results
                }
                Log.d(TAG, "onResponse: ${response.message()}")
            }

            override fun onFailure(call: Call<DataModel>, t: Throwable) {
                Log.e(TAG, "onFailure: failed", t)
            }

        })
        return data
    }
}