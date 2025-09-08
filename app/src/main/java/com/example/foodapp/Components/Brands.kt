package com.example.foodapp.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.foodapp.data.BrandItem
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import com.example.foodapp.ui.theme.PrimaryColor

@Composable
fun BrandRow(brands: List<BrandItem>) {
  LazyRow(
    horizontalArrangement = Arrangement.spacedBy(20.dp)
  ) {
    items(brands) { brand ->
      BrandsCard(brand)
    }
  }
}

@Composable
fun BrandsCard(brand: BrandItem) {
  Column(
    modifier = Modifier.padding(vertical = 8.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Box(
      modifier = Modifier
        .size(100.dp)
        .clip(CircleShape),
      contentAlignment = Alignment.Center
    ) {
      AsyncImage(
        model = brand.image,
        contentDescription = brand.name,
        modifier = Modifier.size(100.dp)
      )
    }
    Text(
      text = brand.name,
      fontWeight = FontWeight.Bold,
      color = PrimaryColor
    )
  }

}
