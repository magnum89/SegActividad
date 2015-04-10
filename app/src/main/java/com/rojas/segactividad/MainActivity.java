package com.rojas.segactividad;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.rojas.segactividad.paginas.CuartaPagina;
import com.rojas.segactividad.paginas.PrimeraPagina;
import com.rojas.segactividad.paginas.SegundaPagina;
import com.rojas.segactividad.paginas.TerceraPagina;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button01).setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Presione el boton 1", Toast.LENGTH_LONG).show();
                lanzarPaginaUno(v);

            }

        }));

        findViewById(R.id.button02).setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Presione el boton 2", Toast.LENGTH_LONG).show();
                lanzarPaginaDos(v);

            }

        }));

        findViewById(R.id.button03).setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Presione el boton 3", Toast.LENGTH_LONG).show();
                lanzarPaginaTres(v);

            }

        }));

        findViewById(R.id.button04).setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Presione el boton 4", Toast.LENGTH_LONG).show();
                lanzarPaginaCuatro(v);

            }

        }));




    }

    public void lanzarPaginaUno (View view){
        Intent pagUno = new Intent(this, PrimeraPagina.class);
        startActivity(pagUno);
    }

    public void lanzarPaginaDos (View view){
        Intent pagDos = new Intent(this, SegundaPagina.class);
        startActivity(pagDos);
    }

    public void lanzarPaginaTres (View view){
        Intent pagTres = new Intent(this, TerceraPagina.class);
        startActivity(pagTres);
    }

    public void lanzarPaginaCuatro (View view){
        Intent pagCuatro = new Intent(this, CuartaPagina.class);
        startActivity(pagCuatro);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
