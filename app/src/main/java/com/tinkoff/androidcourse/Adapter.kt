package com.tinkoff.androidcourse

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import java.util.zip.Inflater

class Adapter(val data: MutableList<Worker>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

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
        p0.name.setText(data.get(p1).name)
        p0.image.setImageResource(data.get(p1).photo)
        p0.position.setText(data.get(p1).position)
    }


    override fun getItemCount(): Int {
        return data.size
    }

    /**
     * Добавление нового объекта
     *
     * @return - позиция в которую был добавлен элемент
     * */
    fun addItem(worker: Worker): Int {
        data.add(worker)

        val position = data.size - 1
        notifyItemChanged(position)
        return position
    }
}