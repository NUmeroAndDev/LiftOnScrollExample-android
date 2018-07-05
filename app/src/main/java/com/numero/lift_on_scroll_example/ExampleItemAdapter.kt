package com.numero.lift_on_scroll_example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

class ExampleItemAdapter : RecyclerView.Adapter<ExampleItemAdapter.ExampleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_item, parent, false)
        return ExampleViewHolder(view)
    }

    override fun getItemCount(): Int = 30

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
    }

    class ExampleViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    }
}