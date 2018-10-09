package com.tinkoff.androidcourse

import android.content.res.Resources
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.tinkoff.androidcourse.TouchHelper.ItemTouchHelperAdapter

class Adapter(val data: MutableList<Worker>) : RecyclerView.Adapter<Adapter.ViewHolder>(), ItemTouchHelperAdapter {
    val startPosition = 0

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val name = v.findViewById<TextView>(R.id.name)
        val position = v.findViewById<TextView>(R.id.position)
        val image = v.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val layout = LayoutInflater.from(p0.context).inflate(R.layout.adapter_item, p0, false)
        return ViewHolder(layout)
    }


    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.name.text = data[p1].name
        p0.position.text = data[p1].position
        p0.image.setImageResource(data[p1].photo)
    }


    override fun getItemCount(): Int {
        return data.size
    }

    /**Добавление нового объекта в начало списка*/
    fun addItem(worker: Worker) {
        data.add(startPosition, worker)
        notifyItemInserted(startPosition)
    }

    override fun onItemMove(positionFrom: Int, positionTo: Int) {
        data[positionFrom] = data[positionTo].also { data[positionTo] = data[positionFrom] }
        notifyItemMoved(positionFrom, positionTo)
    }

    override fun onItemDismiss(position: Int) {
        data.removeAt(position)
        notifyItemRemoved(position)
    }
}