package com.tinkoff.androidcourse.TouchHelper

interface ItemTouchHelperAdapter {
    /**
     * Переместить элемент
     * @param positionFrom - старая позиция элемента
     * @param positionTo - новая позиция элемента
     * */
    fun onItemMove(positionFrom: Int, positionTo: Int)

    /**
     * Удалить элемент
     * @param position - позиция элемента на удаление
     * */
    fun onItemDismiss(position: Int)
}