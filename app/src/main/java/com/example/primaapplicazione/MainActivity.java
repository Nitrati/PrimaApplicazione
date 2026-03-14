package com.example.primaapplicazione;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //dichiarazione degli oggetti utilizzati xml -> java
    Button btnMostra;
    ImageView ImgFotoScuola;
    TextView txtMessaggio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            //qui richiamo il logout con "findViewById(R.id.btnLogout)"
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //IL CODICE NORMALE VA INERITO QUA...

        //1.inizializzazione degli oggetti
        txtMessaggio = findViewById(R.id.txtMessaggio);
        btnMostra = findViewById(R.id.btnMostra);
        ImgFotoScuola = findViewById(R.id.ImgFotoScuola);

        //2.assegnare un evento al Button
        btnMostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //variabile di appoggio per il messaggio
                String messaggio = txtMessaggio.getText().toString();





                Toast.makeText(MainActivity.this, messaggio, Toast.LENGTH_SHORT).show();
            }
        });
    }
//funzioni e metodi, vanno inseriti qui


}