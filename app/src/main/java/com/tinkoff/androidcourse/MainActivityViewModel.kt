package com.tinkoff.androidcourse

import android.arch.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private val WORKERS_COUNT = 10
    val adapter: Adapter

    init {
        val data = WorkerGenerator.generateWorkers(WORKERS_COUNT)
        adapter = Adapter(data)
    }
}