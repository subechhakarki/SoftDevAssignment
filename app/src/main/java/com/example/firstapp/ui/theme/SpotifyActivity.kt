package com.example.firstapp.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.R

class SpotifyActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            SpotifyHome()
        }
    }
}

@Composable
fun SpotifyHome() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(20.dp),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                "Recently played",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    "♧",
                    color = Color.White,
                    fontSize = 28.sp
                )

                Spacer(modifier = Modifier.width(18.dp))

                Text(
                    "◷",
                    color = Color.White,
                    fontSize = 28.sp
                )

                Spacer(modifier = Modifier.width(18.dp))

                Text(
                    "⚙",
                    color = Color.White,
                    fontSize = 26.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(28.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier
                        .size(125.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Lana Del Rey",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(R.drawable.highlight1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(125.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Marvin Gaye",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.hightlight2),
                contentDescription = null,
                modifier = Modifier.size(70.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column {

                Text(
                    "#SPOTIFYWRAPPED",
                    color = Color.Gray,
                    fontSize = 12.sp
                )

                Text(
                    "Your 2021 in review",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(18.dp)
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Image(
                    painter = painterResource(R.drawable.highlight3),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(185.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Your Top Songs 2021",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Image(
                    painter = painterResource(R.drawable.hightlight4),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(185.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Your Artists Revealed",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }

        Spacer(modifier = Modifier.height(28.dp))

        Text(
            "Editor's picks",
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(14.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(18.dp)
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Image(
                    painter = painterResource(R.drawable.hightlight5),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(185.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Ed Sheeran, Big Sean,\nJuice WRLD, Post Malone",
                    color = Color.LightGray,
                    fontSize = 14.sp,
                    lineHeight = 20.sp
                )
            }

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(185.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Mitski, Tame Impala,\nGlass Animals, Charli XCX",
                    color = Color.LightGray,
                    fontSize = 14.sp,
                    lineHeight = 20.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SpotifyHomePreview() {
    SpotifyHome()
}