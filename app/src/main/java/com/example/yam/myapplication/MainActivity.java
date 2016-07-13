package com.example.yam.myapplication;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.DatePicker;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;



public class MainActivity extends AppCompatActivity  {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void pasar_contacto(View view){

        EditText mi_nombre = (EditText)findViewById(R.id.miNombre);
        EditText mi_telf = (EditText)findViewById(R.id.miTelefono);
        EditText mi_email = (EditText)findViewById(R.id.miEmail);
        EditText mi_descripcion = (EditText)findViewById(R.id.miDescripcion);

        Bundle bundle = new Bundle();

        bundle.putString("nombre",mi_nombre.getText().toString());
        bundle.putString("telefono",mi_telf.getText().toString());
        bundle.putString("email",mi_email.getText().toString());
        bundle.putString("descripcion",mi_descripcion.getText().toString());

        Intent boton_siguiente= new Intent(getApplicationContext(), Main2Activity.class);
        boton_siguiente.putExtras(bundle);
        startActivity(boton_siguiente);
    }

}

