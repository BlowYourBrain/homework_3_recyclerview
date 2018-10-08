package com.tinkoff.androidcourse;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		MainActivityViewModel model = ViewModelProviders.of(this).get(MainActivityViewModel.class);


		RecyclerView recyclerView = findViewById(R.id.recyclerView);
		setupRecyclerView(recyclerView, model.getAdapter());


		FloatingActionButton fab = findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				/**
				 * Реализовать добавление тестовых работников
				 */
			}
		});


		/**
		 * Реализовать адаптер, выбрать любой LayoutManager и прикрутить это всё к RecyclerView
		 *
		 * Тестовые данные для отображения генерятся WorkerGenerator
		 */
	}


	private void setupRecyclerView(RecyclerView recyclerView, Adapter adapter) {

	}
}
