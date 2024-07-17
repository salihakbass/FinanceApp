package com.salihakbas.financeapp.adapter

import android.content.Context
import android.icu.text.DecimalFormat
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.salihakbas.financeapp.databinding.ViewholderItemsBinding
import com.salihakbas.financeapp.domain.ExpanseDomain

class ExpanseListAdapter(private val items: MutableList<ExpanseDomain>) :
    RecyclerView.Adapter<ExpanseListAdapter.ViewHolder>() {
    class ViewHolder(val binding: ViewholderItemsBinding) : RecyclerView.ViewHolder(binding.root)

    private lateinit var context: Context
    var formatter: DecimalFormat? = null
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExpanseListAdapter.ViewHolder {
        context = parent.context
        formatter = DecimalFormat("###,###,###,##")
        val binding = ViewholderItemsBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExpanseListAdapter.ViewHolder, position: Int) {
        val item = items[position]

        holder.binding.tvTitle.text = item.title
        holder.binding.tvPrice.text = "$" + formatter?.format(item.price)
        holder.binding.tvTime.text = item.time
        val drawableResourceId =
            holder.itemView.resources.getIdentifier(item.pic, "drawable", context.packageName)

        Glide.with(context)
            .load(drawableResourceId)
            .into(holder.binding.imgPic)
    }

    override fun getItemCount(): Int = items.size
}