package com.rojas.segactividad.paginas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.rojas.segactividad.R;

/**
 * Created by sena on 09/04/2015.
 */
public class CuartaPagina extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuarta_pagina);//enlazamos el archivo primera_pagina.xml

        findViewById(R.id.botonRegresar4).setOnClickListener((new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Toast.makeText(CuartaPagina.this, "Has regresado", Toast.LENGTH_LONG).show();
                regresar(v);

            }

        }));


    }


    public void regresar(View view) {
        finish();
    }



}
