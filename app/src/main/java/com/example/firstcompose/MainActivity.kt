@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.firstcompose

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.BlogCategory
import com.example.firstcompose.ui.theme.FirstComposeTheme
import com.example.firstcompose.ui.theme.PreviewItem
import kotlin.math.log

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Text(text = "Hello Naveen")
            // TextInput()
            //Uilover()
           // circularImage()
//            BlogCategory()
           // PreviewItem()



//            Column {
//                ListViewItem(
//                    image = R.drawable.user,
//                    name = "Naveen Kanojiya",
//                    occupation = "Android Developer"
//                )
//                ListViewItem(
//                    image = R.drawable.boy,
//                    name = "Rishab Sharma",
//                    occupation = "Web Developer"
//                )
//                ListViewItem(
//                    image = R.drawable.man,
//                    name = "Harsh Varma",
//                    occupation = "React Developer"
//                )
//                ListViewItem(
//                    image = R.drawable.littlehood,
//                    name = "Krishna kumari",
//                    occupation = "IOS Developer"
//                )
//            }


        }

    }
}


@Preview(showBackground = true, name = "Hello Massage", widthDp = 300, heightDp = 500)
@Composable
private fun previewFunction() {


    Text(text = "Hello",
        color = Color.White,
        modifier = Modifier.background(Color.Blue)
            .size(20.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow)

    )


    Text(text = "Hello Naveen",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Green,
        fontSize = 22.sp,
        textAlign = TextAlign.Right
    )

    Image(painter = painterResource(id = R.drawable.heart),
        contentDescription = "Heart Imgae",
        colorFilter = ColorFilter.tint(Color.Blue),
        contentScale = ContentScale.Crop
        )


    Button(onClick = { },
        colors = ButtonDefaults.buttonColors(
           contentColor = Color.Green,
        ),
        ) {
        Text(text = "Hello")
        Image(painter = painterResource(id = R.drawable.heart),
            contentDescription ="Dummy"
        )
    }


    TextField(value = "Hello Naveen",
        onValueChange = {},
        label = { Text(text = "Enter Massage")},
        placeholder ={}
        )


//    Column(
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    )

//    {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }


    Box(contentAlignment = Alignment.BottomCenter) {
        Image(painter = painterResource(id = R.drawable.user), contentDescription = "")
        Image(painter = painterResource(id = R.drawable.heart), contentDescription = "")
    }


     ListViewItem(R.drawable.user,"Naveen Kanojiya","Android Developer")
    Column {
        ListViewItem(
            image = R.drawable.user,
            name = "Naveen Kanojiya",
            occupation = "Android Developer"
        )
        ListViewItem(image = R.drawable.boy, name = "Rishab Sharma", occupation = "Web Developer")
        ListViewItem(image = R.drawable.man, name = "Harsh Varma", occupation = "React Developer")
        ListViewItem(
            image = R.drawable.littlehood,
            name = "Krishna kumari",
            occupation = "IOS Developer"
        )
    }
}



//   Text(text = "Hello",
//       color = Color.Green,
//       Modifier = Modifier.background(Color.Blue)
//           .size(200.dp)
//           .padding(36.dp)
//           .border(4.dp,Color.Red)
//           .clip(CircleShape)
//           .background(Color.Yellow)
//   )




@Composable
fun Uilover() {
    Text(text = "Hello",

        color = Color.White,
        modifier = Modifier
            .clickable { }
            .background(Color.Blue)
            .size(200.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow)


    )
}

@Composable
fun circularImage() {
    Image(

        painter = painterResource(id = R.drawable.jaishreeram),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clickable { }
            .size(200.dp)
            .clip(CircleShape)
            .border(5.dp, Color.Yellow, CircleShape),
        contentDescription = " "
    )

}

@Composable
fun ListViewItem(image: Int, name: String, occupation: String) {
    Row(Modifier.padding(20.dp)) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "",
            Modifier.size(40.dp)
        )
        Column() {
//                Text(
//                    text = "Naveen",
//                    FontWeight = FontWeight.Bold
//                )
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )
        }
    }
}


@ExperimentalMaterial3Api
@Composable
fun TextInput() {
    val state = remember { mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Enter Massage") },
    )
}
