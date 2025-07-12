package com.example.clothers.domain.models

data class UserData(
    val firstName: String="",
    val lastName: String="",
    val email: String="",
    val password: String="",
    val address: String="",
    val phoneNumber: String="",
    val profileImage: String=""
){
    fun toMap(): Map<String, Any>{
        val map = mutableMapOf<String, Any>()
        map["firstName"] = firstName
        map["lastName"] = lastName
        map["email"] = email
        map["password"] = password
        map["address"] = address
        map["phoneNumber"] = phoneNumber
        map["profileImage"] = profileImage
        return map
    }
}
data class UserDataParent(
    val nodeId: String="",
    val userData: UserData=UserData()
)
