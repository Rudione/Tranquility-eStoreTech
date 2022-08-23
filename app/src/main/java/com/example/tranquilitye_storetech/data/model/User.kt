package com.example.tranquilitye_storetech.data.model

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    val avatar: String = ""
) {
    constructor(): this(firstName = "", lastName = "", email = "", avatar = "")
}