package com.example.foodapp.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.foodapp.data.ProductItem
import com.example.foodapp.ui.theme.DarkColor

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

    ) {
      AsyncImage(
        model = product.image,
        contentDescription = product.name,
        modifier = Modifier.size(150.dp)
      )
      Text(
        text = "$" + product.price.toString()
      )
    }
    Row(

    ) {
      Icon(
        imageVector = Icons.Default.Star,
        contentDescription = "Stars",
        modifier = Modifier.size(10.dp),
        tint = DarkColor
      )
      Text(
        text = product.rating.toString(),
        fontSize = 10.sp
      )
      Text(
        text = product.name,
        fontSize = 10.sp
      )
    }
  }
}