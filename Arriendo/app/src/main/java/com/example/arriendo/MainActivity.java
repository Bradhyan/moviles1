package com.example.arriendo;

import static android.os.Build.VERSION_CODES.R;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText jethabitaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //oculto barra de titulo

        getSupportActionBar().hide();

        //Asociar objetos java y xml
        jethabitaciones = findViewById(R.id.ethabitaciones);

    }
}