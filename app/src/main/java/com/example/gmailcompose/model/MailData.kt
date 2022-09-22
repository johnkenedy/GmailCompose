package com.example.gmailcompose.model

data class MailData(
    val mailId: Int,
    val username: String,
    val subject: String,
    val body: String,
    val timeStamp: String = ""
)
