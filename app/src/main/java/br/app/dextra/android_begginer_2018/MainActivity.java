package br.app.dextra.android_begginer_2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView dextraPng = findViewById(R.id.dextra_png);

        // Mudando a visualizacao da imagem informada no xml acima
        dextraPng.setVisibility(View.VISIBLE);

        // Adicionando um evento de click na imagem
        dextraPng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clique da imagem", Toast.LENGTH_LONG).show();
            }
        });
    }
}
