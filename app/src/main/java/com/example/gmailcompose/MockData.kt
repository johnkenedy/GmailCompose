package com.example.gmailcompose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PermDataSetting
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.material.icons.outlined.ManageAccounts
import com.example.gmailcompose.model.Account
import com.example.gmailcompose.model.ButtonConfig
import com.example.gmailcompose.model.MailData

val mailList = listOf(
    MailData(
        mailId = 1,
        username = "John Kenedy",
        subject = "Weekly Memes News",
        body = "Hello John Kenedy we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 2,
        username = "Matheus Guimarães",
        subject = "Job Application",
        body = "Hello John Kenedy we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 3,
        username = "Leonardo Mendes",
        subject = "French Classes",
        body = "Hello John Kenedy we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 4,
        username = "Paulo Victor",
        subject = "College Degree",
        body = "Hello Paulão big skull we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 5,
        username = "Karla without surname",
        subject = "Aaaaaaaaaaaaaaaah",
        body = "Hello John Kenedy we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 6,
        username = "Alessandra Ap.",
        subject = "Weekly Memes News",
        body = "Hello John Kenedy we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 7,
        username = "Leticia Ketley",
        subject = "Weekly Memes News",
        body = "Hello John Kenedy we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 8,
        username = "John Kenedy",
        subject = "Weekly Memes News",
        body = "Hello John Kenedy we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 9,
        username = "John Kenedy",
        subject = "Weekly Memes News",
        body = "Hello John Kenedy we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 10,
        username = "John Kenedy",
        subject = "Weekly Memes News",
        body = "Hello John Kenedy we got exciting addition to the memes list",
        timeStamp = "20:10"
    ),
)

val accountList = listOf(
    Account(
        profileImage = R.drawable.americandog,
        userName = "John Kenedy",
        email = "JohnKenedy@gmail.com",
        unReadMails = "99+"
    ),
    Account(
        profileImage = R.drawable.chrisrock,
        userName = "Chris Rock",
        email = "chris_rocknroll@gmail.com",
        unReadMails = "80"
    ),
    Account(
        profileImage = R.drawable.madame,
        userName = "Madame Merci",
        email = "mercymadame@gmail.com",
        unReadMails = "99+"
    )
)

val buttonList = listOf(
    ButtonConfig(icon = Icons.Default.PersonAddAlt, title = "Add Another Account"),
    ButtonConfig(icon = Icons.Outlined.ManageAccounts, title = "Manage Accounts")
)