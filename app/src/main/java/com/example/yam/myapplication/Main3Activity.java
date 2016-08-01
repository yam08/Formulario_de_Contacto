package com.example.yam.myapplication;

import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by Yam on 01/08/2016.
 */
public class Main3Activity extends Main2Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText mi_nombre =(EditText) findViewById(R.id.miNombre3);
        EditText mi_telf =(EditText)findViewById(R.id.miTelefono3);
        EditText mi_email =(EditText)findViewById(R.id.miEmail3);
        EditText mi_descripcion =(EditText)findViewById(R.id.miDescripcion3);

        Bundle bundle = getIntent().getExtras();

        mi_nombre.setText(bundle.getString("nombre"));
        mi_telf.setText(bundle.getString("telefono"));
        mi_email.setText(bundle.getString("email"));
        mi_descripcion.setText(bundle.getString("descripcion"));



    }


}
