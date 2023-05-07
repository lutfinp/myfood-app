package com.example.tugas1

object ListItem {
    fun buatList(): MutableList<RecyclerViewItemModel>{
        val daftarItem = mutableListOf<RecyclerViewItemModel>()
        daftarItem.add(RecyclerViewItemModel(R.drawable.rendang, "Rendang", "Rendang merupakan maakanan terlezat di dunia"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.soto, "Soto", "Dengan rasa kuah yang gurih, santan yang lezat, dan daging melimpah"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.gulai, "Ayam Gulai", "Rasa rempah yang kuat merupakan kunci masakan ini"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.sate, "Sate Ayam", "Smokie yang terasa disetiap gigitan dan bumbu meresap"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.ketoprak, "Ketoprak", "Dengan berbagai topping yang melimpah dan murah"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.martabak, "Martabak", "Manis yang tak berlebihan dengan mentega melimpah"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.roti, "Roti Bakar", "Banyak varian rasa dan dapat dimix sesuka hati"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.mie, "Mie Ayam", "Mie yang kenyal, topping ayam yang melimpah"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.geprek, "Ayam Geprek", "Sambal pedas nendang membuat berkeringat"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.balado, "Ayam Balado", "Ayam yang besar dan rasa balado yang gurih sedikit pedas"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.pecel, "Pecel Ayam", "Rasa khas Sunda dalam rempah dan sambal terasi"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.baso, "Bakso", "Kuah yang gurih dan 100% daging tanpa tepung"))
        return daftarItem
    }
}