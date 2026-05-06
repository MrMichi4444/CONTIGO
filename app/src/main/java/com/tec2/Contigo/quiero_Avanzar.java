package com.tec2.Contigo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class quiero_Avanzar extends AppCompatActivity {

    TextView tvMainAction;
    TextView tvExtra1;
    TextView tvExtra2;

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

        tvMainAction = findViewById(R.id.tvMainAction);
        tvExtra1 = findViewById(R.id.tvExtra1);
        tvExtra2 = findViewById(R.id.tvExtra2);

        String[] acciones = getResources().getStringArray(R.array.acciones_principales);
        String[] extras = getResources().getStringArray(R.array.acciones_extras);

        Random random = new Random();

        String accionElegida = acciones[random.nextInt(acciones.length)];
        String extra1 = extras[0];
        String extra2 = extras[1];

        tvMainAction.setText(accionElegida);
        tvExtra1.setText(extra1);
        tvExtra2.setText(extra2);

    }
}