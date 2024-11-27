package com.example.offlineimagenes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.offlineimagenes.ui.theme.OffLineImagenesTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OffLineImagenesTheme {
                Scaffold(
                    topBar = { Top() },
                    content = { paddingValues ->
                        ImageCards(Modifier.padding(paddingValues))
                    }
                )
            }
        }
    }
}

val listilladeimagenes = listOf(
    R.drawable._802922_57823450_2560_1440,
    R.drawable.images,
    R.drawable.emahhxdwmaesscu,
    R.drawable.images__1_,
    R.drawable._1e5d0cbb18c818d17da7d354f3dd6d7
)

@Composable
fun ImageCards(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(25.dp)
    ) {
        items(listilladeimagenes) { listilladeimagenes ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Red,
                    contentColor = Color.White),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(15.dp)
                ) {
                    Image(
                        painter = painterResource(listilladeimagenes),
                        contentDescription = "Best of Nicaragua",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                    )
                    Text(
                        text = "Real de Madriz ${Random.nextInt(10)}",
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Top() {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White
        ),
        title = { Text("El MEJOR EQUIPO DE NICARAGUA") }
    )
}

