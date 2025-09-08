package com.example.foodapp

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.foodapp.Components.BrandRow
import com.example.foodapp.Components.CategoryRow
import com.example.foodapp.data.BrandList
import com.example.foodapp.data.CategoryList
import com.example.foodapp.ui.theme.BackgroundColor
import com.example.foodapp.ui.theme.DarkColor
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.ui.theme.LightColor
import com.example.foodapp.ui.theme.PrimaryColor


class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      FoodAppTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
          HomeScreen(
            innerPadding
          )
        }
      }
    }
  }
}

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
  // Screen
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(BackgroundColor)
      .padding(innerPadding)
      .padding(horizontal = 12.dp)
  ) {

    Header()

    Text(
      text = "Nuestras categorias",
      fontWeight = FontWeight.Bold,
      fontSize = 24.sp,
      color = PrimaryColor
    )

    CategoryRow(categories = CategoryList)

    Text(
      text = "Busca los mejores restaurantes",
      fontWeight = FontWeight.Bold,
      fontSize = 24.sp,
      color = PrimaryColor
    )

    BrandRow(brands = BrandList)

    Text(
      text = "Nuestras mejores comidas",
      fontWeight = FontWeight.Bold,
      fontSize = 24.sp,
      color = PrimaryColor
    )
  }
}

@Composable
fun Header() {
  Row(
    modifier = Modifier
      .fillMaxWidth()
      .padding(bottom = 8.dp),
    verticalAlignment = Alignment.CenterVertically,
  ) {

    // Avatar
    Box(
      modifier = Modifier
        .size(50.dp)
        .clip(CircleShape)
        .background(PrimaryColor),
      contentAlignment = Alignment.Center
    ) {
      Icon(
        imageVector = Icons.Default.AccountCircle,
        contentDescription = "Account",
        modifier = Modifier.size(40.dp),
        tint = BackgroundColor
      )
    }

    // Name and Welcome
    Column(
      modifier = Modifier
        .padding(start = 8.dp)
        .weight(2f)
    ) {
      Text(
        text = "Hola, Cesar",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = DarkColor
      )
      Text(
        text = "Bienvenido",
        fontSize = 14.sp,
        color = LightColor
      )
    }

    // Exit
    Icon(
      imageVector = Icons.Default.ExitToApp,
      contentDescription = "Exit to App",
      tint = PrimaryColor,
      modifier = Modifier.size(30.dp)
    )
  }
}


@Preview(
  showBackground = true,
  showSystemUi = true
)
@Composable
fun FoodAppPreview() {
  FoodAppTheme {
    HomeScreen(
      innerPadding = PaddingValues(top = 25.dp)
    )
  }
}