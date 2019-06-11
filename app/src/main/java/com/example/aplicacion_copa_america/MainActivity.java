package com.example.aplicacion_copa_america;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnEncuentros, btnFavoritos, btnJugador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEncuentros = findViewById(R.id.btnEncuentros);
        btnFavoritos = findViewById(R.id.btnFavoritos);
        btnJugador = findViewById(R.id.btnBuscarJugador);

        btnEncuentros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent encuentros = new Intent(MainActivity.this, Encuentros.class);
                startActivity(encuentros);
            }
        });

        btnJugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jugador = new Intent(MainActivity.this, Jugador.class);
                startActivity(jugador);
            }
        });
    }
}
