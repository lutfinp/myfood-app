package com.example.tugas1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tugas1.databinding.RecyclerViewItemBinding

class Adapter: RecyclerView.Adapter<Adapter.ViewHolderCustom>() {

    private var listData = mutableListOf<RecyclerViewItemModel>()

    fun isiList(listItem: MutableList<RecyclerViewItemModel>) {
        listData.clear()
        listData.addAll(listItem)
    }

    inner class ViewHolderCustom(private val binding: RecyclerViewItemBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bindData(item: RecyclerViewItemModel) {
            with (binding) {
                Glide.with(itemView.context).load(item.gambar).into(gambarItem)
                judulItem.text = item.judul
                deskripsiItem.text = item.deskripsi
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCustom {
        return ViewHolderCustom(
            RecyclerViewItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolderCustom, position: Int) {
        holder.bindData(listData[position])
    }

    override fun getItemCount(): Int {
        return listData.size
    }

}