package com.example.firstapp

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.FirstAppTheme


class InstaProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()

        }
    }
}

@Composable
fun ProfileBody(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.outline_arrow_back_ios_new_24),
                contentDescription = null
            )
            Text("subu.karki", style = TextStyle(
                    fontSize = 21.sp,
                fontWeight = FontWeight.Bold))
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = null,
                modifier = Modifier.clip(CircleShape).height(85.dp).width(85.dp),
                contentScale = ContentScale.Crop
            )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("23", style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold))
                    Text("Posts", style = TextStyle(
                        fontSize = 16.sp))
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("234", style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold))
                    Text("Followers", style = TextStyle(
                        fontSize = 16.sp))
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("223", style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold))

                    Text("Followings", style = TextStyle(
                        fontSize = 16.sp))
                }



        }
        Column(
            modifier = Modifier.padding(start = 30.dp, top = 8.dp)
        ) {
            Text("Subu Karki", style =  TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold))
            Text("Artist", fontWeight = FontWeight.Light)
            Text(
                buildAnnotatedString {
                    append("writer of poops. ")
                    withStyle(style = SpanStyle(color = Color.Blue)) {
                        append("@queensstudio ")
                    }
                    append("[STREAM MAD QUEEN]")
                }
            )
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Blue)) {
                        append("ffm.to/mad_qveen_cruella")}
                }
            )
            Text("")
            Text(
                buildAnnotatedString {
                    append("Followed by ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("ellamayoreally, smads_ ")
                    }
                    append("and ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("1 other")
                    }
                }
            )


        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ElevatedButton(onClick = {},
                modifier = Modifier.weight(2f).padding(end=4.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
                    ) {
                Text("Follow")
            }
            ElevatedButton(onClick = {},
                modifier = Modifier.weight(2f).padding(end=4.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.Black
                )) {
                Text("Message")
            }
            ElevatedButton(onClick = {},
                modifier = Modifier.weight(1f).padding(end=4.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.Black
                )) {
                Icon(
                    painter = painterResource(R.drawable.outline_person_add_24),
                    contentDescription = null
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.highlight1),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).height(60.dp).width(60.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Story 1")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.hightlight5),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).height(60.dp).width(60.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Story 2")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.hightlight2),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).height(60.dp).width(60.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Story 3")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.highlight3),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).height(60.dp).width(60.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Story 4")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.hightlight4),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).height(60.dp).width(60.dp),
                    contentScale = ContentScale.Crop
                )
                Text("Story 5")
            }

        }


    }
}
@Preview
@Composable
fun ProfilePreview(){
    ProfileBody()
}

