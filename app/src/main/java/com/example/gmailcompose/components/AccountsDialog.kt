package com.example.gmailcompose.components

import android.annotation.SuppressLint
import android.text.style.IconMarginSpan
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PermDataSetting
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.gmailcompose.R
import com.example.gmailcompose.accountList
import com.example.gmailcompose.buttonList
import com.example.gmailcompose.model.Account
import com.example.gmailcompose.model.ButtonConfig

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false },
    properties = DialogProperties()
    ) {
        AccountsDialogUI(openDialog = openDialog)
    }
}

@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier, openDialog: MutableState<Boolean>) {
    Card {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)
        ) {
            Row(modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { openDialog.value = false }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Close Button")
                }
                Image(
                    painter = painterResource(id = R.drawable.google_2015_logo_svg),
                    contentDescription = "",
                    modifier
                        .size(30.dp)
                        .padding(end = 40.dp)
                        .weight(2.0f)
                )
            }

            AccountItem(account = accountList[0])

            Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Card(
                    modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, Color.Gray)
                ) {
                    Text(
                        text = "Google Account",
                        modifier.padding(8.dp),
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier.width(10.dp))
            }
            Divider(modifier.padding(top = 16.dp))

            AccountItem(account = accountList[1], modifier = modifier)
            AccountItem(account = accountList[2], modifier = modifier)
            ButtonConfigItem(buttonConfig = buttonList[0], modifier = modifier)
            ButtonConfigItem(buttonConfig = buttonList[1], modifier = modifier)
            Divider(modifier.padding(top = 16.dp, bottom = 16.dp))

            Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Text(text = "Privacy Policy")
                Card(
                    modifier
                        .padding(top = 10.dp)
                        .size(5.dp),
                    shape = CircleShape,
                    backgroundColor = Color.Black
                ) {}
                Text(text = "Terms Of Service")
            }

        }
    }
}

@Composable
private fun AccountItem(modifier: Modifier = Modifier, account: Account) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp)
    ) {
        Image(
            painter = painterResource(id = account.profileImage),
            contentDescription = "Profile Image",
            modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.White)
        )
        Column(
            modifier
                .weight(2.0f)
                .padding(start = 16.dp, bottom = 16.dp)
        ) {
            Text(text = account.userName, fontWeight = FontWeight.SemiBold)
            Text(text = account.email)
        }
        Text(text = account.unReadMails, modifier.padding(end = 16.dp))
    }
}

@Composable
private fun ButtonConfigItem(modifier: Modifier = Modifier, buttonConfig: ButtonConfig) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 16.dp, bottom = 5.dp)
    ) {
        Icon(
            buttonConfig.icon,
            contentDescription = "Profile Image",
            modifier
                .padding(start = 12.dp)
                .size(20.dp)
                .clip(CircleShape)
                .background(Color.White)
        )
        Column(
            modifier
                .weight(2.0f)
                .padding(start = 16.dp)
        ) {
            Text(text = buttonConfig.title, fontWeight = FontWeight.SemiBold)
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Preview
@Composable
fun AccountsDialogUIPreview() {
    AccountsDialogUI(openDialog = mutableStateOf(false))
}