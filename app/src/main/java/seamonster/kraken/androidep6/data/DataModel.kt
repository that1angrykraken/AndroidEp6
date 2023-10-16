package seamonster.kraken.androidep6.data

data class DataModel(val results: List<User>, val info: Info)

data class User(
    val gender: String, // 3
    val email: String, // 4
    val phone: String, // 5
    val cell: String,
    val nat: String,
    val name: Name, // 1
    val dob: DoB, // 2
    val registered: Registered,
    val id: Id,
    val picture: Picture, // 0
    val login: Login,
    val location: Location // 6
)

data class Name(val title: String, val first: String, val last: String)

data class DoB(val date: String, val age: Int)

data class Registered(val date: String, val age: Int)

data class Id(val name: String, val value: String)

data class Picture(val large: String, val medium: String, val thumbnail: String)

data class Login(
    val uuid: String,
    val username: String,
    val password: String,
    val salt: String,
    val md5: String,
    val sha1: String,
    val sha256: String
)

data class Location(
    val city: String,
    val state: String,
    val country: String,
    val postcode: Any,
    val street: Street,
    val coordinates: Coordinates,
    val timezone: Timezone
)
data class Street(val number: Int, val name: String)
data class Coordinates(val latitude: String, val longitude: String)
data class Timezone(val offset: String, val description: String)

data class Info(val seed: String, val results: Int, val version: String, val page: Int)

