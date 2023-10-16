package com.example.namecard


import android.os.Bundle
import android.os.Messenger
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NameCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.background

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize().background(Color.Red)
                ) {

                }
            }
        }
    }
}

@Composable
fun GreetingProfile(){
    val image = painterResource(R.drawable.vivianti)
    Column (modifier = Modifier
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
            ){
        Image(
            painter = image,
            contentDescription = null,
            Modifier.size(90.dp)
        )
        Text("Vivianti",
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Serif)
        Text("Teknik Informatika 2021",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            color = Color.Green
        )
    }
}
@Composable
fun GreetingContact(){
    Column (modifier = Modifier
        .padding(87.dp, 50.dp),
        verticalArrangement = Arrangement.Bottom,
        ){
        Row {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = null,
                tint = Color.DarkGray,
            )
            Text(text = "0852 4016 1371",
                textAlign = TextAlign.Left,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif)

        }
        Row {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = null,
                tint = Color.DarkGray,
            )
            Text(text = "Vivianti",
                textAlign = TextAlign.Left,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif)
        }
        Row {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null,
                tint = Color.DarkGray,
            )
            Text(text = "vivianti852@gmail.com",
                textAlign = TextAlign.Left,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif)
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun NameCardPreview() {
    NameCardTheme {
        GreetingProfile()
        GreetingContact()
    }
}