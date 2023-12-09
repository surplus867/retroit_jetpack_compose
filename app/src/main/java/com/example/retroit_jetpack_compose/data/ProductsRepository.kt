package com.example.retroit_jetpack_compose.data

import com.example.retroit_jetpack_compose.data.model.Product
import kotlinx.coroutines.flow.Flow


interface ProductsRepository {
   suspend fun getProductsList(): Flow<Result<List<Product>>>
}