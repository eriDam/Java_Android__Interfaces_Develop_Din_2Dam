package com.example.act2cmenus;

/**
 * @author Eri
 * Actividad 2c Menús en android
 * */

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/**textVnotes,box,camera...son los identificadores para asociar el menu contextual,
		 mediante su id*/
		TextView tvcNotes = (TextView) findViewById(R.id.textVnotes);
		TextView tvcBox = (TextView) findViewById(R.id.textVbox);
		TextView tvcCam = (TextView) findViewById(R.id.textVcam);
		TextView tvcCalc = (TextView) findViewById(R.id.textVcalc);
		TextView tvcFile = (TextView) findViewById(R.id.textVfile);
		TextView tvcStadist = (TextView) findViewById(R.id.textVstadist);
		/**
		 * Asociamos el contextMenu(menú contextual) a los view(ibtn, etc..), 
		 * */	
		registerForContextMenu(tvcNotes);
		registerForContextMenu(tvcBox);
		registerForContextMenu(tvcCam);
		registerForContextMenu(tvcCalc);
		registerForContextMenu(tvcFile);
		registerForContextMenu(tvcStadist);
	
	
	}
	/** Esta función es para crear el menu de opciones, utilizamos el inflater para instanciar
	 * ficheros xml de menús en objetos de menús, por parametro el xml donde esta definido el menu (el options menu)
	 * */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	/**
	 * Esta función es para definir el comportamiento cuando este seleccionado cada una de las opciones
	 * */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.notes:
			Toast.makeText(getApplicationContext(), "OptionsMenu Notas",
					Toast.LENGTH_SHORT).show();
			return true;
	 
		case R.id.box:
			Toast.makeText(getApplicationContext(), "OptionsMenu Caja",
					Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.camera:
			Toast.makeText(getApplicationContext(), "OptionsMenu Cámara",
					Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.cal:
			Toast.makeText(getApplicationContext(), "OptionsMenu Calculadora",
					Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.nfile:
			Toast.makeText(getApplicationContext(), "OptionsMenu Nuevo archivo",
					Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.stadist:
			Toast.makeText(getApplicationContext(), "OptionsMenu Estadísticas",
					Toast.LENGTH_SHORT).show();
			return true;
			
		default:
			return false;
		}
	}
	
	/**Cuando pulsamos el Textview , nos saldrá un mensaje del context menu
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
	
	/**Cuando el item esté seleccionado, mostrará  un mensaje a parte de sus submenús*/
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.context_notes:
			Toast.makeText(getApplicationContext(), "ContextMenu Notas",
					Toast.LENGTH_SHORT).show();
			return true;
		case R.id.context_box:
			Toast.makeText(getApplicationContext(), "ContextMenu caja",
					Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.context_camera:
			Toast.makeText(getApplicationContext(), "ContextMenu Cámara",
					Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.context_cal:
			Toast.makeText(getApplicationContext(), "ContextMenu Calculadora",
					Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.context_nfile:
			Toast.makeText(getApplicationContext(), "ContextMenu Nuevo archivo",
					Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.context_stadist:
			Toast.makeText(getApplicationContext(), "ContextMenu Estadísticas",
					Toast.LENGTH_SHORT).show();
			return true;
		}
		return false;
	}
}

  