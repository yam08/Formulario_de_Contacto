package com.example.yam.myapplication;

import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements OnClickListener {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.miBoton);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        final EditText mi_nombre = (EditText) findViewById(R.id.miNombre);
        final EditText mi_telf = (EditText) findViewById(R.id.miTelefono);
        final EditText mi_email = (EditText) findViewById(R.id.miEmail);
        final EditText mi_descripcion = (EditText) findViewById(R.id.miDescripcion);

        Bundle bundle = new Bundle();

        bundle.putString("nombre", mi_nombre.getText().toString());
        bundle.putString("telefono", mi_telf.getText().toString());
        bundle.putString("email", mi_email.getText().toString());
        bundle.putString("descripcion", mi_descripcion.getText().toString());


        Intent boton_siguiente = new Intent(this, Main2Activity.class);
        boton_siguiente.putExtras(bundle);
        startActivity(boton_siguiente);

}



    }


