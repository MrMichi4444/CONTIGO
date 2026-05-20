package com.tec2.Contigo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tec2.Contigo.view.MainActivity;

import java.util.Random;

public class quiero_Avanzar extends AppCompatActivity {

    TextView TV_Principal;
    TextView TV_Extra_1;
    TextView TV_Extra_2;
    ImageButton B_Retorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiero_avanzar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TV_Principal = findViewById(R.id.TV_Principal);
        TV_Extra_1 = findViewById(R.id.TV_Extra_1);
        TV_Extra_2 = findViewById(R.id.TV_Extra_2);
        B_Retorno = findViewById(R.id.B_Regresar);

        String[] acciones = getResources().getStringArray(R.array.acciones_principales);
        String[] extras = getResources().getStringArray(R.array.acciones_extras);

        Random random = new Random();

        String accionElegida = acciones[random.nextInt(acciones.length)];
        String extra1 = extras[0];
        String extra2 = extras[1];

        TV_Principal.setText(accionElegida);
        TV_Extra_1.setText(extra1);
        TV_Extra_2.setText(extra2);

        B_Retorno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intencion = new Intent(quiero_Avanzar.this, MainActivity.class);
                startActivity(Intencion);
            }
        });
    }
}