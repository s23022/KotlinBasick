package ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap2

data class User12(val id: Int, var name: String, var address: String)

fun getUser12(id: Int): User12 {
    return User12(id, "takahata", "Tokyo")
}
fun updateUser(id: Int, newName: String, newAddress: String) {
    val user = getUser12(id).apply {
        this.name = newName
        this.address = newAddress
    }
    println(user)
}