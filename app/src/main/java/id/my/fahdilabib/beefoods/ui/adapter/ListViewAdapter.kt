package id.my.fahdilabib.beefoods.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.my.fahdilabib.beefoods.R
import id.my.fahdilabib.beefoods.core.Food
import id.my.fahdilabib.beefoods.databinding.ItemFoodRowBinding
import id.my.fahdilabib.beefoods.utils.Helper

class FoodViewHolder : RecyclerView.Adapter<FoodViewHolder.ListViewHolder>() {

    var onItemClick: ((Food) -> Unit)? = null
    var listData = ArrayList<Food>()
        set(value) {
            listData.clear()
            listData.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_food_row,
                parent,
                false
            )
        )

    override fun getItemCount() = listData.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemFoodRowBinding.bind(itemView)

        fun bind(data: Food) {
            with(binding) {
                Helper.applyImage(data.img, itemView.context, ivItemImg)

                tvItemName.text = data.name
                tvItemPrice.text = Helper.rupiah(data.price.toDouble())
            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[adapterPosition])
            }
        }
    }
}
