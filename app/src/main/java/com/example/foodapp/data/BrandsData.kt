package com.example.foodapp.data

import com.example.foodapp.R

data class BrandItem (
  val name: String,
  val image: Int,
)

val BrandList = listOf(
  BrandItem("KFC", R.drawable.kfc_logo),
  BrandItem("Burger King", R.drawable.kfc_logo),
  BrandItem("McDonald's", R.drawable.kfc_logo),
  BrandItem("Pizza Hut", R.drawable.kfc_logo),
  BrandItem("Mizaki", R.drawable.kfc_logo),
)
