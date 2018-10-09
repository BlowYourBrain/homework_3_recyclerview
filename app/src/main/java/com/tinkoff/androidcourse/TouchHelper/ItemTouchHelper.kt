package com.tinkoff.androidcourse.TouchHelper

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper

class ItemTouchHelper(val adapter: ItemTouchHelperAdapter) : ItemTouchHelper.Callback() {


    override fun getMovementFlags(p0: RecyclerView, p1: RecyclerView.ViewHolder): Int {
        val drag = ItemTouchHelper.UP or ItemTouchHelper.DOWN
        val swipe = ItemTouchHelper.START or ItemTouchHelper.END

        return makeMovementFlags(drag, swipe)
    }


    override fun onMove(p0: RecyclerView, p1: RecyclerView.ViewHolder, p2: RecyclerView.ViewHolder): Boolean {
        adapter.onItemMove(p1.adapterPosition, p2.adapterPosition)
        return true
    }


    override fun onSwiped(p0: RecyclerView.ViewHolder, p1: Int) = adapter.onItemDismiss(p0.adapterPosition)


    override fun isLongPressDragEnabled(): Boolean {
        //возвращает true чтобы работал Drag
        return true
    }


    override fun isItemViewSwipeEnabled(): Boolean {
        //возвращаем true чтобы работали свайпы
        return true
    }
}