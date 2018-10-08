package com.tinkoff.androidcourse

import android.arch.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val adapter: Adapter

    init {
        adapter = Adapter()
    }


}