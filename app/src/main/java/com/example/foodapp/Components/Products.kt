package com.example.foodapp.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.foodapp.data.ProductItem
import com.example.foodapp.ui.theme.BackgroundColor
import com.example.foodapp.ui.theme.DarkColor
import com.example.foodapp.ui.theme.LightColor
import com.example.foodapp.ui.theme.PrimaryColor
import kotlinx.coroutines.sync.Mutex

@Composable
fun ProductGrid(products: List<ProductItem>) {
  LazyVerticalGrid(
    columns = GridCells.Fixed(2)
  ) {
    items(products) { product ->
      ProductsCard(product)
    }
  }
}

@Composable
fun ProductsCard(product: ProductItem) {
  Column(
    modifier = Modifier.padding(8.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Box(
      modifier = Modifier.size(150.dp)
    ) {
      AsyncImage(
        model = product.image,
        contentDescription = product.name,
        modifier = Modifier
          .fillMaxSize()
      )
      Text(
        text = "$" + product.price.toString(),
        color = BackgroundColor,
        modifier = Modifier
          .align(Alignment.BottomEnd)
          .clip(RoundedCornerShape(8.dp))
          .background(PrimaryColor)
          .padding(4.dp)
      )
    }
    Row(
      horizontalArrangement = Arrangement.Center,
      verticalAlignment = Alignment.CenterVertically
    ) {
      Icon(
        imageVector = Icons.Default.Star,
        contentDescription = "Stars",
        modifier = Modifier.size(14.dp),
        tint = LightColor
      )
      Text(
        text = product.rating.toString(),
        fontSize = 10.sp,
        color = PrimaryColor,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(end = 4.dp, top = 2.dp)
      )
      Text(
        text = product.name,
        color = PrimaryColor,
        fontSize = 10.sp,
        modifier = Modifier.padding(top = 2.dp)
      )

    }
  }
}