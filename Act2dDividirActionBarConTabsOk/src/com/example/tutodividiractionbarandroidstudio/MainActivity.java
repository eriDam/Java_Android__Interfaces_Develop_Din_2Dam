package com.example.tutodividiractionbarandroidstudio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends ActionBarActivity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);/**Lo relacionamos con el layout*/
      //TabHost res = getTabHost();
    	Resources res = getResources();
    	/** Creo una variable de tipo TabHOst y hago referencia al control principal mediante su id tabhost*/
    	TabHost tabs = (TabHost)findViewById(android.R.id.tabhost);
    	tabs.setup();/**preparandolo para su configuracion con su metodo setup */
    	
    	/**Añadimos las pestañas mediante el metodo newTabSpec*/
    	TabHost.TabSpec spec = tabs.newTabSpec("Mi tab1");
    	spec.setContent(R.id.tab1);/**Asignamos al layout del contenido correspondiente*/
    	spec.setIndicator("Mi tab1",res.getDrawable(R.drawable.ic_folder_public));
    	tabs.addTab(spec);
    	/**Añadimos la  pestaña 2 mediante el metodo newTabSpec*/
    	spec=tabs.newTabSpec("Mi tab2");
    	spec.setContent(R.id.tab2);/**Asignamos al layout del contenido correspondiente*/
    	/**Damos un nombre y pintamos un icono o nombre o icono en versiones antiguas los dos*/
    	spec.setIndicator("", res.getDrawable(R.drawable.ic_folder_private));
    	tabs.addTab(spec);
    	tabs.setCurrentTab(0);
    	}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main2, menu);/**Lo relacionamos con el menu llamado main2*/
        return true;
    }
    
    /**Cuando seleccionemos un item del menu, mostrará un mensaje, dependiendo del id que me devuelva line 28, 
     * van a haber muchos case*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_buscar: /**Este Id  hace referencia al id del item del menu, en este caso buscar*/
                Toast.makeText(getApplicationContext(), "BUSCAR", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_cortar:
                Toast.makeText(getApplicationContext(), "CORTAR", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_copiar:
                Toast.makeText(getApplicationContext(), "COPIAR", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_eliminar:
                Toast.makeText(getApplicationContext(), "ELIMINAR", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_compartir:
                Toast.makeText(getApplicationContext(), "COMPARTIR", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}