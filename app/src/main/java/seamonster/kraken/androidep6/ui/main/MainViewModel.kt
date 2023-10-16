package seamonster.kraken.androidep6.ui.main

import seamonster.kraken.androidep6.data.UserRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(val repo: UserRepository) {
    val users = repo.getUsers()
}