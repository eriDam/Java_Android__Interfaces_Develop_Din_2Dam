package com.example.videoejjuanmimenus;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/**text_view es el identificador para asociar el menu contextual,
		 si fuera un imageButton utilizariamos su id igual*/
		TextView tv = (TextView) findViewById(R.id.text_view);
		/**
		 * Asociamos el contextMenu(menú contextual) al view(tv), 
		 * */
		registerForContextMenu(tv);
	}
	/** Esta función es para crear el menu de opciones, utilizamos el inflater para instanciar
	 * ficheros xml de menús en objetos de menús, por parametro el xml donde esta definido el menu (el options menu)
	 * */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		getMenuInflater().inflate(R.menu.top_menu, menu);
		return true;
	}

	/**
	 * Esta función es para definir el comportamiento cuando este seleccionado cada una de las opciones
	 * */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.help:
			/** Para mostrar un mensaje utilizamos Toast*/
			Toast.makeText(getApplicationContext(), "te ayudo",
					Toast.LENGTH_SHORT).show();
			return true;
		case R.id.more_help:
			Toast.makeText(getApplicationContext(), "te ayudo más",
					Toast.LENGTH_SHORT).show();
			return true;
		case R.id.even_more_help:
			return true;
		default:
			return false;
		}
	}
	
	/**Cuando pulsamos la etiqueta(TextView), nos saldrá un mensaje del context menu
	 * procedemos de forma similar al menu del action bar (el options menu), utilizamos 
	 * el inflater para instanciar ficheros xml de menús en objetos de menús, por parametro 
	 * el xml donde esta definido el menu (el ContextMenuInfo)*/
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		/**Llamamos al metodo heredado de la clase padre*/
		super.onCreateContextMenu(menu, v, menuInfo);
		/**Crear el menú, inflar el Layout, crear la apariencia del menu*/
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.context_menu, menu);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.help_guide:
			Toast.makeText(getApplicationContext(), "ContextMenu Shown",
					Toast.LENGTH_SHORT).show();
			return true;
		default:
			return false;
		}
	}
}
