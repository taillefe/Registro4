package com.aulanosa.registro4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PantRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pant_registro);

        final EditText txtNombre = (EditText)findViewById(R.id.txtEdNombre);
        final EditText txtApellidos = (EditText)findViewById(R.id.txtEdApellidos);

        final EditText txtContraseña = (EditText)findViewById(R.id.txtEdPassword);




        final Button botonRegistro = findViewById(R.id.btnConfirmar);
        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PantRegistro.this,
                        "Registrado !!!",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent( PantRegistro.this, MainActivity.class);
                Bundle bundle =new Bundle();
                bundle.putString("NOMBRE", txtNombre.getText().toString());
                bundle.putString("APELLIDOS", txtApellidos.getText().toString());

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }
}