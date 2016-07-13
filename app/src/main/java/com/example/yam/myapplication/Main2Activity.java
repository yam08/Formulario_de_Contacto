package com.example.yam.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tx_nombre =(TextView)findViewById(R.id.miNombre);
        TextView tx_telf =(TextView)findViewById(R.id.miTelefono);
        TextView tx_email =(TextView)findViewById(R.id.miEmail);
        TextView tx_descripcion =(TextView)findViewById(R.id.miDescripcion);

        Bundle bundle = this.getIntent().getExtras();

        tx_nombre.setText(bundle.getString("nombre"));
        tx_telf.setText(bundle.getString("telefono"));
        tx_email.setText(bundle.getString("email"));
        tx_descripcion.setText(bundle.getString("descripcion"));
    }






}
