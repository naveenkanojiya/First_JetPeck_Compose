package com.example.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun NotificationScreen() {
    var count: MutableState<Int> = rememberSaveable { mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        NotificationCounter(count.value) { count.value++ }
        MassageBar(count.value)
    }
}

@Composable
fun MassageBar(count: Int) {
    Card(
        elevation = CardDefaults.cardElevation(5.dp),
    ) {
        Row(
            Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Image(
                painter = painterResource(id = R.drawable.baseline_favorite_24),
                contentDescription = "",
                Modifier.padding(4.dp)
            )
            Text(text = "Message sent so far - $count")
        }

    }
}

@Composable
fun NotificationCounter(count: Int, increment: () -> Int) {
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "You have sent $count notification")
        Button(onClick = {
            increment()
        }) {
            Text(text = "Send Notification")

        }

    }
}