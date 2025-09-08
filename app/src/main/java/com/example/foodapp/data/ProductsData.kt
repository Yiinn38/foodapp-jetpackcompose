package com.example.foodapp.data

import com.example.foodapp.R

data class ProductItem (
  val product: String,
  val image: Int,
  val price: Int,
  val rating: Double,
)

val ProductList = listOf(
  ProductItem("KFC Bucket", R.drawable.kfc_bucket, 250, 4.5),
  ProductItem("KFC Hot Wings", R.drawable.kfc_bucket, 120, 4.2),

  ProductItem("BK Whopper", R.drawable.kfc_bucket, 180, 4.3),
  ProductItem("BK Fries", R.drawable.kfc_bucket, 60, 4.0),

  ProductItem("McDo Big Mac", R.drawable.kfc_bucket, 150, 4.4),
  ProductItem("McDo McFlurry", R.drawable.kfc_bucket, 70, 4.1),

  ProductItem("Pizza Hut Pepperoni", R.drawable.kfc_bucket, 220, 4.6),
  ProductItem("Pizza Hut Cheese Burst", R.drawable.kfc_bucket, 240, 4.7),

  ProductItem("Mizaki Sushi Roll", R.drawable.kfc_bucket, 200, 4.5)
)
