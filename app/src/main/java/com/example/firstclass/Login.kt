package com.example.firstclass

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Login : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding->
                LoginBody(innerPadding)
            }
        }
    }
}
@Composable
fun LoginBody(innerPadding: PaddingValues){
    Column(modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize()
        .background(color = Color.White)) {
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
        Icon(imageVector = Icons.Default.KeyboardArrowLeft,

            contentDescription = null,
//            tint = Color.Green,
            modifier = Modifier
                .height(30.dp)
                .width(30.dp),
        )
            Text(text = "Andrew",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic,
//                    textDecoration = TextDecoration.Underline
                ))
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
            )

        }
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
            ) {
            Image(
                painter = painterResource(R.drawable.profile),
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier.height(100.dp).width(100.dp).clip(
                    shape = RoundedCornerShape(100.dp)
                )
            )
            Column {
                Text(text = "174",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                    ))
                Text(text = "Posts",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                    ))
            }
            Column {
                Text(text = "772k",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                    ))
                Text(text = "Followers",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                    ))
            }
            Column {
                Text(text = "714",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                    ))
                Text(text = "Following",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                    ))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBody() {
        LoginBody(innerPadding = PaddingValues(0.dp))
}
