package com.example.yam.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

 public class Main2Activity extends MainActivity implements OnClickListener {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button button1 = (Button) findViewById(R.id.editar_datos);
        button1.setOnClickListener(this);

        EditText mi_nombre =(EditText) findViewById(R.id.recmiNombre);
        EditText mi_telf =(EditText)findViewById(R.id.recmiTelf);
        EditText mi_email =(EditText)findViewById(R.id.recmiEmail);
        EditText mi_descripcion =(EditText)findViewById(R.id.recmiDescri);

        Bundle bundle = getIntent().getExtras();

        mi_nombre.setText(bundle.getString("nombre"));
        mi_telf.setText(bundle.getString("telefono"));
        mi_email.setText(bundle.getString("email"));
        mi_descripcion.setText(bundle.getString("descripcion"));

    }

        @Override
        public void onClick(View v) {

            final EditText mi_nombre = (EditText)findViewById(R.id.recmiNombre);
            final EditText mi_telf = (EditText)findViewById(R.id.recmiTelf);
            final EditText mi_email = (EditText)findViewById(R.id.recmiEmail);
            final EditText mi_descripcion = (EditText)findViewById(R.id.recmiDescri);

            Bundle bundle = new Bundle();

            bundle.putString("nombre",mi_nombre.getText().toString());
            bundle.putString("telefono",mi_telf.getText().toString());
            bundle.putString("email",mi_email.getText().toString());
            bundle.putString("descripcion",mi_descripcion.getText().toString());

            Intent editar_datos= new Intent(this,Main3Activity.class);
            editar_datos.putExtras(bundle);
            startActivity(editar_datos);

        }




}




