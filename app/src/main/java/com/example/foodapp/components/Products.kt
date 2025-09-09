package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.foodapp.data.ProductItem
import com.example.foodapp.ui.theme.BackgroundColor
import com.example.foodapp.ui.theme.LightColor
import com.example.foodapp.ui.theme.PrimaryColor

@Composable
fun ProductGrid(products: List<ProductItem>) {
  LazyVerticalGrid(
    modifier = Modifier.padding(top = 8.dp),
    columns = GridCells.Fixed(2),
    horizontalArrangement = Arrangement.spacedBy(10.dp)
  ) {
    items(products) { product ->
      ProductsCard(product)
    }
  }
}

@Composable
fun ProductsCard(product: ProductItem) {
  Column(
    modifier = Modifier
      .padding(bottom = 8.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Box(
      modifier = Modifier
        .height(150.dp)
    ) {
      AsyncImage(
        model = product.image,
        contentDescription = product.name,
        modifier = Modifier.size(140.dp)
      )
      Text(
        text = "$" + product.price.toString(),
        color = BackgroundColor,
        textAlign = TextAlign.Center,
        modifier = Modifier
          .width(50.dp)
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