package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WeatherPage()
                }
            }
        }
    }
}



@Composable
fun WeatherPage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 35.dp, start = 26.dp, end = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){}

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 65.dp, start = 58.dp, end = 10.dp),


    ){}

}

@Composable
fun HeaderImage() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.ocean),
            contentDescription = null,
            modifier = Modifier
                .width(400.dp)
                .height(500.dp)
            ,contentScale = ContentScale.Crop,

            )
        Text(
            text = "28",
            color = Color.White,
            modifier = Modifier
                .padding(top = 54.dp, start = 58.dp),
            fontSize = 54.sp,
            fontWeight = FontWeight.Bold,
        )
        Icon(
            painter = painterResource(R.drawable.baseline_menu_24),
            contentDescription = null, tint = Color.White,
            modifier = Modifier.padding(17.dp)
        )
        Text(

            text = "LAHORE",
            color = Color.White,
            modifier = Modifier
                .padding(top = 23.dp, start = 65.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
    }
    Column(
        modifier = Modifier
            .padding(top = 76.dp)
    ) {
        Text(text = "°C ", fontWeight = FontWeight.Bold,color = Color.White,
            modifier = Modifier
                .padding(start = 125.dp)
        )
        Text (
            text = "Sunny", fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(start = 124.dp)

            )
    }

    Column (modifier = Modifier
        .padding(top = 78.dp, start = 275.dp)
    )
    {
        Text(
            text = "13 FEB,SAT",
            fontWeight = FontWeight.Bold,color = Color.White
        )
        Text(
            text =" 02:00 PM",
            fontWeight = FontWeight.Bold,
            color = Color.Red

        )
    }
    Column(
        modifier = Modifier
            .padding(start = 300.dp)

    ){
        Icon(
            painter = painterResource(R.drawable.baseline_search_24),
            contentDescription = null, tint = Color.White,
            modifier = Modifier.padding(17.dp)
        )
    }
}


@Composable
fun WeeklyForecastScreen() {
     Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .padding(top = 520.dp),
    ){
        Text(text = "SAT ", fontWeight = FontWeight.Bold, color = Color.Red)
         Icon(
             painter = painterResource(R.drawable.outline_cloud_24),
             contentDescription = null,
             tint = Color.Red )
        Text(text = " 28°C", color = Color.Red)
        
     }
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .padding(top = 520.dp, start = 70.dp),
    )
     {
         Text(text = "SUN ", fontWeight = FontWeight.Bold)
         Icon(
             painter = painterResource(R.drawable.outline_cloud_24),
             contentDescription = null)
         Text(text = " 31°C")

     }
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .padding(top = 520.dp, start = 150.dp),
    )
    {
        Text(text = "MON ", fontWeight = FontWeight.Bold)
        Icon(
            painter = painterResource(R.drawable.outline_cloud_24),
            contentDescription = null)
        Text(text = " 31°C")

    }

        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .padding(top = 520.dp, start = 230.dp),
        )
        {
            Text(text = "TUE ", fontWeight = FontWeight.Bold)
            Icon(
                painter = painterResource(R.drawable.outline_cloud_24),
                contentDescription = null)
            Text(text = " 32°C")

        }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .padding(top = 520.dp, start = 300.dp),
    )
    {
        Text(text = "WED ", fontWeight = FontWeight.Bold)
        Icon(
            painter = painterResource(R.drawable.outline_cloud_24),
            contentDescription = null)
        Text(text = " 32°C")

    }

}


@Preview(showBackground = true, widthDp = 398, heightDp = 700)
@Composable
fun WeatherPreview() {
    WeatherAppTheme {
        WeatherPage()
        HeaderImage()
        WeeklyForecastScreen()

    }
}