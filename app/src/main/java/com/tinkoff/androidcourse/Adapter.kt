package com.tinkoff.androidcourse

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class Adapter(val data: List<Worker>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getItemCount(): Int {
        return data.size
    }

    /**
     * Добавление нового объекта в конец списка
     * */
    fun addItem(worker: Worker) {

    }
}