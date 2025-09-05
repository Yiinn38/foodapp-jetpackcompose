package com.example.foodapp.data

import com.example.foodapp.R

data class BrandItem (
  val name: String,
  val image: Int,
)

val brandList = listOf(
  BrandItem("KFC", R.drawable.kfc_logo)
)
