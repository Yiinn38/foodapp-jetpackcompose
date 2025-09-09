package com.example.foodapp.data

import com.example.foodapp.R

data class ProductItem (
  val name: String,
  val image: Int,
  val price: Int,
  val rating: Double,
)

val ProductList = listOf(
  ProductItem("KFC Cubo", R.drawable.kfc_bucket, 250, 4.5),
  ProductItem("KFC Alitas", R.drawable.kfc_hotwings, 120, 4.2),
  ProductItem("BK Whopper", R.drawable.bk_whopper, 180, 4.3),
  ProductItem("BK Papas", R.drawable.bk_fries, 60, 4.0),
  ProductItem("McDo Big Mac", R.drawable.mcdo_bigmac, 150, 4.4),
  ProductItem("McDo McFlurry", R.drawable.mcdo_flurry, 70, 4.1),
  ProductItem("Pizza Hut Pepperoni", R.drawable.ph_pepperoni, 220, 4.6),
  ProductItem("Pizza Hut Hawaiana", R.drawable.ph_hawaiana, 240, 4.7),
  ProductItem("Mizaki Sushi Roll", R.drawable.mizaki_sushiroll, 200, 4.5)
)
