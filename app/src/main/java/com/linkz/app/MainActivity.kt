package com.linkz.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Background = Color(0xFF090D0B)
private val SurfaceDark = Color(0xFF151C18)
private val Emerald = Color(0xFF19D47B)
private val TextPrimary = Color(0xFFF3F7F4)
private val TextMuted = Color(0xFF91A198)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LinkZApp()
        }
    }
}

@Composable
fun LinkZApp() {
    var url by remember { mutableStateOf("") }

    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Emerald,
            background = Background,
            surface = SurfaceDark,
            onPrimary = Color.Black,
            onBackground = TextPrimary,
            onSurface = TextPrimary
        )
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp, vertical = 28.dp)
            ) {
                Text(
                    text = "LinkZ",
                    color = Emerald,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "One Link. One Tap. Direct Download.",
                    color = TextMuted,
                    fontSize = 13.sp
                )

                Spacer(modifier = Modifier.height(56.dp))

                Text(
                    text = "Link Resolver",
                    color = TextPrimary,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Tempel tautan untuk memeriksa tujuan akhirnya.",
                    color = TextMuted,
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                OutlinedTextField(
                    value = url,
                    onValueChange = { url = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text("https://example.com/...")
                    },
                    shape = RoundedCornerShape(16.dp),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Emerald,
                        unfocusedBorderColor = Color(0xFF34443A),
                        focusedTextColor = TextPrimary,
                        unfocusedTextColor = TextPrimary,
                        cursorColor = Emerald
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { },
                    enabled = false,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(54.dp),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text("Resolver sedang disiapkan")
                }

                Spacer(modifier = Modifier.height(18.dp))

                Text(
                    text = "Engine resolver dan downloader akan diintegrasikan " +
                        "setelah fondasi aplikasi lolos build.",
                    color = TextMuted,
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = "LINKZ  •  VERSION 1.0.0",
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    color = TextMuted,
                    fontSize = 11.sp
                )
            }
        }
    }
}
