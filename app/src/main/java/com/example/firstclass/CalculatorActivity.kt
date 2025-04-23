package com.example.firstclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstclass.ui.theme.FirstClassTheme

class CalculatorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                CalculatorBody(innerPadding)
            }
        }
    }
}

@Composable
fun CalculatorBody(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(innerPadding)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(R.drawable.baseline_table_rows_24),
                contentDescription = null
            )
            Text(
                text = "Standard", style = TextStyle(
                    fontSize = 20.sp
                )
            )
            Icon(
                painter = painterResource(R.drawable.baseline_settings_24),
                contentDescription = null
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(10.dp)
                .clip(
                    shape = RoundedCornerShape(20.dp)
                )
                .background(color = Color(68, 65, 65, 255)),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End

        ) {
            Text(
                text = "404 * 20=",
                modifier = Modifier.padding(10.dp, 0.dp),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 15.sp
                )
            )
            Text(
                text = "8080",
                modifier = Modifier.padding(10.dp),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp

                )
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(41, 120, 182, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "C",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(41, 120, 182, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "()",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(41, 120, 182, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "%",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(41, 120, 182, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "/",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "1",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "2",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "3",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(41, 120, 182, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "*",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "4",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "5",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "6",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(41, 120, 182, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "-",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "7",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "8",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "9",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(41, 120, 182, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "+",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = "0",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Text(
                        text = ".",
                        fontSize = 36.sp,
                        color = Color.White,
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(93, 93, 98, 255))
                        .padding(30.dp, 15.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.cancel),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier
                            .height(40.dp)
                            .width(30.dp)
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(100.dp))
                        .background(color = Color(41, 120, 182, 255))
                        .padding(30.dp, 15.dp)
                )
                {
                    Text(
                        text = "=",
                        fontSize = 36.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    FirstClassTheme {
        CalculatorBody(innerPadding = PaddingValues(0.dp))
    }
}