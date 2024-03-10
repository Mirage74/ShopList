package com.example.shoplist.domain

import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}