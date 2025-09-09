package com.example.foodapp.data

import com.example.foodapp.R

data class CategoryItems (
  val name: String,
  val image: Int
)

val CategoryList = listOf(
  CategoryItems("Fast Food", R.drawable.fastfood_category),
  CategoryItems("Sushi", R.drawable.sushi_category),
  CategoryItems("Pizza", R.drawable.pizza_category),
  CategoryItems("Bebida", R.drawable.drink_category),
  CategoryItems("Farmacia", R.drawable.pharmacy_category)
)