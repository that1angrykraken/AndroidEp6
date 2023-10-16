package seamonster.kraken.androidep6.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import seamonster.kraken.androidep6.databinding.ActivityMainBinding
import seamonster.kraken.androidep6.di.ExerciseApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    companion object{
        private const val TAG = "MainActivity"
    }

    @Inject lateinit var viewModel: MainViewModel

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val exerciseApplication = application as ExerciseApplication
        val appComponent = exerciseApplication.appComponent
        appComponent.inject(this)

        val adapter = MainListAdapter()
        binding.rvUsers.adapter = adapter
        binding.rvUsers.layoutManager = LinearLayoutManager(this)

        viewModel.users.observeForever {
            adapter.data = it
            adapter.notifyDataSetChanged()
            binding.indicatorLoading.visibility = View.GONE
            Log.d(TAG, "observer: data changed")
        }
    }
}