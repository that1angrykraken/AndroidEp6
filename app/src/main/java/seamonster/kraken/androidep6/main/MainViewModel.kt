package seamonster.kraken.androidep6.main

import androidx.lifecycle.ViewModel
import seamonster.kraken.androidep6.data.UserRepository

class MainViewModel : ViewModel() {
    private val repo = UserRepository()
    val users = repo.getUsers()
}