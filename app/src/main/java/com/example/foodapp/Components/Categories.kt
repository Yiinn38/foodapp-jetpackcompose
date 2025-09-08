package com.example.foodapp.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.foundation.lazy.LazyRow
import com.example.foodapp.data.CategoryItems
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.foodapp.ui.theme.PrimaryColor

@Composable
fun CategoryRow(categories: List<CategoryItems>) {
  LazyRow(
    horizontalArrangement = Arrangement.spacedBy(20.dp)
  ) {
    items(categories) { category ->
      CategoriesCard(category)
    }
  }
}

@Composable
fun CategoriesCard(category: CategoryItems) {
  Column(
    modifier = Modifier.padding(vertical = 8.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Box(
      modifier = Modifier
        .size(100.dp)
        .clip(CircleShape)
        .background(PrimaryColor),
      contentAlignment = Alignment.Center
    ){
      AsyncImage(
        model = category.image,
        contentDescription = category.name,
        modifier = Modifier.padding(8.dp)
      )
    }
    Text(
      text = category.name,
      fontWeight = FontWeight.Bold,
      color = PrimaryColor
    )
  }
}