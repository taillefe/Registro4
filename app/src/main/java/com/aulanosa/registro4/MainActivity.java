package com.aulanosa.registro4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button botonRegistro = findViewById(R.id.btnConfirmar);
        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "REGISTRATE !!!",
                        Toast.LENGTH_SHORT).show();
                Intent cambioVentana;
                cambioVentana = new Intent(MainActivity.this,PantRegistro.class);
                startActivity(cambioVentana);

            }
        });
        final EditText txtFinalNombre = (EditText)findViewById(R.id.txtEdNombre);
        final EditText txtFinalApellidos = (EditText)findViewById(R.id.txtEdApellidos);
        TextView txtContraseña = (TextView)findViewById(R.id.txtContraseña);
        TextView txtConfirmar = (TextView)findViewById(R.id.txtConfirmar);

        Bundle bundle=getIntent().getExtras();


        txtContraseña.setText("");
        txtConfirmar.setText("");
        txtFinalNombre.setText(bundle.getString("NOMBRE"));
        txtFinalApellidos.setText(bundle.getString("APELLIDOS"));


    }
}